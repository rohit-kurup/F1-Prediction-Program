public class SprintGrandPrix extends GrandPrix {
    private int sprintLength;

    public SprintGrandPrix(String name, int laps, double lapLength, String location, String weatherCondition, String date,
                           boolean hasDRSZones, int numberOfPitStops, int sprintLength) {
        super(name, laps, lapLength, location, weatherCondition, date, hasDRSZones, numberOfPitStops);
        this.sprintLength = sprintLength;
    }

    public int getSprintLength() { return sprintLength; }
}