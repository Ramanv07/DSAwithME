package hashing;
import java.util.Scanner;
import java.util.HashMap; // Imported HashMap
import java.util.Map;

public class map_exp {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Fix 1 & 2: Correct initialization using Wrapper classes and HashMap
        Map<Integer, Integer> map = new HashMap<>();
        
        // Precompute frequencies
        for(int i = 0; i < n; i++){
            // If arr[i] exists, increment its count. Otherwise, start at 0 + 1.
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Fix 3: Read 'q' from user input
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        
        while(q-- > 0){
            System.out.print("Enter number to check frequency: ");
            int number = sc.nextInt();
            
            // If the number exists in our map, print its frequency. Otherwise, print 0.
            System.out.println("Frequency: " + map.getOrDefault(number, 0));
        }

        sc.close();
    }
}
// map used to store the frequency of each number in the array. The key is the number and the value is its frequency. The getOrDefault method is used to handle cases where a number may not be present in the map, returning 0 in such cases.
//space complexity: O(n) for storing the frequencies in the map, where n is the number of unique elements in the array.
//time complexity: O(n + q) where n is the size of the array and q is the number of queries. The first loop runs in O(n) time to fill the map, and the second loop runs in O(q) time to answer the queries.
//Or O(N+N) where N is the size of the array and N is the number of queries. The first loop runs in O(N) time to fill the map, and the second loop runs in O(N) time to answer the queries.