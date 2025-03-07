class A
{
    // We can create n number of  Methods in this class
    void printing(){
        System.out.println("Class A");
    }
    // We can create n number of  Methods in this class
    void printing1(){
        System.out.println("Class A");
    }
    // We can create n number of  Methods in this class
    void printing2(){
        System.out.println("Class A");
    }
}
public class clsobj {
    public static void main(String[] args) {
        // Creating object of class A
        A obj = new A();
        // Calling the methods of class A
        obj.printing();
        // Calling the methods of class A
        obj.printing1();
        // Calling the methods of class A
        obj.printing2();
    }
}
