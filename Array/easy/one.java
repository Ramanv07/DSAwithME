package Array.easy;

class solution {
    public int max(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class one {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5,8};

        int n = array.length;
        int max = new solution().max(array, n);
        System.out.println("The maximum element in the array is: " + max);
    }
}
