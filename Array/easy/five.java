package Array.easy;

import java.util.Arrays;

public class five {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // length of unique elements
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 8, 1, 2, 3};
        
        // Sort the array first because the two-pointer method requires sorted input
        Arrays.sort(array);

        int n = removeDuplicates(array);

        System.out.print("The array after removing duplicates is: ");
        for (int k = 0; k < n; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
