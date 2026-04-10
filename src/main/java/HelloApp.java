public class HelloApp {
    public static void main(String[] args) {
        // UC5: Check if arguments are provided
        if (args.length > 0) {
            // Using the Enhanced For Loop (For-Each)
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
            // Default greeting as per UC5 description
            System.out.println("Hello, World!");
        }
    }
}