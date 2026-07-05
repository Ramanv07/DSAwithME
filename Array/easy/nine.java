//union of two sorted arrays using set
package Array.easy;
import java.util.Arrays;
import java.util.HashSet;


public class nine {
    
public static int[] unionOfArrays(int[] arr1, int[] arr2) {
    HashSet<Integer> set = new HashSet<>();
    
    // Add elements from the first array to the set
    for (int num : arr1) {
        set.add(num);
    }
    
    // Add elements from the second array to the set
    for (int num : arr2) {
        set.add(num);
    }
    
    // Convert the set back to an array
    int[] result = new int[set.size()];
    int index = 0;
    for (int num : set) {
        result[index++] = num;
    }
    
    // Sort the result array before returning
    Arrays.sort(result);
    
    return result;
}
public static void main(String[] args) {
    int[] arr1 = {1,1,1,1, 2,2,2,2, 3, 4,4,4,4,4, 5};
    int[] arr2 = {4, 5, 6, 7, 8,8,8,8,8};
    
    int[] unionArray = unionOfArrays(arr1, arr2);
    
    System.out.print("The union of the two arrays is: ");
    for (int num : unionArray) {
        System.out.print(num + " ");
    }
}
}