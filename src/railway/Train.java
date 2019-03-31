package railway;

public class Train {

    private Engine[] mEngines;
    private Wagon[] mWagons;
    private int mEngineCount;
    private int mWagonCount;
    private int mTrainNumber;
    private double mWeight;

    public Wagon selectWagonWithID(int ID) {
        int wagonIndex = -1;
        for (int i = 0; i < mWagonCount; i++) {
            if (mWagons[i].getID() == ID) {
                wagonIndex = i;
            }
        }
        return mWagons[wagonIndex];
    }

    public int getMEnginesLength() {
        return mEngines.length;
    }

    public int getMWagonsLength() {
        return mWagons.length;
    }

    public int getEngineCount() {
        return mEngineCount;
    }

    public Engine getEngine(int i) {
        return mEngines[i];
    }

    public Wagon getWagon(int i) {
        return mWagons[i];
    }

    public int getMTrainNumber() {
        return mTrainNumber;
    }

    public Train(int number) {
        mTrainNumber = number;
        mEngines = new Engine[6];
        mEngineCount = 0;
        mWagons = new Wagon[100];
        mWagonCount = 0;
        mWeight = 0;
    }

    public void addEngine(Engine newEngine) {
        mEngines[mEngineCount] = newEngine;
        mEngineCount++;
    }

    public Engine removeEngine() {
        mEngineCount--;
        return mEngines[mEngineCount];
    }

    public void addWagon(Wagon newWagon) {
        mWagons[mWagonCount] = newWagon;
        mWagonCount++;
    }

    public Wagon removeWagon() {
        Wagon temp = mWagons[mWagonCount - 1];
        mWagons[mWagonCount - 1] = null;
        mWagonCount--;
        return temp;
    }

    public double getWeight() {
        for (int i = 0; i < mEngineCount; i++) {
            mWeight = mWeight + mEngines[i].getWeight();
        }
        for (int i = 0; i < mWagonCount; i++) {
            mWeight = mWeight + mWagons[i].getWeight();
        }
        return mWeight;
    }

    public int getNumberOfWagons() {
        return mWagonCount;
    }
}
