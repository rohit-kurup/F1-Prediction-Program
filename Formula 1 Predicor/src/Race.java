public class Race {
    private String name;
    private String location;
    private TrackType trackType;
    private int laps;
    private double lapLength;
    private String weather;
    private boolean isNightRace;

    public Race(String name, String location, TrackType trackType, int laps, double lapLength, String weather, boolean isNightRace) {
        this.name = name;
        this.location = location;
        this.trackType = trackType;
        this.laps = laps;
        this.lapLength = lapLength;
        this.weather = weather;
        this.isNightRace = isNightRace;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public TrackType getTrackType() {
        return trackType;
    }

    public int getLaps() {
        return laps;
    }

    public double getLapLength() {
        return lapLength;
    }

    public String getWeather() {
        return weather;
    }

    public boolean isNightRace() {
        return isNightRace;
    }

    @Override
    public String toString() {
        return "Race: " + name + ", Location: " + location + ", TrackType: " + trackType +
               ", Laps: " + laps + ", Weather: " + weather + ", Night Race: " + isNightRace;
    }
}
