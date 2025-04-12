import java.util.Map;

public class SprintQualifying extends Qualifying {
    private int sprintOrderPoints;

    public SprintQualifying(String name, int laps, double lapLength, String location, String weatherCondition, String date,
                            Map<Driver, Double> qualifyingTimes, int sprintOrderPoints) {
        super(name, laps, lapLength, location, weatherCondition, date, qualifyingTimes);
        this.sprintOrderPoints = sprintOrderPoints;
    }

    public int getSprintOrderPoints() { return sprintOrderPoints; }
}