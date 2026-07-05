//Find the second largest and second smallest element in an array
//time complexity is O(n) beacause we are traversing the array only once
package Array.easy;


 class solution {
    public int slargest(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        int slargest=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public int ssmallest(int arr[], int n) {
        int smallest = arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < ssmallest && arr[i] != smallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    
}

public class two {
 public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5,8};

        int n = array.length;
        int slargest = new solution().slargest(array, n);
        int ssmallest = new solution().ssmallest(array, n);
        System.out.println("The smallest element in the array is: " + ssmallest);
        System.out.println("The second largest element in the array is: " + slargest);
    }
}
