// reverse arry using  recursion
import java.util.Scanner;

public class Rev_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        // Fix 1: Correct Java array initialization syntax
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read array values from user
        }
        
        // Fix 3: Made f() static so we can call it here directly
        f(0, arr, n);
        
        System.out.println("Reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }

    // Recursive function to reverse the array
    public static void f(int i, int[] arr, int n) {
        // Base Case: If we reach or pass the middle, stop
        if (i >= n / 2) {   
            return;
        }
        
        // Fix 2: Swap element at i with its mirror element at the end (n - 1 - i)
        int temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
        
        // Recursive call for the next pair
        f(i + 1, arr, n);
    }
}

