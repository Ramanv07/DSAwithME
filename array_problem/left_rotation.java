package array_problem;

public class left_rotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        leftRotate(arr, n);

        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int leftRotate(int[] arr, int n ){

        int temp = arr[0];
        for(int i = 1; i <n; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return 0;
    }
}
