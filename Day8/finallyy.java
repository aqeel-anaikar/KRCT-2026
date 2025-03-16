public class finallyy {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try{
            System.out.println(a/b);
            
        }
        catch(Exception e){
            System.err.println(e);
            
        }
        finally{
            System.err.println("Operation pending...");
        }
    }
}
