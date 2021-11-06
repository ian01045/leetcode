package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = romanToInt("LVIII");
		int result2 = romanToInt("MCMXCIV");
		System.out.println(result);
		System.out.println(result2);

	}

// solution 1 by Ian 08/14/2021
//	public static int romanToInt(String s) {
//	        char[] input = new char[s.length()];
//			input = s.toCharArray();
//			
//			Map<Character,Integer> map= new HashMap<Character,Integer>();
//			map.put('I', 1);
//			map.put('V', 5);
//			map.put('X', 10);
//			map.put('L', 50);
//			map.put('C', 100);
//			map.put('D', 500);
//			map.put('M', 1000);
//			
//			int result =0;
//			for(int i =0; i<input.length ; i++) {
//				if (i<input.length-1 
//	            && ((input[i]=='I' && (input[i+1]=='V' || input[i+1]=='X'))
//				||  (input[i]=='X' && (input[i+1]=='L' || input[i+1]=='C'))
//				||  (input[i]=='C' && (input[i+1]=='D' || input[i+1]=='M'))))
//				{
//					int current_num=map.get(input[i]);
//					int next_num=map.get(input[i+1]);
//					result = result+next_num-current_num;
//					i +=1;
//				}else{
//					int current_num=map.get(input[i]);
//					result = result+current_num;
//				}
//			}
//			
//			return result;
//	    }
	
//solution 2 from leetcode	
	// first prepare a method to return value from Roman character
//	public static int getValue(char c)
//	{
//	    if(c=='I')
//	     return 1;
//	    else if(c=='V')
//	        return 5;
//	    else if(c=='X')
//	        return 10;       
//	    else if(c=='L')
//	        return 50;
//	    else if(c=='C')
//	        return 100;
//	    else if(c=='D')
//	        return 500;
//	    else if(c=='M')
//	        return 1000;
//	    return 0;
//	}
//	
//	public static int romanToInt(String s) {
//        
//	     int sum=0;
//		 int l=s.length()-1;
//		 int c1,c2;
//		 
//		 //run for loop before the last char
//			for(int i=0;i<l;i++)
//			{    
//				 c1=getValue(s.charAt(i));
//				 c2=getValue(s.charAt(i+1));
//				 
//				 //if Roman char with small value put in front of big value, need subtract the small value from total
//				 //this is the key idea how Roman char value calculation
//				 if(c1>=c2)
//				 {
//					 sum=sum+c1;
//				 }
//				 else {
//					 sum=sum-c1;
//				 }
//			}
//	    
//			//last char will only be add to the total
//			c2=getValue(s.charAt(l));
//			return sum+c2;
//	}
//	
	
//solution 3 integration solution 1&2 for a more clear solution, but use haspmap take more resource of memory	
	public static int romanToInt(String s) {
	    
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
        
        int sum = 0;
        int l=s.length()-1;
        int current,next;
        
        for(int i=0;i<l;i++){
            current=map.get(s.charAt(i));
            next=map.get(s.charAt(i+1));
            
            if(current < next ){
                sum = sum - current;
            }else{
                sum = sum + current;
            }
        }
        
        return sum+map.get(s.charAt(l));
    
	}

}
