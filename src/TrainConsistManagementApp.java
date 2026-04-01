import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {


    /**
     * MAIN CLASS - UseCase1TrainConsistMgmt
     * Entry point of Train Consist Management Application
     */


        public static void main(String[] args) {

            // Step 1: Welcome Message
            System.out.println("=== Train Consist Management App ===");

            // Step 2: Initialize Train Consist (Empty List)
            List<String> trainConsist = new ArrayList<>();

            // Step 3: Display Initial State
            System.out.println("Train consist initialized successfully.");

            // Step 4: Display Bogie Count
            System.out.println("Initial number of bogies: " + trainConsist.size());

            // Step 5: Continue Program Flow
            System.out.println("System ready for further operations...");
        }
    }

