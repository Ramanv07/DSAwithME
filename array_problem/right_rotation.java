package array_problem;

public class right_rotation {
 
    
public static int rightRotate(int[] arr, int n ){
    int temp = arr[n-1];
    for (int i = 1; i<n; i++){
        arr[i+1] = arr[i];
    }
    arr[0] = temp;
    return 0;
}

}
