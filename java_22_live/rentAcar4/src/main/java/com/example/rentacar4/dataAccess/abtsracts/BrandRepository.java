package com.example.rentacar4.dataAccess.abtsracts;

import com.example.rentacar4.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
	 List<Brand> getAll();
	    Brand getById(int id);
	    void add(Brand brand);    
	    void update(Brand brand,int id);    
	    void delete(int id) throws Exception;    
	    boolean isValid(Brand brand);
	    boolean isValidId(int id);
    
}
