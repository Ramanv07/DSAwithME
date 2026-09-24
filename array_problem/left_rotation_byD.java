package array_problem;

public class left_rotation_byD {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        leftRotateByD(arr, n);

        System.out.println("Array after left rotation by D:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    public static int leftRotateByD(int[] arr, int n ){
        int n = arr.length;
        int d = 2;
         int d = d%n;
        int[] temp = new int[d];
        
        for(int j=0 ;j<d;j++)
            {
             temp[j] = arr[j];

        }
        for (int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }
        return 0;
        for (int i = n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
    }

}
//for optimization we can use reversal algorithm to rotate the array by d elements

reverse(arr, arr+d);
reverse(arr+d, arr+n);
reverse(arr, arr+n);