import java.util.Scanner;

abstract class Vehicle {
    abstract void move();
}

class Helicopter extends Vehicle {
    @Override
    void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train extends Vehicle {
    @Override
    void move() {
        System.out.println("The Train runs on the track.");
    }
}

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Factory!");
        System.out.println("Please choose the type of vehicle you want to order:");
        System.out.println("1. Helicopter");
        System.out.println("2. Car");
        System.out.println("3. Train");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Vehicle vehicle = createVehicle(choice);
        if (vehicle != null) {
            System.out.println("You have ordered a " + vehicle.getClass().getSimpleName() + ".");
            System.out.println("Nature of movement:");
            vehicle.move();
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static Vehicle createVehicle(int choice) {
        switch (choice) {
            case 1:
                return new Helicopter();
            case 2:
                return new Car();
            case 3:
                return new Train();
            default:
                return null;
        }
    }
}
