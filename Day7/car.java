abstract class car {
    abstract void Accelerator();
    abstract void Brake();
    abstract void Clutch();
}

class imp extends car
{
    void Accelerator(){
        System.out.println("Go");
    }
    void Brake(){
        System.out.println("Stop");
    }
    void Clutch(){
        System.out.println("Speed");
    }
}
