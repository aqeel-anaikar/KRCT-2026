public class throww 
{
    void check_Age(int age)throws ArithmeticException
    {
        if (age<18)
        {
            throw new ArithmeticException("Age must be grater");
        }
        else
        {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args)
    {
        throww t = new throww();
        t.check_Age(16);        
    }
}