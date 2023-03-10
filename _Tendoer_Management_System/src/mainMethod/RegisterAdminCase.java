package mainMethod;

import java.util.Scanner;

import com.bean.Administrator;

import dataBase.Administrator_DAO;
import dataBase.Administrator_DAO_Impl;

public class RegisterAdminCase {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Admin Signup!\n");
		
		System.out.println("Enter Admin Id:");
		int id = sc.nextInt();
		
		System.out.println("Enter Admin Name:");
		String name = sc.next();
		
		System.out.println("Enter Admin DateOfBirth(yyyy/mm/dd):");
		String dob = sc.next();
		
		System.out.println("Enter Admin email:");
		String email = sc.next();
		
		System.out.println("Create Admin password:");
		String password = sc.next();
		
		Administrator admin = new Administrator();
		
		admin.setId(id);
		admin.setName(name);
		admin.setDob(dob);
		admin.setEmail(email);
		admin.setPassword(password);
		
		Administrator_DAO dao = new Administrator_DAO_Impl();
		
		String result = dao.registerAdmin(id, name, dob, email, password);
		
		System.out.println(result);
		
		Multicases.main(args);
		
		sc.close();
	}
}
