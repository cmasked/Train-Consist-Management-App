import java.util.HashMap;
import java.util.Map;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * * Use Case 6: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==============================================\n");

        // HashMap stores data in key -> value format
        // Key (String): Bogie Name, Value (Integer): Capacity
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- Insert bogie capacities ----
        // Using put() to associate the bogie name with its capacity
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair Car", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("General", 90);
        capacityMap.put("Pantry Car", 0);

        System.out.println("Bogie Capacity Mapping (Total Items: " + capacityMap.size() + ")");
        System.out.println("----------------------------------------------");

        // ---- Iterate through map entries ----
        // entrySet() allows us to access both the Key and Value in one loop
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println("Bogie Type: " + bogieName + " | Capacity: " + capacity + " seats");
        }

        System.out.println("----------------------------------------------");
        System.out.println("Mapping complete. Fast lookup enabled for operational planning.");
    }
}