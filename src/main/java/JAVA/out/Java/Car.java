import java.util.Scanner;

public class Car {
    // Attributes
    String make;
    String model;
    short year;
    int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayCar() {
        System.out.println("\nCar Details:");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : ₹" + price);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("How many cars do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create an array to store car objects
        Car[] cars = new Car[count];

        // Input loop
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for car " + (i + 1));

            System.out.print("Make: ");
            String make = sc.nextLine();

            System.out.print("Model: ");
            String model = sc.nextLine();

            System.out.print("Year: ");
            short year = sc.nextShort();

            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // consume newline

            // Create car object and store in array
            cars[i] = new Car(make, model, year, price);
        }

        // Display all cars
        System.out.println("\n--- All Car Details ---");
        for (Car car : cars) {
            car.displayCar();
        }

        sc.close();
    }
}
