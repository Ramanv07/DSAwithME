// backtraking to print name n time using recursion

import java.util.Scanner;

public class backtraking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        namePrint(n);
        sc.close();
    }

    public static void namePrint(int n) {
        if (n < 1) {
            return;
        }
        //main logic is that first it will go to the base case and then it will print the  in reverse order
        namePrint(n - 1);// explaination is that first it will go to the base case and then it will print in reverse order
        System.out.println(n);
    }
}