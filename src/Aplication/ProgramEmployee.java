package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=0;i < n; i++) {
			System.out.printf("Emplyoee #%d\n1", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Entities.Employee(id, name, salary));
		}
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x-> x.getId()== id ).findFirst().orElse(null);
		if(emp==null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double porcentage = sc.nextDouble();
			emp.increaseSalary(porcentage);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee obj: list) {
			System.out.println(obj);
		}
		
		
		
		
		System.out.println("");
		sc.close();

	}

}
