package application;

import java.util.Date;

import modelEntities.Departament;
import modelEntities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Departament obj = new Departament(1, "Books");
		
		Seller seller = new Seller(21, "Ana", "ana@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(seller);
		
	}

}
