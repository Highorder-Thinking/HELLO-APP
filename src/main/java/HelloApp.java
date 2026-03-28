public class HelloApp {
    public static void main(String[] args) {
 feature/UC4-display-multiple-names
        // UC4: Check if any names were provided
        if (args.length > 0) {
            // Loop through the array of arguments

        if (args.length > 0) {
            // Loop through every name provided in the arguments
 dev
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
 feature/UC4-display-multiple-names
            // Default behavior if the array is empty

 dev
            System.out.println("Hello World");
        }
    }
}