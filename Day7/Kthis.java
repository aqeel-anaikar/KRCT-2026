class Asdf
{
    int i = 0;

    Asdf(int i){
        this.i = i;
    }
    void show(){
        int i = 10;
        System.out.println(this.i);
    }
}

public class Kthis {
    public static void main(String[] args) {
        Asdf a = new Asdf(100);
        a.show();
    }
}