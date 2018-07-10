package ot.employeeApp.sortAndMap;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	String Name;
	String Email;
	String Place;

	public Employee() {

	}

	public Employee(String Name) {
		this.Name = Name;

	}

	String getName() {
		return Name;
	}

	String getEmail() {
		return Email;
	}

	String getPlace() {
		return Place;
	}

	@Override
	public String toString() {
		return "Employee{" + "Name=" + Name + ", Email=" + Email + ", Place=" + Place + '}';
	}

	// Inner class
	static class ComparatorName implements Comparator<Employee> {
		@Override
		public int compare(Employee obj1, Employee obj2) {
			// sort Employee on basis of name(ascending order)
			return obj1.Name.compareTo(obj2.Name);
		}
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

//    //static Inner class
//    static class ComparatorId  implements Comparator<Employee>{
//       @Override
//        public int compare(Employee obj1, Employee obj2) {
//           //sort Employee on basis of id(ascending order)
//           return obj1.id.compareTo(obj2.id);
//        }
//    }

//	
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
