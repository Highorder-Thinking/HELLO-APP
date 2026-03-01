/**
 * OOPS Banner App - UC6
 * Focus: Modularization using Static Methods and DRY Principle.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Step 1: Initialize the banner array by calling static helper methods
        // This eliminates hardcoding strings directly in the main method logic.
        String[][] banner = {
            getCharO(),
            getCharO(),
            getCharP(),
            getCharS()
        };

        // Step 2: Render the banner
        // We loop through the rows (5 rows per character)
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "  "); // Added spacing for readability
            }
            System.out.println(); // Move to the next line after printing each segment of the row
        }
    }

    // --- Static Helper Methods (The "Modular" Part) ---

    public static String[] getCharO() {
        return new String[]{
            " ***** ",
            "* *",
            "* *",
            "* *",
            " ***** "
        };
    }

    public static String[] getCharP() {
        return new String[]{
            "****** ",
            "* *",
            "****** ",
            "* ",
            "* "
        };
    }

    public static String[] getCharS() {
        return new String[]{
            " ***** ",
            "* ",
            " ***** ",
            "      *",
            " ***** "
        };
    }
}