
public class GrandPrix extends Race {
    private boolean hasDRSZones;
    private int numberOfPitStops;

    public GrandPrix(String name, int laps, double lapLength, String location, String weatherCondition, String date,
                     boolean hasDRSZones, int numberOfPitStops) {
        super(name, laps, lapLength, location, weatherCondition, date);
        this.hasDRSZones = hasDRSZones;
        this.numberOfPitStops = numberOfPitStops;
    }

    public boolean hasDRSZones() { return hasDRSZones; }
    public int getNumberOfPitStops() { return numberOfPitStops; }
}