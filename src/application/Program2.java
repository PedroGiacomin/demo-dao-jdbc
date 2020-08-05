package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("===== TEST 1 insert =====");
		departmentDao.insert(new Department(7, "food"));
		System.out.println("ADDED!!!");*/
		
		/*System.out.println("===== TEST 2 update =====");
		departmentDao.update(new Department(6 , "D1"));
		System.out.println("UDATED!!");*/
		
		/*System.out.println("===== TEST 3 deleteById =====");
		departmentDao.deleteById(6);
		System.out.println("DELETED!!");*/
		
		System.out.println("===== TEST 4 findById =====");
		System.out.println("Department to be found's Id: ");
		int id = sc.nextInt();
		Department dep = departmentDao.findById(id);
		System.out.println(dep);
		
		System.out.println("===== TEST 5 findAll =====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

	}

}
