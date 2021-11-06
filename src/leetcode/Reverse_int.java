package leetcode;

public class Reverse_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = reverse(123);
		int result2 = reverse(123456);
		System.out.println(result);
		System.out.println(result2);

	}
	
//    public int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
//    }
	
	
	
	public static int reverse(int x) {
		// define reverse varibale
		int rev = 0;
		
		// start use mod to get each digit from left hand side
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			//chk if the current reverse value larger or smaller than the integer boundary
			//the last digit of 2 to the 32th -1 is 7
			//we can get the last digit by below rules 
			//at beginning 2 to the 0=>last digit is 1
			//and then start have the pattern as below
			//2 to the 1=>last digit is 2
			//2 to the 2=>last digit is 4
			//2 to the 3=>last digit is 8
			//2 to the 4=>last digit is 6
			//2 to the 5=>last digit is 2
			//2 to the 6=>last digit is 4
			//2 to the 7=>last digit is 8
			//2 to the 8=>last digit is 6
			//base on this we can know that 2 to the 32th=>last digit is 8
			//so 2 to the 32th -1=>last digit is 7
			//if rev == Integer.MAX_VALUE/10 ** last digit (e.g. pop) >7 need more digit to keep the value=>so it cause overflow
			//and its same idea for the negative boundary
			if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) {
				return 0;
			}
			
			if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) {
				return 0;
			}
			
			//calculate reverse value by multiply 10 when each time get digit
			rev = rev * 10 + pop;
		}
		
		return rev;
	}

}
