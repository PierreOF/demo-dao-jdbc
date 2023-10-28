package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller FindyById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println("=== TEST 2: seller FindyByDepartmentId ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: seller FindAll ===");

        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }

    }
}
