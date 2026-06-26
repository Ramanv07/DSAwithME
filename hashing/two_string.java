package hashing;
import java.util.Scanner;

public class two_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();

        //precomputer
        int[] hash = new int[256]; // if only lowercase letters a-z  use int[] hash = new int[26]; // if only lowercase letters a-z
        

        for(int i =0; i<s.length(); i++){
            hash[s.charAt(i)]++;
//ASCII value of character is used as index in the hash array to count the frequency of each character in the string. 

            //if only lowercase letters a-z then use hash[s.charAt(i)-'a']++;
        }
        int q;// user input for number of queries
        System.out.print("Enter the number of queries: ");
        q = sc.nextInt();

        sc.nextLine(); // Consume the newline character after reading the integer

        while(q-- > 0) {
           String query = sc.nextLine();
            char c = query.charAt(0); // Get the first character of the query string
            System.out.println(hash[c]);// print the frequency of the character c in the string using the hash array
            // if only lowercase letters a-z then use System.out.println(hash[c-'a']);


        
    }
sc.close();}
}
