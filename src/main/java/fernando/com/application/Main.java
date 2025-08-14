package fernando.com.application;

import fernando.com.model.dao.DaoFactory;
import fernando.com.model.dao.SellerDao;
import fernando.com.model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}