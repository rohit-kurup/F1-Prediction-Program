import java.util.Map;

public class Qualifying extends Race {
    private Map<Driver, Double> qualifyingTimes;

    public Qualifying(String name, int laps, double lapLength, String location, String weatherCondition, String date,
                      Map<Driver, Double> qualifyingTimes) {
        super(name, laps, lapLength, location, weatherCondition, date);
        this.qualifyingTimes = qualifyingTimes;
    }

    public Map<Driver, Double> getQualifyingTimes() { return qualifyingTimes; }
    public void setQualifyingTimes(Map<Driver, Double> qualifyingTimes) { this.qualifyingTimes = qualifyingTimes; }
}