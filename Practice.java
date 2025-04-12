import java.util.List;

public class Practice extends Race {
    private double fastestLapTime;
    private int numberOfTestRuns;
    private List<String> tyreCompoundsTested;
    private String driverFeedbackNotes;

    public Practice(String name, int laps, double lapLength, String location, String weatherCondition, String date,
                    double fastestLapTime, int numberOfTestRuns, List<String> tyreCompoundsTested, String driverFeedbackNotes) {
        super(name, laps, lapLength, location, weatherCondition, date);
        this.fastestLapTime = fastestLapTime;
        this.numberOfTestRuns = numberOfTestRuns;
        this.tyreCompoundsTested = tyreCompoundsTested;
        this.driverFeedbackNotes = driverFeedbackNotes;
    }

    public double getFastestLapTime() { return fastestLapTime; }
    public int getNumberOfTestRuns() { return numberOfTestRuns; }
    public List<String> getTyreCompoundsTested() { return tyreCompoundsTested; }
    public String getDriverFeedbackNotes() { return driverFeedbackNotes; }
}