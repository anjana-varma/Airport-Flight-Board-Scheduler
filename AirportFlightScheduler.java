import java.util.Scanner;

public class AirportFlightScheduler {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String flight = "AI101";
        String destination = "Delhi";
        String time = "09:30 AM";
        String gate = "A1";
        String status = "Scheduled";

        System.out.println("===== AIRPORT FLIGHT BOARD =====");
        System.out.println("Flight: " + flight);
        System.out.println("Destination: " + destination);
        System.out.println("Time: " + time);
        System.out.println("Gate: " + gate);
        System.out.println("Status: " + status);

        System.out.println("\n1. Check Flight");
        System.out.println("2. Update Status");
        System.out.println("3. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("\nFlight " + flight + " is " + status);
        }
        else if (choice == 2) {
            System.out.println("\n1. Scheduled");
            System.out.println("2. Delayed");
            System.out.println("3. Departed");

            System.out.print("Enter status: ");
            int s = sc.nextInt();

            if (s == 1) {
                status = "Scheduled";
            }
            else if (s == 2) {
                status = "Delayed";
            }
            else if (s == 3) {
                status = "Departed";
            }

            System.out.println("Flight status: " + status);
        }
        else {
            System.out.println("Thank you!");
        }

        sc.close();
    }
}