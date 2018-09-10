package Lists;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//LAST IN,FIRST OUT
Stack<String>stack=new Stack<>();
stack.push("Java");
stack.push("OCA");
stack.push("Selenium Cook Book");
stack.push("10x");
System.out.println(stack.peek());
System.out.println(stack);
System.out.println(stack.search("Java"));
System.out.println(stack.search("OCA"));




	}

}
