public class Tyre {
    private TyreCompound compound;
    private double currentGrip;
    private double wearLevel; // from 0 (new) to 1 (fully worn)

    public Tyre(TyreCompound compound) {
        this.compound = compound;
        this.currentGrip = compound.getGrip();
        this.wearLevel = 0.0;
    }

    public void wear(double amount) {
        this.wearLevel += amount;
        this.wearLevel = Math.min(1.0, this.wearLevel);
        this.currentGrip = compound.getGrip() * (1.0 - wearLevel);
    }

    public double getCurrentGrip() {
        return currentGrip;
    }

    public TyreCompound getCompound() {
        return compound;
    }

    public double getWearLevel() {
        return wearLevel;
    }
}
