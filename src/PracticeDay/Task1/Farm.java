package PracticeDay.Task1;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Cow[] cow;
    private Horse[] horse;
    private Sheep[] sheep;

    public Farm() {
    }

    public Farm(String address, String ownerName, Cow[] cow, Horse[] horse, Sheep[] sheep) {
        this.address = address;
        this.ownerName = ownerName;
        this.cow = cow;
        this.horse = horse;
        this.sheep = sheep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farmer: " +
                "\naddress:" + address +
                "\nownerName: " + ownerName +
                "\nCow: " + Arrays.toString(cow) +
                "\nhorse: " + Arrays.toString(horse) +
                "\nsheep: " + Arrays.toString(sheep);
    }
}
