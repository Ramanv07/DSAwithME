package array_problem;
 

/**
 * Sorted_check
 */
public class Sorted_check {


int[] arr = {1,5,8,9};
int n = 5;
public static boolean isSorted(int[] arr ,int n){
    for (int i =1; i<n ; i++)
        if(arr[i] < arr[i-1]){
            return false;
        }
    return true;
}
    
}