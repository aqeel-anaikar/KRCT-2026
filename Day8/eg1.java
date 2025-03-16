public class eg1 {
    void div() throws ArrayIndexOutOfBoundsException,ArithmeticException
    {
        int arr [] = {1,2,3};
        int a = 10;
        int b = 0;
        System.out.println(arr[10]);
        System.out.println(a/b);
        System.out.println("hi");
    }    
    public static void main(String[] args) {
        eg1 x = new eg1();
        try
        {
            x.div();
        }
        catch(NullPointerException e ){
            System.err.println(e);
        }
        catch(ArithmeticException e ){
            System.err.println(e);
        }
    }
}