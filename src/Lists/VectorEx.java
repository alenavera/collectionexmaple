package Lists;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//Vector is syncronized
		Vector<String>vector=new Vector<>();
		//ArrayList<String>array=new ArrayList<>();
		
		vector.add("Peter");
		vector.add("aika");
		vector.add("busra");
		vector.add("kamila");
		System.out.println(vector);
	}

}
