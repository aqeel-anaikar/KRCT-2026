// this is the code for the class engine
class engine
{
    // this is the method display which takes an integer as input and prints the message
    void display(int a){
        System.out.printf("this is engine %dcc\n",a);
    }
}
public class durai {
public static void main(String[] args) {
    // Creating object of class engine
    engine audi = new engine();
    audi.display(4000);
    engine benz = new engine();
    benz.display(5000);
    }
}