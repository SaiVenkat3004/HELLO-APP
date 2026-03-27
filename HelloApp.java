public class HelloApp {
    public static void main(String[] args) {

        String greeting;

        // Check if no arguments
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Use String.join()
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        System.out.println(greeting);
    }
}