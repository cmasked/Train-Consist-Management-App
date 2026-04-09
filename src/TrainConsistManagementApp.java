import java.util.ArrayList;
import java.util.List;

/**
 * UC12: Safety Compliance Check for Goods Bogies
 */
public class TrainConsistManagementApp {

    // Goods Bogie Class
    static class GoodsBogie {
        private String bogieId;
        private String type;
        private String cargoType;
        private int load;

        public GoodsBogie(String bogieId, String type, String cargoType, int load) {
            this.bogieId = bogieId;
            this.type = type;
            this.cargoType = cargoType;
            this.load = load;
        }

        // Method to check safety compliance
        public boolean isCompliant() {
            if (type.equalsIgnoreCase("Rectangular")) {
                return load <= 100;
            } else if (type.equalsIgnoreCase("Cylindrical")) {
                return load <= 80;
            }
            return false;
        }

        @Override
        public String toString() {
            return bogieId + " | Type: " + type +
                    " | Cargo: " + cargoType +
                    " | Load: " + load + " tons";
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==================================================\n");

        // Step 1: Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("GB101", "Rectangular", "General Goods", 90));
        goodsBogies.add(new GoodsBogie("GB102", "Rectangular", "Machinery", 110)); // Non-compliant
        goodsBogies.add(new GoodsBogie("GB103", "Cylindrical", "Petroleum", 70));
        goodsBogies.add(new GoodsBogie("GB104", "Cylindrical", "Chemicals", 85)); // Non-compliant

        // Step 2: Check and display safety compliance
        System.out.println("Safety Compliance Report:\n");

        for (GoodsBogie bogie : goodsBogies) {
            String status = bogie.isCompliant() ? "COMPLIANT" : "NON-COMPLIANT";
            System.out.println(bogie + " --> " + status);
        }

        // Step 3: Count compliant bogies using Streams
        long compliantCount = goodsBogies.stream()
                .filter(GoodsBogie::isCompliant)
                .count();

        System.out.println("\nTotal Compliant Bogies: " + compliantCount);
        System.out.println("Total Non-Compliant Bogies: "
                + (goodsBogies.size() - compliantCount));
    }
}