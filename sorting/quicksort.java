/**
 * IMPORTANT QUICK SORT NOTES:
 * ----------------------------------------------------------------------------
 * 1. Divide and Conquer: It picks an element as a 'pivot' and partitions 
 * the array around it.
 * 2. Time Complexity: 
 * - Average Case: O(n log n) -> Very fast for large datasets.
 * - Worst Case: O(n²) -> Occurs when the array is already sorted (can be 
 * fixed by choosing a random pivot).
 * 3. Space Complexity: O(log n) due to the recursive call stack.
 * 4. In-place & Unstable: It sorts without allocating extra arrays, but 
 * it may change the relative order of equal elements.
 */

class QuickSortSolution {
    
    // Function to perform recursive quicksort
    public void quickSort(int[] arr, int low, int high) {
        // Base case: If the subarray has 1 or 0 elements, it's already sorted
        if (low < high) {
            
            /* partition() places the pivot element at its exact correct position
               in the sorted array, and returns its index. */
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after the pivot
            quickSort(arr, low, pivotIndex - 1);  // Left subarray
            quickSort(arr, pivotIndex + 1, high); // Right subarray
        }
    }

    // Lomuto Partition Scheme: Consistently chooses the last element as the pivot
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        
        // Index of the smaller element; indicates the right position of pivot found so far
        int i = low - 1; 

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++; // Increment index of smaller element
                
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at (i + 1)
        // This places the pivot firmly between elements smaller than it and elements larger than it
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the final fixed position of the pivot
        return i + 1;
    }
}

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        QuickSortSolution sol = new QuickSortSolution();
        
        // arr.length - 1 provides the last valid index of the array
        sol.quickSort(arr, 0, arr.length - 1);

        // Print the final sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}