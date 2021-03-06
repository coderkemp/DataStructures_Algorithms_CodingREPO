package challenges;
/*
 Example 1:

Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
 

Example 2:

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */
public class Palindromicsubstrings {

	  int count=0;
	  
	  public int countSubstrings(String s) {
	        if (s == null || s.length() == 0) return 0;
	        
	        for (int i = 0; i < s.length(); i++) { // i is the mid point
	            extendPalindrome(s, i, i); // odd length;
	            extendPalindrome(s, i, i + 1); // even length
	        }
	        
	        return count;
	    }
	    
	    private void extendPalindrome(String s, int left, int right) {
	        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            count++; left--; right++;
	        }
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
