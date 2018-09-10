package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<String>q=new LinkedList<>();//new PriorityQueue<>();//new LinkedList<>();
q.add("Delta");
q.add("American");
q.add("Qatar");
q.add("Turkish ");
System.out.println(q);
System.out.println(q.peek());
System.out.println();
	}

}
