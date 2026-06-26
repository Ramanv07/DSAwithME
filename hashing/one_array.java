package hashing;
import java.util.Scanner;

public class one_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //precomputer
        int[] hash = new int[13];// we go into 10^6 but if we go more then we initialize hash in gobal scope so that it will not give error and we go upto 10^7.

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
         int q;// user input for number of queries
        System.out.print("Enter the number of queries: ");
        q = sc.nextInt();
        while(q-- > 0) {
            int x = sc.nextInt();// user input for the number to check frequency
            System.out.println(hash[x]);// print the frequency of the number x in the array using the hash array
        }

        sc.close();
    }

}
// Time Complexity: O(n + q) where n is the size of the array and q is the number of queries. The first loop runs in O(n) time to fill the hash array, and the second loop runs in O(q) time to answer the queries.
