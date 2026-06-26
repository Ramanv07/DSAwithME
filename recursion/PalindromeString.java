public class PalindromeString {
    
    public static void main(String[] args) {
        String s = "MADAM";
        
        // Call the recursive function starting from index 0
        boolean isPalindrome = f(0, s);
        
        System.out.println("Is \"" + s + "\" a palindrome? " + isPalindrome);
    }

    // Recursive function to check palindrome status
    public static boolean f(int i, String s) {
        // Base Case: If we reach or pass the middle, it's a palindrome
        if (i >= s.length() / 2) {   
            return true;
        }
        
        // If characters from start and end don't match, it's not a palindrome
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {   
            return false;
        }
        
        // Explore the next pair of characters moving inward
        return f(i + 1, s);
    }
}