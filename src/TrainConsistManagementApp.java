import java.util.ArrayList;
import java.util.List;

/**
 * UC14: Handle Invalid Bogie Capacity
 */
public class TrainConsistManagementApp {

    // Custom Exception
    static class InvalidBogieCapacityException extends Exception {
        public InvalidBogieCapacityException(String message) {
            super(message);
        }
    }

    // Bogie Class
    static class Bogie {
        private String name;
        private String type;
        private int capacity;

        public Bogie(String name, String type, int capacity)
                throws InvalidBogieCapacityException {
            if (capacity <= 0) {
                throw new InvalidBogieCapacityException(
                        "Capacity must be greater than zero for bogie: " + name);
            }
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + type + ", Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("===================================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("===================================================\n");

        List<Bogie> bogies = new ArrayList<>();

        // Attempt to add bogies with validation
        try {
            bogies.add(new Bogie("Sleeper", "Passenger", 72));
            bogies.add(new Bogie("AC Chair", "Passenger", 54));
            bogies.add(new Bogie("First Class", "Passenger", 24));
            bogies.add(new Bogie("Cargo", "Goods", 100));

            // Invalid bogies
            bogies.add(new Bogie("InvalidBogie1", "Passenger", -10));
            bogies.add(new Bogie("InvalidBogie2", "Goods", 0));

        } catch (InvalidBogieCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}