package fernando.com.model.dao;

import fernando.com.db.DB;
import fernando.com.model.dao.impl.DepartmentDaoJDBC;
import fernando.com.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
