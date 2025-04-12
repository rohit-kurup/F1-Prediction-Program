package core;
import driver.TyreCompound;

public class SprintQualifying extends Qualifying {
    private int sprintLaps;

    public SprintQualifying(String name, int laps, double lapLength, String location, String weatherCondition, String date, TyreCompound tyreCompound, int sprintLaps) {
        super(name, laps, lapLength, location, weatherCondition, date, tyreCompound);
        this.sprintLaps = sprintLaps;
    }

    public int getSprintLaps() {
        return sprintLaps;
    }

    public void setSprintLaps(int sprintLaps) {
        this.sprintLaps = sprintLaps;
    }

    @Override
    public String toString() {
        return super.toString() + "Sprint Laps: " + sprintLaps + "\n";
    }
}
