// Importing the Car class
import dealership.Car;

public class Main {
    public static void main(String[] args) throws Exception {

        // Currently Main can access all attributes directly.
        Car car1 = new Car();

        // Update this code to use your setter and getter methods instead.
        car1.make = "Ford";
        car1.model = "Mustang";
        car1.year = 1800; // Cars weren't invented until 1886 *shocked face*

        System.out.print("Car1 Make: " + car1.make);
        System.out.print("Car1 Model: " + car1.model);
        System.out.print("Car1 Year: " + car1.year);
    }
}
