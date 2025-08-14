package fernando.com.application;

import fernando.com.model.dao.DaoFactory;
import fernando.com.model.dao.SellerDao;
import fernando.com.model.entities.Department;
import fernando.com.model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}