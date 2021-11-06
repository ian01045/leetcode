package leetcode;

public class Palindrome_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isPalindrome(1231);
		boolean result2 = isPalindrome(12321);
		boolean result3 = isPalindrome(1221);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);

	}

	
// leetcode origin c# solution=>solution 1	
//	    public bool IsPalindrome(int x) {
//	        // Special cases:
//	        // As discussed above, when x < 0, x is not a palindrome.
//	        // Also if the last digit of the number is 0, in order to be a palindrome,
//	        // the first digit of the number also needs to be 0.
//	        // Only 0 satisfy this property.
//	        if(x < 0 || (x % 10 == 0 && x != 0)) {
//	            return false;
//	        }
//
//	        int revertedNumber = 0;
//	        while(x > revertedNumber) {
//	            revertedNumber = revertedNumber * 10 + x % 10;
//	            x /= 10;
//	        }
//
//	        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
//	        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
//	        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
//	        return x == revertedNumber || x == revertedNumber/10;
//	    }
	
// another java solution from forum=> solution 2
// this one not that good, due to it reversed all the number, we can identify if it's a palindrome by reverse only half of the digits(Ian not 08/11/2021)
//	public boolean isPalindrome(int num){
//		   if(num < 0) return  false; 
//		   int reversed = 0, remainder, original = num;
//		   while(num != 0) {
//		        remainder = num % 10; // reversed integer is stored in variable
//		        reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
//		        num  /= 10;  //the last digit is removed from num after division by 10.
//		    }
//		    // palindrome if original and reversed are equal
//		    return original == reversed;
//		}
	
	public static boolean isPalindrome(int num) {
		if(num<0 || num%10==0 && num!=0) {
			return false;
		}
		
		int reverse= 0;
		
		while(num>reverse) {
			reverse=reverse*10+num%10;
			num/=10;
		}
		
		return num==reverse || num==(reverse/10) ;
				
	}
	
}
