package sorting;
import java.util.Scanner; // scanner

public class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Selection Sort Algorithm
        for(int i = 0; i < n - 2; i++){
            int minIndex = i;
            for(int j = i ; j < n-1; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
        sc.close();
    }


}
