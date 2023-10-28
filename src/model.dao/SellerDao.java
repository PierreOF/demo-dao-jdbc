package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void uptade(Seller obj);
    void deleteById(Integer Id);

    Seller findById(Integer Id);
    List<Seller> findAll();

}
