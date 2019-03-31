package railway;

public class Wagon extends RollingStock {

    private Parcel[] mParcels;
    private int mParcelCount = 0;

    public int getMParcelsLength() {
        return mParcels.length;
    }

    @Override
    public String toString() {
        return "ID: " + getID() + " weight: " + getWeight() + " kg number of parcels: " + mParcelCount;
    }

    public Parcel getParcel(int i) {
        return mParcels[i];
    }

    public void addParcel(Parcel parcel) {
        mParcels[mParcelCount] = parcel;
        mParcelCount++;
    }

    public Wagon(int ID) {
        super(ID, 32000);
        mParcels = new Parcel[100];
        mParcelCount = 0;
    }

    public int getWagonID() {
        return this.getID();
    }

    @Override
    public double getWeight() {
        double totalWeight = super.getWeight();
        for (int i = 0; i < mParcelCount; i++) {
            totalWeight = totalWeight + mParcels[i].getWeight();
        }
        return totalWeight;
    }

    public int getmParcelCount() {
        return mParcelCount;
    }
}
