package set;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
	Set<Integer> uniqueNumbers=new HashSet<>();
	uniqueNumbers.add(243);
	uniqueNumbers.add(123);
	uniqueNumbers.add(234);
	uniqueNumbers.add(654);
	uniqueNumbers.add(654);
	System.out.println(	uniqueNumbers);
	//uniqueNumbers.
	List<String>list=Arrays.asList("one","two","three","four","three","one","ten","ten");
	System.out.println(list);
	Set<String> set=new HashSet<>(list);
System.out.println(set);
for (String string : set) {
	System.out.println(string.toUpperCase());
	
}
	}

}
