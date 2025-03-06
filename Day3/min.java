import java.util.*;
public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];

        for(int i=1;i<n;i++)
        {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        
        System.out.print("Minimum in Array is :"min);
    }
}



// 1 33 0 55 22 7  1
// 1 33            33
// 33 0            33
// 33 55           55
// 55 22           55
// 55 7            55