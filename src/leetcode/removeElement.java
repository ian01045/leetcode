package leetcode;

public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test_array = new int [] {1,2,3,3,3,4,5};
		int result=removeElement(test_array,3);
		
		for(int i=0;i<result;i++) {
			System.out.println(test_array[i]);
		}
	}

	
    public static int removeElement(int[] nums,int val) {
        int result_array_index=0;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]!=val) {
    			nums[result_array_index++]=nums[i];
    		}
    	}
    	
    	return result_array_index;
    }
}
