package ot.employeeApp.sortAndMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchandSort {
	public static void main(String[] args) throws Exception {

		java.io.File inputFile = new java.io.File("src/input.txt");
//		String outputFile = "src/output.txt";
		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String inputLine;
		List<String> lineList = new ArrayList<String>();

		List<Employee> employeeList = new ArrayList<Employee>();

		Map<String, Employee> map = new HashMap<String, Employee>();

		while ((inputLine = bufferedReader.readLine()) != null) {
			lineList.add(inputLine);
//			System.out.println(inputLine);
			Employee employee = new Employee();
			String[] parts = inputLine.split(",");
			employee.Name = parts[0];
			employee.Email = parts[1];
			employee.Place = parts[2];

			employeeList.add(employee);
			map.put(parts[1], employee);

		}

		Collections.sort(employeeList, new Employee.ComparatorName());
		System.out.println("After sorting the Employee by Name: ");
		for (Employee model : employeeList) {
			System.out.println("\nName: " + model.Name);
			System.out.println("Email: " + model.Email);
			System.out.println("Place: " + model.Place);

		}

		System.out.println("\nEnter the Email address");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (map.containsKey(s)) {
			System.out.println("\nThe Details of input Email " + s + " is:");
			System.out.println("Name: " + map.get(s).Name);
			System.out.println("Place: " + map.get(s).Place);
		} else {
			System.out.println("Wrong Email Address");
		}
	}
//     Map<String, List<Employee>> map = new HashMap <>();
//     map.put(s, employeeList);
//     
//     
//     if (map.containsKey(s)) {
//			System.out.println("Name: " + map.get(s).get(0));
//			System.out.println("Place: " + map.get(s).get(2));
//		}
//		else
//			System.out.println("invalid emailid");

//     FileWriter fileWriter = new FileWriter(outputFile);
//		PrintWriter out = new PrintWriter(fileWriter);
//		for (Employee outputLine : employeeList) {
//			out.println(outputLine);
//		}
//		out.flush();
//		out.close();
//		fileWriter.close();

//     
//     int searchListLength = employeeList.size();
//     for (int i = 0; i < searchListLength; i++) {
//     if (((Employee) employeeList).getName().contains(s)) {
//    	 System.out.println(((Employee) employeeList).getName());
//    	 System.out.println(((Employee) employeeList).getEmail());
//    	 System.out.println(((Employee) employeeList).getPlace());
//     //Do whatever you want here
//     }
//     }

//    Employee jim = new Employee(s);
//   
//    int index = Collections.binarySearch(employeeList, jim,new Employee.ComparatorName());
//  
//    if (index >= 0) {
//        jim = employeeList.get(index);
//        System.out.println("Employess Detail of "+s +" is: " + jim);
//    }
//    else
//    {
//    	System.out.println("You entered wrong name!!! Plase check the given name");
//    }

}
