import java.util.Scanner;
// using parameter
// public class oneToN_Sum{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = Sum(n,0);
//         System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
//         sc.close();
//     }

//     public static int Sum(int n ,int sum) {
//         if (n<1) {
//             return 0;
//         }
//         return n + Sum(n - 1, sum + n);
//     }
// }

//using function 

public class oneToN_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum =sum(n);
        System.out.println("sum of "+ n +"is"  +sum);
        sc.close();
    }
  public static int sum(int n) {
    // Base Case: Sum of numbers up to 0 is 0
    if (n == 0) {
        return 0;
    }
    // Calculates: n + (n-1) + (n-2) + ... + 0
    return n + sum(n - 1);
}   
}