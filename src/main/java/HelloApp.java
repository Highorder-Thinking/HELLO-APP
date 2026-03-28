public class HelloApp {
    public static void main(String[] args) {
        // UC4: Check if any names were provided
        if (args.length > 0) {
            // Loop through the array of arguments
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
            // Default behavior if the array is empty
            System.out.println("Hello World");
        }
    }
}