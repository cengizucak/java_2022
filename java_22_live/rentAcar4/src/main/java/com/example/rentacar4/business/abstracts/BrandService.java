package com.example.rentacar4.business.abstracts;

import com.example.rentacar4.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
	List<Brand> getAll();
    Brand getById(int id);
    void add(Brand brand) throws Exception;    
    void update(Brand brand,int id);    
    void delete(int id) throws Exception; 
    boolean isValid(Brand brand);
    boolean isValidId(int id);
    
    
    public boolean IsNameBlankAndEmpty(Brand brand);
    
}
