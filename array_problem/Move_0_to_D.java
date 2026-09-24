package array_problem;

public class Move_0_to_D {
    public static int moveZeroes(int[] arr,int n ){
       int j =-1;
       for (int i = 0; i<n; i++){
        if (arr[i] ==0 ){
            j=i;
            break;
        }
    }
        for (int i = j+1; i<n; i++){
            if (arr[i] !=0 ){
                swap(arr, i, j);
                j++;
            }
        }
        static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
       }  
    }
}
