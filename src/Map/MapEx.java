package Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
	//K,V
		//Map<String, Double[]>menu=new HashMap<>();
		Map<String, Double>menu=new HashMap<>();
		menu.put("Coffee", 2.99);
		menu.put("Cappuchino", 3.99);
		menu.put("Hot Chocolate", 9.49);
		menu.put("Hot Chocolate", 10.49);
		//How to find out how many elements
		menu.size();
		System.out.println( menu);
		System.out.println(menu.get("Coffee"));
		System.out.println(menu.keySet());
		System.out.println(menu.values());
		//System.out.println(menu.remove("Coffee"));
		System.out.println( menu);
		menu.replace("Cappuchino", 3.99, 5.99);
		System.out.println(menu);
		if(menu.containsKey("Coffee")) {
			System.out.println("Coffee is there");
			//How to find key by value
			//need to loop and check values
			menu.put("reg Coffee", menu.get("Coffee"));
			System.out.println(menu);
		}
			}

}
