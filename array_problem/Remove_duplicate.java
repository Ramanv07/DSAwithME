package array_problem;

public class Remove_duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        int newLength = removeduplicates(arr, n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
 public static int removeduplicates(int[] arr, int n ) {
int i =0;
for (int j = 1; j < n; j++) {
    if (arr[i] != arr[j]) {
        arr[i] = arr[j];
        i++;
    }

}
 return i+1;
 }
}
