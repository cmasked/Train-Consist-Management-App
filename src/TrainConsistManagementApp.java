import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * UC11: Validate Train ID & Cargo Codes using Regular Expressions
 */
public class TrainConsistManagementApp {

    // Regex Patterns
    private static final Pattern TRAIN_ID_PATTERN = Pattern.compile("^TRN\\d{3}$");
    private static final Pattern CARGO_CODE_PATTERN = Pattern.compile("^CG\\d{3}$");

    // Method to validate Train ID
    public static boolean validateTrainId(String trainId) {
        return TRAIN_ID_PATTERN.matcher(trainId).matches();
    }

    // Method to validate Cargo Code
    public static boolean validateCargoCode(String cargoCode) {
        return CARGO_CODE_PATTERN.matcher(cargoCode).matches();
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("===============================================\n");

        // Sample Train IDs
        String trainId1 = "TRN101";
        String trainId2 = "TRN20A";

        // Sample Cargo Codes
        List<String> cargoCodes = new ArrayList<>();
        cargoCodes.add("CG501");
        cargoCodes.add("CG502");
        cargoCodes.add("CG50A"); // Invalid
        cargoCodes.add("CG503");

        // Validate Train IDs
        System.out.println("Train ID Validation:");
        System.out.println(trainId1 + " -> " +
                (validateTrainId(trainId1) ? "Valid" : "Invalid"));
        System.out.println(trainId2 + " -> " +
                (validateTrainId(trainId2) ? "Valid" : "Invalid"));

        // Validate Cargo Codes
        System.out.println("\nCargo Code Validation:");
        for (String code : cargoCodes) {
            System.out.println(code + " -> " +
                    (validateCargoCode(code) ? "Valid" : "Invalid"));
        }

        // Count valid cargo codes
        long validCargoCount = cargoCodes.stream()
                .filter(TrainConsistManagementApp::validateCargoCode)
                .count();

        System.out.println("\nTotal Valid Cargo Codes: " + validCargoCount);
    }
}