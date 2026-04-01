import java.util.HashSet;
import java.util.Set;

/**
 * MAIN CLASS - TrainConsistManagementApp
 * Demonstrates uniqueness using HashSet
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("===================================\n");

        // Step 1: Create HashSet
        Set<String> bogies = new HashSet<>();

        // Step 2: Add Bogie IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // Step 3: Display Unique Bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogies);

        System.out.println("\nTotal Unique Bogies: " + bogies.size());

        System.out.println("\nSystem ensures no duplicate IDs are stored.");
    }
}