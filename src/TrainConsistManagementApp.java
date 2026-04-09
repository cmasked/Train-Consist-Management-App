import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC9: Group Bogies by Type using Collectors.groupingBy()
 */
public class TrainConsistManagementApp {

    // Bogie Class
    static class Bogie {
        private String name;
        private String type;
        private int capacity;

        // Constructor
        public Bogie(String name, String type, int capacity) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }

        // Getter for type
        public String getType() {
            return type;
        }

        // String representation
        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("===================================================");
        System.out.println(" UC9 - Group Bogies by Type using groupingBy() ");
        System.out.println("===================================================\n");

        // Step 1: Create a list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 54));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Rectangular Cargo", "Goods", 100));
        bogies.add(new Bogie("Cylindrical Tanker", "Goods", 80));

        // Step 2: Display all bogies
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Group bogies by type using Stream API
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Step 4: Display grouped bogies
        System.out.println("\nGrouped Bogies by Type:");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println("\n" + type + " Bogies:");
            bogieList.forEach(b -> System.out.println(" - " + b));
        });

        System.out.println("\nProgram executed successfully.");
    }
}