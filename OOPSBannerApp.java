import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // 1. Centralized Character Pattern Map
    private static final Map<Character, String[]> patternMap = new HashMap<>();

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