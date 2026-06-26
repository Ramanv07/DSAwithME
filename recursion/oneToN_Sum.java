import java.util.Scanner;

public class oneToN_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = Sum(n,0);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }

    public static int Sum(int i,int sum) {
        if (i<1) {
            return 0;
        }
        return i + Sum(i - 1, sum + i);
    }
}