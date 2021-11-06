package leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] test_array = new String [] {"abc","abc","abc"};
		
		String result = longestCommonPrefix_Vertical(test_array);
		
		System.out.println(result);


	}
	
	//solution 1 horizontal scanning
//leetcode solution
//	 public static String longestCommonPrefix(String[] strs) {
//		    if (strs.length == 0) return "";
//		    String prefix = strs[0];
//		    for (int i = 1; i < strs.length; i++) {
//		    	
//	        	int ind = strs[i].indexOf(prefix);
//	        	System.out.println(ind);
//	        	
//		        while (strs[i].indexOf(prefix) != 0) {
//		            prefix = prefix.substring(0, prefix.length() - 1);
//		            System.out.println(prefix);
//		            if (prefix.isEmpty()) return "";
//		        }        
//		    }
//		    return prefix;
//		    
//		}

	public static String longestCommonPrefix_Horizontal(String[] strs) {
		if(strs.length==0) {
			return "";
		}else {
			String prefix = strs[0];
			
			for(int i=1;i<strs.length;i++) {
				
				while(strs[i].indexOf(prefix)!=0) {
					prefix = prefix.substring(0,prefix.length()-1);
					if(prefix.length()==0) {
						return "";
					}
				}
			}
			
			return prefix;
		}
	}
	
	
//solution 2 Vertical scanning
//leetcode solution
//	public String longestCommonPrefix(String[] strs) {
//	    if (strs == null || strs.length == 0) return "";
//	    for (int i = 0; i < strs[0].length() ; i++){
//	        char c = strs[0].charAt(i);
//	        for (int j = 1; j < strs.length; j ++) {
//	            if (i == strs[j].length() || strs[j].charAt(i) != c)
//	                return strs[0].substring(0, i);             
//	        }
//	    }
//	    return strs[0];
//	}

	
	public static String longestCommonPrefix_Vertical(String[] strs) {
		if(strs == null || strs.length == 0) {
			return null;
		}else {
			for(int i=0;i<strs[0].length();i++) {
				char current_char= strs[0].charAt(i);
				
				for(int j=1;j<strs.length;j++) {
					if(i==strs[j].length()||strs[j].charAt(i)!=current_char) {
						return strs[0].substring(0,i);
					}
				}
			}
			return strs[0];
		}
	}
}
