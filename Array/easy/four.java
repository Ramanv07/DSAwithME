
//remove duplicate elements from an array

//brute force approach => we create a set that not allow duplicate elements and then we add all the elements of the array to the set and then we convert the set to an array and return it

// set time complexity is O(nlogn)
//speace complexity is O(n) because we are using a set to store the elements of the array
//totel time complexity is O(nlogn) + O(n) = O(nlogn)
package Array.easy;

public class four {
     public static int[] removeDuplicates(int[] arr) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5,8,1,2,3};
        int[] result = removeDuplicates(array);
        System.out.print("The array after removing duplicates is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}