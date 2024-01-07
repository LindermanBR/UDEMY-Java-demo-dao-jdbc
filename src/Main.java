
import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        System.out.println(department);
        System.out.println("--------------------------------------------------");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, department);
        System.out.println(seller);
        System.out.println("--------------------------------------------------");

        SellerDao sellerDao = DaoFactory.createSellerDao();

    }
}