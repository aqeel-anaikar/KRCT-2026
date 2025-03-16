class Animal{
    void makesound(){
        System.out.println("Nothing");
    }
}
@Overriding
class Dog extends Animal{
    void makesound(){
        System.out.println("Barks");
    }
}
@Overriding
class cat extends Animal{
    void makesound(){
        System.out.println("meow");
    }
}

public class poly {
    public static void main(String[] args) {
        // Method Overriding
        cat tom = new cat();
        tom.makesound();  
        Dog shiro = new Dog();
        shiro.makesound();      
    }
}
