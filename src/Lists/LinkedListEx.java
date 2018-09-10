package Lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String>linkedL=new LinkedList<>();
		linkedL.add("John");
		linkedL.add("Mark");
		linkedL.add("Olga");
		linkedL.add("Jack");
		linkedL.add("Adam");
		System.out.println(	linkedL.size()+":"+	linkedL);
		System.out.println(	linkedL.indexOf("Mark"));
		linkedL=(LinkedList)linkedL;
		System.out.println(linkedL);
		
	LinkedList<String>linkedLL=(LinkedList)linkedL;
		
		linkedLL.add("Bob");
		System.out.println(linkedLL);
		linkedLL.addLast("Logi");
	System.out.println(	linkedLL.element());
		linkedLL.addFirst("Gulshan");;
		System.out.println(linkedLL);
		linkedLL.add(1,"Apple");
		System.out.println(linkedLL);
		linkedLL.removeFirst();//if list is empty,it will throw exception
		System.out.println(linkedLL);
		linkedLL.poll();//will not throw exception
		System.out.println(linkedLL);
		linkedLL.peekFirst();
		System.out.println(linkedLL);
		linkedLL.peekLast();
		System.out.println(linkedLL);
		
		System.out.println(linkedLL+"=======");
		System.out.println(linkedLL.peekFirst());
		System.out.println(linkedLL.peek()+"==========");
		System.out.println(linkedLL.peekLast());
		System.out.println(linkedLL.pollLast()+"2");
		System.out.println(linkedLL.peekFirst());
		System.out.println(linkedLL.get(2));
		
		
		
		}
		
		
		
		
	}


