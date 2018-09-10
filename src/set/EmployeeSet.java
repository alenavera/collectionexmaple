package set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
		//Set<Employee>employees=new HashSet<>();
		Set<Employee>employees=new HashSet<>();
		employees.add(new Employee(123,"Gulshan"));
		employees.add(new Employee(124,"Jack"));
		employees.add(new Employee(126,"Amena"));
		employees.add(new Employee(126,"Patel"));
		employees.add(new Employee(126,"Patel"));
		System.out.println(employees);


	}

}
