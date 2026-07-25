//union of two sorted arrays using two pointer method 

package Array.easy;


public class ten {
public static int[] unionOfArrays(int[] arr1, int[] arr2) {
    int n1 = arr1.length;
    int n2 = arr2.length;
    int[] result = new int[n1 + n2];
    int i = 0, j = 0, k = 0;

    while (i < n1 && j < n2) {
        if (arr1[i] < arr2[j]) {
            result[k++] = arr1[i++];
        } else if (arr1[i] > arr2[j]) {
            result[k++] = arr2[j++];
        } else {
            result[k++] = arr1[i++];
            j++;
        }
    }

    while (i < n1) {
        result[k++] = arr1[i++];
    }

    while (j < n2) {
        result[k++] = arr2[j++];
    }

    // Resize the result array to remove unused elements
    int[] finalResult = new int[k];
    System.arraycopy(result, 0, finalResult, 0, k);
    
    return finalResult;

}
}
//time complexity is O(n1+n2) because we are traversing both arrays only once
//space complexity is O(n1+n2) because we are creating a new array to store the union of the two arrays