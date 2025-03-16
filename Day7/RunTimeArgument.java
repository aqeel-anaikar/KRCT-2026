public class RunTimeArgument {
    public static void main(String[] args) {
        // Accessing runtime arguments
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}