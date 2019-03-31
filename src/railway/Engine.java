package railway;

public class Engine extends RollingStock {

    private double mPullingWeight;

    @Override
    public String toString() {
        return "ID: " + getID() + " weight: " + getWeight() + " kg can pull: " + mPullingWeight + " kg";
    }

    public Engine(int ID) {
        super(ID, 120000);
        mPullingWeight = 1400000;
    }

    public double getWeight() {
        return super.getWeight();
    }
}
