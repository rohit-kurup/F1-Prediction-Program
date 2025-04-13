import java.util.Map;

public class Driver {
    private String name;
    private String team;
    private int experienceYears;
    private double averageQualifyingPosition;
    private double averageRacePosition;
    private Map<TrackType, Double> performanceByTrackType;
    private Map<String, Double> performanceByWeather; // e.g. "Wet" → 0.85

    public Driver(String name, String team, int experienceYears, double avgQuali, double avgRace,
                  Map<TrackType, Double> performanceByTrackType, Map<String, Double> performanceByWeather) {
        this.name = name;
        this.team = team;
        this.experienceYears = experienceYears;
        this.averageQualifyingPosition = avgQuali;
        this.averageRacePosition = avgRace;
        this.performanceByTrackType = performanceByTrackType;
        this.performanceByWeather = performanceByWeather;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double getAverageQualifyingPosition() {
        return averageQualifyingPosition;
    }

    public double getAverageRacePosition() {
        return averageRacePosition;
    }

    public double getPerformanceOnTrack(TrackType type) {
        return performanceByTrackType.getOrDefault(type, 1.0);
    }

    public double getPerformanceInWeather(String weather) {
        return performanceByWeather.getOrDefault(weather, 1.0);
    }

    @Override
    public String toString() {
        return "Driver: " + name + ", Team: " + team + ", Experience: " + experienceYears +
               ", Avg Quali Pos: " + averageQualifyingPosition + ", Avg Race Pos: " + averageRacePosition;
    }
}
