import java.util.*;
public class Main{
    public static void main(String[] args) {
    Scanner  sc =new Scanner(System.in);
    char c=sc.next().chatAt(0);
    if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
        System.out.println("Vowel is found");
    }
    else{
        System.out.println("Vowel not found");
    }
    }
}