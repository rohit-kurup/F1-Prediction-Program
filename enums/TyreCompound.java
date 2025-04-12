package enums;
public enum TyreCompound {
    SOFT(0.95, 0.03),
    MEDIUM(0.85, 0.02),
    HARD(0.75, 0.01),
    INTERMEDIATE(0.80, 0.025),
    WET(0.70, 0.02);

    private final double grip;
    private final double wearRate;

    TyreCompound(double grip, double wearRate) {
        this.grip = grip;
        this.wearRate = wearRate;
    }

    public double getGrip() {
        return grip;
    }

    public double getWearRate() {
        return wearRate;
    }
}
