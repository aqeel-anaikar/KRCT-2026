interface A{
    int i = 100;
    void show();
}
interface B {
    int j = 200;
    void display();
}
interface C  {
    int k = 300;
    void printt();
}
class demo{
    void demoo(){
        System.out.println("This is demo class");
    }
}
class D extends demo implements A,B,C{
    public void show(){
        System.out.println(i);
    }
    public void display(){
        System.out.println(j);
    }
    public void printt(){
        System.out.println(k);
    }
}
public class Main {
    public static void main(String[] args) {
        D d = new D();
        d.show();
        d.display();
        d.printt();
        d.demoo();

    }
}
