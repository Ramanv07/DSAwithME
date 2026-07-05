
//check array is shorted or not
//time complexity is O(n) beacause we are traversing the array only once
package Array.easy;

public class three {
    public static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        int array[] = {1, 2,1, 3, 4, 5};

        int n = array.length;
        boolean sorted = isSorted(array, n);
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
