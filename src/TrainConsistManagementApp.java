import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC10: Count Total Seats in Train using Stream reduce()
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

        // Getter for capacity
        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " (" + type + ", Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC10 - Count Total Seats in Train (reduce) ");
        System.out.println("===============================================\n");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 54));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Rectangular Cargo", "Goods", 0));
        bogies.add(new Bogie("Cylindrical Tanker", "Goods", 0));

        // Step 2: Display all bogies
        System.out.println("Train Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Calculate total seating capacity using Stream API
        int totalSeats = bogies.stream()
                .filter(b -> b.type.equalsIgnoreCase("Passenger"))
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // Step 4: Display total seating capacity
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}