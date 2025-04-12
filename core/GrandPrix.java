
import java.util.*;

import driver.Driver;
import enums.TyreCompound;

public class GrandPrix extends Race {
    private Map<Driver, Double> totalTimes;
    private Map<Driver, Integer> pitStops;
    private Map<Driver, List<TyreCompound>> tyreStrategies;

    public GrandPrix(String name, int laps, double lapLength, String location, String weatherCondition, String date) {
        super(name, laps, lapLength, location, weatherCondition, date);
        this.totalTimes = new HashMap<>();
        this.pitStops = ne HashMap<>();
        this.tyreStrategies = new HashMap<>();
    }

    public void simulateRace(List<Driver> drivers, Random rng) {
        for (Driver driver : drivers) {
            double baseLapTime = 90;
            double totalTime = 0;
            int pitStopCount = 0;
            List<TyreCompound> strategy = new ArrayList<>();

            for (int lap = 0; lap < getLaps(); lap++) {
                TyreCompound tyre = pickTyreForLap(lap);
                strategy.add(tyre);

                double weatherFactor = driver.getWeatherAdjustedSkill(getWeatherCondition());
                double skillEffect = (1 - driver.getBaseSkillLevel()) * 2;
                double gripEffect = (1 - tyre.getGrip()) * 2;
                double random = rng.nextDouble() * 1.5;

                totalTime += baseLapTime + skillEffect + gripEffect + random;

                if (rng.nextDouble() < tyre.getWearRate()) {
                    totalTime += 25; // pit stop time penalty
                    pitStopCount++;
                }
            }

            totalTimes.put(driver, totalTime);
            pitStops.put(driver, pitStopCount);
            tyreStrategies.put(driver, strategy);
        }
    }

    private TyreCompound pickTyreForLap(int lap) {
        if (lap < getLaps() / 3) return TyreCompound.SOFT;
        if (lap < (2 * getLaps() / 3)) return TyreCompound.MEDIUM;
        return TyreCompound.HARD;
    }

    public void printRaceResults() {
        totalTimes.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .forEach(entry -> {
                Driver driver = entry.getKey();
                double time = entry.getValue();
                System.out.println(driver.getName() + " - Total Time: " + String.format("%.2f", time)
                    + "s | Pit Stops: " + pitStops.get(driver));
            });
    }
}
