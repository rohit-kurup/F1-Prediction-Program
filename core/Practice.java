package core;
import java.util.List;
import java.util.ArrayList;

public class Practice extends Race {
    // Additional attributes specific to Practice
    private double fastestLapTime;
    private int numberOfTestRuns;
    private List<String> tyreCompoundsTested;
    private String driverFeedbackNotes;

    // Constructor for Practice, including Race attributes
    public Practice(
        String name,
        int laps,
        double lapLength,
        String location,
        String weatherCondition,
        String date,
        double fastestLapTime,
        int numberOfTestRuns,
        List<String> tyreCompoundsTested,
        String driverFeedbackNotes
    ) {
        // Call the parent class (Race) constructor
        super(name, laps, lapLength, location, weatherCondition, date);
        this.fastestLapTime = fastestLapTime;
        this.numberOfTestRuns = numberOfTestRuns;
        this.tyreCompoundsTested = tyreCompoundsTested;
        this.driverFeedbackNotes = driverFeedbackNotes;
    }

    // Default constructor for Practice
    public Practice() {
        super(); // Call the default constructor of Race
        this.fastestLapTime = 1.35;
        this.numberOfTestRuns = 20;
        this.tyreCompoundsTested = new ArrayList<String>(java.util.Arrays.asList("Soft", "Medium"));
        this.driverFeedbackNotes = "Car performed well on soft tyres.";
    }

    // Getters and Setters for Practice-specific attributes
    public double getFastestLapTime() {
        return fastestLapTime;
    }

    public void setFastestLapTime(double fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public int getNumberOfTestRuns() {
        return numberOfTestRuns;
    }

    public void setNumberOfTestRuns(int numberOfTestRuns) {
        this.numberOfTestRuns = numberOfTestRuns;
    }

    public List<String> getTyreCompoundsTested() {
        return tyreCompoundsTested;
    }

    public void setTyreCompoundsTested(List<String> tyreCompoundsTested) {
        this.tyreCompoundsTested = tyreCompoundsTested;
    }

    public String getDriverFeedbackNotes() {
        return driverFeedbackNotes;
    }

    public void setDriverFeedbackNotes(String driverFeedbackNotes) {
        this.driverFeedbackNotes = driverFeedbackNotes;
    }

    public void addTyreCompound(String compound) {
        tyreCompoundsTested.add(compound);
    }

    public void removeTyreCompound(String compound) {
        tyreCompoundsTested.remove(compound);
    }

    
    // Override the toString method to include Practice-specific attributes
    @Override
    public String toString() {
        return super.toString() + // Call the parent class's toString method
            "fastestLapTime: " + String.format("%.3f", fastestLapTime) + "\n" +
            "numberOfTestRuns: " + numberOfTestRuns + "\n" +
            "tyreCompoundsTested: " + tyreCompoundsTested + "\n" +
            "driverFeedbackNotes: " + driverFeedbackNotes + "\n";
    }
}