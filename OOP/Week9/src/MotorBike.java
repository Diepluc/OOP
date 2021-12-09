public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * constructor.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * info.
     */
    public String getInfo() {
        String str = "Motor Bike:\n";
        str += "\tBrand: " + super.getBrand() + "\n";
        str += "\tModel: " + super.getModel() + "\n";
        str += "\tRegistration Number: " + super.getRegistrationNumber() + "\n";
        str += "\tHas Side Car: " + this.hasSidecar + "\n";
        str += "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
        return str;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
