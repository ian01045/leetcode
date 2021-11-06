package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[] {1,2,6,3};
		int target =5;
		int[] result = new int[2];
		
		result=twoSum(numbers,target);
		System.out.println(result[0]+","+result[1]);

	}
	
//	public static int[] twoSum(int[] numbers, int target) {
//	    int[] result = new int[2];
//	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	    for (int i = 0; i < numbers.length; i++) {
//	        if (map.containsKey(target - numbers[i])) {
//	            result[1] = i;
//	            result[0] = map.get(target - numbers[i]);
//	            return result;
//	        }
//	        map.put(numbers[i], i);
//	    }
//	    return result;
//	}
	
	public static int[] twoSum(int[] numbers, int target ) {
		int[] result = new int[2];
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		for (int i=0; i<numbers.length; i++) {
			if (map.containsKey(target-numbers[i])) {
				result[1]=i;
				result[0]=map.get(target-numbers[i]);
				return result;
			}
			map.put(numbers[i],i );
		}
		return result;
	}

}
