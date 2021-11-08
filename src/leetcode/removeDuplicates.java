package leetcode;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test_array = new int [] {1,2,3,3,4,5};
		int result=removeDuplicates(test_array);
		
		for(int i=0;i<result;i++) {
			System.out.println(test_array[i]);
		}

	}
	
//    public int removeDuplicates(int[] nums) {
//        int i=0;
//        for(int num:nums){
//            if (num!=nums[i]){
//                nums[++i]=num;
//            }
//        }
//        return i+1;
//    }
	
    public static int removeDuplicates(int[] nums) {
        
    	int result_array_index=0;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]!=nums[result_array_index]) {
    			nums[++result_array_index]=nums[i];
    		}
    	}
    	
    	return result_array_index+1;
    }

}
