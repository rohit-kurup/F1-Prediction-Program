public class Race {
    private String name;
    private int laps;
    private double lapLength;
    private String location;
    private String weatherCondition;
    private String date;
    private String typeOfRace;
    private boolean isSprintRace;
    private boolean isNightRace;

    public Race(String name, int laps, double lapLength, String location, String weatherCondition, String date) {
        this.name = name;
        this.laps = laps;
        this.lapLength = lapLength;
        this.location = location;
        this.weatherCondition = weatherCondition;
        this.date = date;
        this.typeOfRace = "Grand Prix";
        this.isSprintRace = false;
        this.isNightRace = false;
    }

    public Race() {
        this("Unnamed", 50, 5.0, "Unknown", "Sunny", "2025-01-01");
    }

    public String getName() { return name; }
    public int getLaps() { return laps; }
    public double getLapLength() { return lapLength; }
    public String getLocation() { return location; }
    public String getWeatherCondition() { return weatherCondition; }
    public String getDate() { return date; }
    public boolean isSprintRace() { return isSprintRace; }
    public boolean isNightRace() { return isNightRace; }

    @Override
    public String toString() {
        return name + " at " + location + " on " + date;
    }
}