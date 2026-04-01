import java.util.LinkedHashSet;
import java.util.Set;

/**
 * MAIN CLASS - TrainConsistManagementApp
 * Demonstrates ordered + unique bogie formation using LinkedHashSet
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // Step 1: Create LinkedHashSet
        Set<String> formation = new LinkedHashSet<>();

        // Step 2: Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Step 3: Attempt duplicate insertion
        formation.add("Sleeper"); // duplicate (ignored)

        // Step 4: Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nTotal Bogies: " + formation.size());

        System.out.println("\nOrder preserved + duplicates prevented.");
    }
}