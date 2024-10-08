import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, efficiency = 0, pricePerGallon = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        double costFor100Miles = (100 / efficiency) * pricePerGallon;
        double distance = gallons * efficiency;

        System.out.println("Cost to drive 100 miles: $" + costFor100Miles);
        System.out.println("Maximum distance with full tank: " + distance + " miles");
    }
}
