class car {
    int SpeedLimit = 120;

    public void Accelerator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Accelerator'");
    }

    public void Brake() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Brake'");
    }

    public void Clutch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Clutch'");
    }
}
class audi extends car {
    int SpeedLimit = 180;

    void show(){
        System.out.println("Speed Limit is "+super.SpeedLimit);
        System.out.println("Local"+SpeedLimit);
    }
}
public class Ksuper {
    public static void main(String[] args) {
        audi M2019 = new audi();
        M2019.show();
    }
}
