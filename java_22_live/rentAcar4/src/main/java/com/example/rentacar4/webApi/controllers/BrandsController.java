package com.example.rentacar4.webApi.controllers;


import com.example.rentacar4.business.abstracts.BrandService;
import com.example.rentacar4.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }


	@GetMapping("/getall")
	public List<Brand> getAll() {
		return brandService.getAll();
	}

	@PostMapping("/add")
	public void add(Brand brand) throws Exception {

		brandService.add(brand);
	}

	@DeleteMapping("/delete{id}")
	public void delete(int id) throws Exception {

		brandService.delete(id);
	}

	@PutMapping("/update")
	public void update(int id, Brand brand) {

		brandService.update(brand, id);
	}

	@GetMapping("/getbyid")
	public Brand getById(int id) {

		return brandService.getById(id);
	}
    
}
