package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test_str = "{[([}])]}";
		
		boolean result = isValid(test_str);
		
		System.out.println(result);

	}
	
//    public boolean isValid(String s) {
//        if(s.length() <= 1) return false;
//        HashMap<Character,Character> map = new HashMap<>();
//        map.put(')','(');
//        map.put(']','[');
//        map.put('}','{');
//        Deque<Character> stack = new ArrayDeque<>();
////        Stack<Character> stack = new Stack<>();
//        stack.push(s.charAt(0));
//        for(int i = 1; i < s.length(); i++){
//            if(!map.containsKey(s.charAt(i))) stack.push(s.charAt(i));
//            else if(stack.peek() == map.get(s.charAt(i))) stack.pop();
//            else return false;
//        }
//        if(stack.isEmpty()) return true;
//        else return false;
//    }
	
	public static boolean isValid(String s) {
		if (s.length() <= 1) {
			return false;
		}
		HashMap<Character, Character> paren_map = new HashMap<>();
		paren_map.put(')', '(');
		paren_map.put(']', '[');
		paren_map.put('}', '{');

		Stack<Character> paren_stack = new Stack<>();
		paren_stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (!paren_map.containsKey(s.charAt(i))) {
				paren_stack.push(s.charAt(i));
			} else if (!paren_stack.isEmpty() && (paren_stack.peek() == paren_map.get(s.charAt(i)))) {
				paren_stack.pop();
			}else {
				return false;
			}
		}

		if (paren_stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
}
