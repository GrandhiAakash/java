// Superclass
class Vehicle {
    // Attributes
    protected String brand;
    protected String model;
    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    // Method to display information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
// Subclass Car
class Car extends Vehicle {
    // Additional attributes specific to Car
    private int numDoors;
    // Constructor
    public Car(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }
    // Overriding the displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
        System.out.println("Number of doors: " + numDoors);
    }
}
public class Over {
    public static void main(String[] args) {
        // Creating objects
        Vehicle vehicle = new Vehicle("Generic", "Model");
        Car car = new Car("Toyota", "Corolla", 4);
        // Displaying information
        System.out.println("Vehicle Information:");
        vehicle.displayInfo();
        System.out.println("\nCar Information:");
        car.displayInfo();
    }
}