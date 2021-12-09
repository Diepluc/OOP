import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * xoa.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).registrationNumber.equals(registrationNumber)) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * lay.
     */
    public String getVehiclesInfo() {
        if (!vehicleList.isEmpty()) {
            String info = name + " has:\n";
            info += "\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i) instanceof Car) {
                    Car car = (Car) vehicleList.get(i);
                    info += car.getInfo() + "\n";
                }

                if (vehicleList.get(i) instanceof MotorBike) {
                    MotorBike motorBike = (MotorBike) vehicleList.get(i);
                    info += motorBike.getInfo() + "\n";
                }
            }
            return info;
        }
        return name + " has no vehicle!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
