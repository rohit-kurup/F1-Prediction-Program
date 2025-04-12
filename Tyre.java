public class Tyre {
    private TyreCompound compound;
    private double wearRate;

    public Tyre(TyreCompound compound, double wearRate) {
        this.compound = compound;
        this.wearRate = wearRate;
    }

    public TyreCompound getCompound() {
        return compound;
    }

    public void setCompound(TyreCompound compound) {
        this.compound = compound;
    }

    public double getWearRate() {
        return wearRate;
    }

    public void setWearRate(double wearRate) {
        this.wearRate = wearRate;
    }

    @Override
    public String toString() {
        return "Tyre[" + compound + ", wearRate=" + wearRate + "]";
    }
}