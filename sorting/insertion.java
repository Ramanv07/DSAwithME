
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // insertion Sort Algorithm
        for(int i = 0 ; i <= n-1; i++){
               int j=i;
            while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
                }
            }
        System.out.println("Sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
        sc.close();
    
    }
}
