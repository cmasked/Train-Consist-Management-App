import java.util.LinkedList;
import java.util.List;

/**
 * MAIN CLASS - TrainConsistManagementApp
 * Demonstrates ordered bogie management using LinkedList
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================\n");

        // Step 1: Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // Step 2: Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Step 3: Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry at position 2:");
        System.out.println(trainConsist);

        // Step 4: Remove first and last bogie
        trainConsist.remove(0); // remove first (Engine)
        trainConsist.remove(trainConsist.size() - 1); // remove last (Guard)

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        // Step 5: Final Output
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nSystem maintains proper bogie sequence.");
    }
}