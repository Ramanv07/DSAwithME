//print number n time using recursion
import java.util.Scanner;
public class print1ToN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Print(1, n);
        sc.close();
    }

    public static void Print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        Print(i + 1, n);
    }
}

// print reverse number n time using recursion

// import java.util.Scanner;
// public class print1ToN{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         namePrint(n, n);
//         sc.close();
//     }

//     public static void namePrint(int i ,int n) {
//         if (i<1) {
//             return;
//         }
//         System.out.println(i);
//         namePrint(i-1, n);
//     }
// }