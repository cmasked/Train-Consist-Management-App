import java.util.ArrayList;
import java.util.List;

/**
 * UC13: Performance Comparison (Loops vs Streams)
 */
public class TrainConsistManagementApp {

    // Bogie Class
    static class Bogie {
        private String name;
        private String type;
        private int capacity;

        public Bogie(String name, String type, int capacity) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getType() {
            return type;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("====================================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            bogies.add(new Bogie("Sleeper", "Passenger", 72));
            bogies.add(new Bogie("AC Chair", "Passenger", 54));
            bogies.add(new Bogie("First Class", "Passenger", 24));
        }

        // Loop-based calculation
        long startLoop = System.nanoTime();

        int totalSeatsLoop = 0;
        for (Bogie b : bogies) {
            if (b.getType().equalsIgnoreCase("Passenger")) {
                totalSeatsLoop += b.getCapacity();
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // Stream-based calculation
        long startStream = System.nanoTime();

        int totalSeatsStream = bogies.stream()
                .filter(b -> b.getType().equalsIgnoreCase("Passenger"))
                .mapToInt(Bogie::getCapacity)
                .sum();

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Output Results
        System.out.println("\nTotal Seats (Loop): " + totalSeatsLoop);
        System.out.println("Execution Time (Loop): " + loopTime + " ns");

        System.out.println("\nTotal Seats (Stream): " + totalSeatsStream);
        System.out.println("Execution Time (Stream): " + streamTime + " ns");

        System.out.println("\nPerformance Comparison Completed.");
    }
}