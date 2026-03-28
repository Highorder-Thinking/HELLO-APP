public class HelloApp {
    public static void main(String[] args) {
        // UC2: Check if a name was provided as a command-line argument
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            // Default behavior if no argument is given
            System.out.println("Hello World");
        }
    }
}