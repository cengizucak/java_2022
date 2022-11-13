package com.example.rentacar5.dataAccess.abtsracts;

import com.example.rentacar5.entiries.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	// List<Brand> getAll();
}
