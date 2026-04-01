import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * Demonstrates ArrayList CRUD operations for passenger bogies
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=====================================\n");

        // Step 1: Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add Bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display Bogies (READ)
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 4: Remove a Bogie (DELETE)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 5: Check Existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present in the train.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // Step 6: Final State
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for next operations...");
    }
}