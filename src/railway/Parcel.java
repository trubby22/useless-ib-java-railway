package railway;

public class Parcel {

    private int trackingID;
    private double weight;
    public String destinationAddress;
    public String originAddress;

    @Override
    public String toString() {
        return "ID: " + trackingID + " weight: " + weight + " destination: " + destinationAddress + " origin: " + originAddress;
    }

    public Parcel(int trackingID, double weight, String destinationAddress, String originAddress) {
        this.trackingID = trackingID;
        this.weight = weight;
        this.destinationAddress = destinationAddress;
        this.originAddress = originAddress;
    }

    public int getID() {
        return trackingID;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress;
    }

    public Parcel(int ID) {
        trackingID = ID;
        weight = 0;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public double getWeight() {
        return weight;
    }
}
