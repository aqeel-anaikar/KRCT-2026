import java.util.Scanner;

public class con1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark =sc.nextInt() , pass = 50;
        if(mark >= pass)
        {
            System.out.println("You have passed the exam");
        }
        else{
            System.out.println("You have failed the exam");
        }
    }
}
