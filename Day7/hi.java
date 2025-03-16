interface mul{
    int i = 100;
    void show ();
}

class add implements mul{

    add(int z){
        System.out.println(z);
    }
    public void show(){
        System.out.println(i);
    }
}
// class --> class  keyword is extends
// interface --> class keyword is implements
// interface --> interface keyword is extends

public class hi {
    public static void main(String[] args) {
        add a = new add(100);
        a.show();

    }
}