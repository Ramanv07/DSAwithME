//rule 1. only one disk transferred in 1 step 
//2. smaller disks are always kept on top of larger disks

//tower of hanoi is a mathematical puzzle where we have 3 rods and n disks. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

// approach:
// 1. move n-1 disks from source to helper
// 2. move the nth disk from source to destination
// 3. move n-1 disks from helper to destination


public class tower_of_hanoi {

    public static void main (String[]  args){
        int n =4;
        towerOfHanoi(n, "s", "H", "D");
    }

    public static void towerOfHanoi(int n, String source, String helper, String destination){
    if (n==1){
        
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        return;

    }

    towerOfHanoi(n-1, source, destination, helper);
    System.out.println("transfer disk " + n + " from " + source + " to " + destination);
    towerOfHanoi(n-1, helper, source, destination);

    }
    
}
