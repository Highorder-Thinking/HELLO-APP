public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Loop through every name provided in the arguments
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
            System.out.println("Hello World");
        }
    }
}