package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		System.out.println("=== TEST 1: department insert ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = new Department(null, "D1");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
	}

}
