import java.util.*;
public class prime {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(n==0||n==1){
        System.out.print("Not");
       }
       else if(n==2){
        System.out.print("prime");
       }
       else{
        int count =0;
        for(int i=0;i*i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not");
        }
       }
    }
}
