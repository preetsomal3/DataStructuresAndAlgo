package StringExamples;

public class Palindrome {

	
	public static boolean isPalindrome(String s) {
		
		int start = 0;
		int end = s.length()-1;
		
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
			
			
		}
		
		
		return true;
		
		
		
	}
	public static void main(String[] args) {

		String s = "madama";
		
		System.out.println("String is Palindrome "+isPalindrome(s));
	
	}

}
