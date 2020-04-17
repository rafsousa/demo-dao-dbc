package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import modelEntities.Department;
import modelEntities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste 1 : seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Teste 2 : seller findByDepartent ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 3 : seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 4 : seller insert ===");
		Seller newSeller = new Seller(null, "Bob", "bob@gmail.com", new Date(), 4500.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inseriu novo seller. ID : " + newSeller.getId());
		
		System.out.println("\n=== Teste 5 : seller update ===");
		seller = sellerDao.findById(3);
		seller.setName("MARCAO");
		sellerDao.update(seller);
		System.out.println("Update no seller.");

		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== Teste 6 : seller delete ===");
		System.out.println("Digite o codigo do Seller para deleção : ");
		int id = sc.nextInt();
		sellerDao.deleteById(id); 
		System.out.println("Delete complete.");

		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
