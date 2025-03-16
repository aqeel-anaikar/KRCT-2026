package mypack;

public class Main {
    public static void main(String[] args) {
        Math m = new Math();
        m.display();
        // m.equation(); // error: equation() has private access in Math 
    }
}
