package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedEmployeesEx {

	public static void main(String[] args) {
		String str1="B";
		String str2="1";
		System.out.println(str1.compareTo(str2));
//equals== 0
//first one is larger you get ----->1
		//first one is smaller you get ----->-1
	Employee emp1=new Employee(4,"Bob");
	Employee emp2=new Employee(5,"Maria");
	Employee emp3=new Employee(7,"ZEBRA");
	Employee emp4=new Employee(10,"ARMAN");
	Employee emp5=new Employee(6,"Sam");
	System.out.println(emp1.compareTo(emp2));
	List<Employee>emps=new ArrayList<>();
	emps.add(emp1);
	emps.add(emp2);
	emps.add(emp3);
	emps.add(emp4);
	emps.add(emp5);
	System.out.println(emps);
	Collections.sort(emps);
	System.out.println(emps);
	}
//TRY SORTED SET
}
