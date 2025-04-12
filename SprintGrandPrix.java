public class SprintGrandPrix extends GrandPrix {
    private int sprintDistance; // in laps

    public SprintGrandPrix(String name, int laps, double lapLength, String location, String weatherCondition, String date, int sprintDistance) {
        super(name, laps, lapLength, location, weatherCondition, date);
        this.sprintDistance = sprintDistance;
    }

    public int getSprintDistance() {
        return sprintDistance;
    }

    public void setSprintDistance(int sprintDistance) {
        this.sprintDistance = sprintDistance;
    }

    @Override
    public String toString() {
        return super.toString() + "Sprint Distance: " + sprintDistance + " laps\n";
    }
}
