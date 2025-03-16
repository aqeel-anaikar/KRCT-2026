public class Exceptionn {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.err.println(e);
        }

        System.err.println("Operation pending...");
    }
}