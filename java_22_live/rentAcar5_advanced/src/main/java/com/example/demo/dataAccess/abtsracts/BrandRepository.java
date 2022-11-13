package com.example.demo.dataAccess.abtsracts;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	// List<Brand> getAll();
}
