//left rotate an array by one place
//time complexity is O(n) beacause we are traversing the array only once 
//space complexity is O(1) because we are not using any extra space but in algo  use o(n) that array size
package Array.easy;

public class six {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int temp =arr[0];
        for (int i= 1;i<arr.length;i++){
            arr[i-1] = arr[i];

        }
        arr[arr.length-1]=temp;
        System.err.println("The array after left rotation is: " + java.util.Arrays.toString(arr));
    }
     
}
