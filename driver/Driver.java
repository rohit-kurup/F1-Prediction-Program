package driver;
import java.util.Map;

public class Driver {
    private String name;
    private String team;
    private double baseSkillLevel; // From 0 to 1
    private Map<String, Double> performanceByWeather; // "Rainy" -> 0.85

    public Driver(String name, String team, double baseSkillLevel, Map<String, Double> performanceByWeather) {
        this.name = name;
        this.team = team;
        this.baseSkillLevel = baseSkillLevel;
        this.performanceByWeather = performanceByWeather;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public double getBaseSkillLevel() {
        return baseSkillLevel;
    }

    public double getWeatherAdjustedSkill(String weather) {
        return baseSkillLevel * performanceByWeather.getOrDefault(weather, 1.0);
    }

    public String toString() {
        return name + " (" + team + ")";
    }
}
