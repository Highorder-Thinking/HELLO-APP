import java.util.HashMap;
import java.util.Map;

public class BannerApp {

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
        }
    }

    // Centralized Storage for Patterns
    private static final Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();

    static {
        // Defining patterns for 'O', 'P', 'S'
        patternLibrary.put('O', new CharacterPatternMap('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        }));
        
        patternLibrary.put('P', new CharacterPatternMap('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        }));

        patternLibrary.put('S', new CharacterPatternMap('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        }));
    }

    public void displayBanner(String word) {
        word = word.toUpperCase();
        int height = 5; // Fixed height for our patterns

        for (int i = 0; i < height; i++) {
            StringBuilder lineResult = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (patternLibrary.containsKey(c)) {
                    lineResult.append(patternLibrary.get(c).getPattern()[i]).append("  ");
                }
            }
            System.out.println(lineResult);
        }
    }

    public static void main(String[] args) {
        BannerApp app = new BannerApp();
        System.out.println("--- UC7: OOPS Banner ---");
        app.displayBanner("OOPS");
    }
}