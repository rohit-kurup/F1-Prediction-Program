package core;
import java.util.*;

import driver.Driver;
import driver.TyreCompound;

public class Qualifying extends Race {
    private Map<Driver, Double> lapTimes; // One lap per driver
    private TyreCompound tyreCompound;

    public Qualifying(String name, int laps, double lapLength, String location, String weatherCondition, String date, TyreCompound tyreCompound) {
        super(name, laps, lapLength, location, weatherCondition, date);
        this.lapTimes = new HashMap<>();
        this.tyreCompound = tyreCompound;
    }

    public void addLapTime(Driver driver, double time) {
        lapTimes.put(driver, time);
    }

    public void simulateQualifying(List<Driver> drivers, Random rng) {
        for (Driver d : drivers) {
            double weatherFactor = d.getWeatherAdjustedSkill(getWeatherCondition());
            double baseTime = 90; // Base lap time in seconds
            double skillEffect = (1 - d.getBaseSkillLevel()) * 3; // Worse drivers are slower
            double gripEffect = (1 - tyreCompound.getGrip()) * 2;
            double randomEffect = rng.nextDouble() * 1.5;

            double lapTime = baseTime + skillEffect + gripEffect + randomEffect;
            addLapTime(d, lapTime);
        }
    }

    public List<Map.Entry<Driver, Double>> getSortedResults() {
        List<Map.Entry<Driver, Double>> sorted = new ArrayList<>(lapTimes.entrySet());
        sorted.sort(Map.Entry.comparingByValue());
        return sorted;
    }

    public void printResults() {
        List<Map.Entry<Driver, Double>> sorted = getSortedResults();
        int pos = 1;
        for (Map.Entry<Driver, Double> entry : sorted) {
            System.out.println(pos++ + ". " + entry.getKey().getName() + " - " + entry.getValue() + "s");
        }
    }
}
