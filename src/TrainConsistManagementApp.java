import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC8: Filter Passenger Bogies Using Streams
 */
public class TrainConsistManagementApp {

    // Passenger Bogie Class
    static class PassengerBogie {
        private String type;
        private int capacity;

        // Constructor
        public PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        // Getter for capacity
        public int getCapacity() {
            return capacity;
        }

        // String representation
        @Override
        public String toString() {
            return type + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("===============================================\n");

        // Step 1: Create list of passenger bogies (from UC7)
        List<PassengerBogie> bogies = new ArrayList<>();
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 54));
        bogies.add(new PassengerBogie("First Class", 24));
        bogies.add(new PassengerBogie("General", 90));

        // Step 2: Display all bogies
        System.out.println("All Passenger Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Filter bogies with capacity greater than 60
        List<PassengerBogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Step 4: Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nProgram executed successfully.");
    }
}