public class exp {
    void show () throws ArithmeticException
    {
        int a = 10;
        int b = 0;
        System.out.println(a/b);

    }

    public static void main(String[] args)
    {
        exp e = new exp();
        try{
            e.show();
        }
        catch(Exception d){
            System.err.println(e);
        }

        System.out.println("Hi");
    }
}
