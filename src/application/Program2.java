package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: department insert ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = new Department(null, "D1");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println("\n=== TEST 2: department findById ===");
		dep = departmentDao.findById(2);
		System.out.println(dep);	
		
		System.out.println("\n=== TEST 3: department update ===");
		dep.setName("Games");
		departmentDao.update(dep);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 4: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.print("Delete completed");
		sc.close();
	}
}