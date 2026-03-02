 feature/inner-class
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

 feature/UC8-Map-collection
    // 1. Centralized Character Pattern Map
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // UC7: Static Inner Class to manage character patterns
    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        // Constructor to initialize the character and its ASCII lines
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;

feature/UC6-static-functions
/**
 * OOPS Banner App - UC6
 * Focus: Modularization using Static Methods and DRY Principle.
 */
public class OOPSBannerApp {

 feature/UC4-array-loop

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
 dev
public class OOPSBannerApp {
import java.util.Collections;
 dev
 dev

    public static void main(String[] args) {
    feature/UC6-static-functions
        // Step 1: Initialize the banner array by calling static helper methods
        // This eliminates hardcoding strings directly in the main method logic.
        String[][] banner = {
            getCharO(),
            getCharO(),
            getCharP(),
            getCharS()
            
 feature/UC4-array-loop
        String[] oopsBanner = {
            String.join("", "  *** ", "  *** ", " ***** ", " ***** "),
            String.join("", " ** ** ", " ** ** ", " ** ** ", " ** "),
            String.join("", "** ** ", "** ** ", " ** ** ", " ** "),
            String.join("", "** ** ", "** ** ", " ***** ", " *** "),
            String.join("", "** ** ", "** ** ", " ** ", "   ** "),
            String.join("", " ** ** ", " ** ** ", " ** ", "   ** "),
            String.join("", "  *** ", "  *** ", " ** ", " ***** ")
        };

        for (String line : oopsBanner) {
            System.out.println(line);
        }

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
 dev
        };

        // Step 2: Render the banner
        // We loop through the rows (5 rows per character)
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "  "); // Added spacing for readability
            }
            System.out.println(); // Move to the next line after printing each segment of the row
 dev
        }
 dev
 dev
    }

    // Centralized Storage for Patterns
    private static final Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();
 dev

    static {
        // Initialize patterns once in a static block
        patternMap.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });

        patternMap.put('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        });

        patternMap.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    /**
     * UC8 Logic: Renders a word by fetching patterns from the Map
     * @param word The string to be converted into a banner
     */
    public static void renderBanner(String word) {
        int height = 5; // Assuming a standard height for all patterns
        String upperWord = word.toUpperCase();

        // Outer loop iterates through each row of the banner
        for (int row = 0; row < height; row++) {
            StringBuilder lineOutput = new StringBuilder();

            // Inner loop iterates through each character in the word
            for (char c : upperWord.toCharArray()) {
                if (patternMap.containsKey(c)) {
                    // Fetch the specific row for the current character
                    lineOutput.append(patternMap.get(c)[row]).append("  ");
                } else {
                    // Handle missing characters with blank space
                    lineOutput.append("       "); 
                }
            }
            // Print the assembled row
            System.out.println(lineOutput);
        }
    }
}