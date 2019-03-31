package railway;

public class RollingStock {

    private int mIDNumber;
    private double mWeight;

    public RollingStock(int ID, double weight) {
        mIDNumber = ID;
        mWeight = weight;
    }

    public double getWeight() {
        return mWeight;
    }

    public void setWeight(double i) {
        mWeight = i;
    }

    public int getID() {
        return mIDNumber;
    }
}
