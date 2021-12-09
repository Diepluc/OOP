public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * constructor.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * info.
     */
    public String getInfo() {
        String str = "Car:\n";
        str += "\tBrand: " + super.getBrand() + "\n";
        str += "\tModel: " + super.getModel() + "\n";
        str += "\tRegistration Number: " + super.getRegistrationNumber() + "\n";
        str += "\tNumber of Doors: " + this.numberOfDoors + "\n";
        str += "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
        return str;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
