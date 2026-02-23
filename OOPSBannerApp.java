 feature/UC1-PrintOOPS
/**
 features/UC3-PrintOOPS
 * OOPSBannerApp
 *
 * UC3: Render OOPS as Banner using String.join
 * OOPS Banner App - Use Case 1: Print OOPS to Console
 * This class serves as the container for our application logic.
 dev
 *
 * @author Divya
 * @version 3.0
 */
public class OOPSBannerApp {
import java.util.Collections;
 dev

public class BannerAppUC5 {
    public static void main(String[] args) {
 features/UC3-PrintOOPS
        System.out.println(String.join("", "  *** ", "  *** ", " ***** ", " ***** "));
        System.out.println(String.join("", " ** ** ", " ** ** ", " ** ** ", " ** "));
        System.out.println(String.join("", "** ** ", "** ** ", " ** ** ", " ** "));
        System.out.println(String.join("", "** ** ", "** ** ", " ***** ", " *** "));
        System.out.println(String.join("", "** ** ", "** ** ", " ** ", "   ** "));
        System.out.println(String.join("", " ** ** ", " ** ** ", " ** ", "   ** "));
        System.out.println(String.join("", "  *** ", "  *** ", " ** ", " ***** "));
        String symbol = "*";
        int width = 20;

        // UC5: Combined Declaration and Initialization
        String[] bannerLines = {
            String.join("", Collections.nCopies(width, symbol)), // Line 1: Top Border
            symbol + String.join("", Collections.nCopies(width - 2, " ")) + symbol, // Line 2: Padding
            symbol + "  OOPS CONCEPTS   " + symbol,              // Line 3: Content
            symbol + "   USE CASE - 5   " + symbol,              // Line 4: Sub-content
            symbol + " ARRAY INITIALIZE " + symbol,              // Line 5: Feature
            symbol + String.join("", Collections.nCopies(width - 2, " ")) + symbol, // Line 6: Padding
            String.join("", Collections.nCopies(width, symbol))  // Line 7: Bottom Border
        };

        // Enhanced for loop for efficient rendering
        for (String line : bannerLines) {
            System.out.println(line);
        }
 dev
    }
}