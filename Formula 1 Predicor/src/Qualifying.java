import java.util.Map;

public class Qualifying extends Race {
    private Map<Driver, Double> qualifyingTimes;

    public Qualifying(String name, String location, TrackType trackType, int laps, double lapLength, String weather, boolean isNightRace, Map<Driver, Double> qualifyingTimes) {
        super(name, location, trackType, laps, lapLength, weather, isNightRace);
        this.qualifyingTimes = qualifyingTimes;
    }

    public Map<Driver, Double> getQualifyingTimes() { return qualifyingTimes; }
    public void setQualifyingTimes(Map<Driver, Double> qualifyingTimes) { this.qualifyingTimes = qualifyingTimes; }
}