package set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		Set<String>set=new TreeSet<>();
		SortedSet<String>sortedSet=new TreeSet<>();
		set.add("TA");
		set.add("UB");
		set.add("AA");
		set.add("ED");
		System.out.println(set);
		System.out.println();
		sortedSet.add("TA");
		sortedSet.add("UB");
		sortedSet.add("AA");
		sortedSet.add("ED");
		System.out.println(sortedSet);

	}

}
