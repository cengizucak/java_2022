package com.example.rentacar4.dataAccess.concretes;

import com.example.rentacar4.dataAccess.abtsracts.BrandRepository;
import com.example.rentacar4.entities.concretes.Brand;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository // bu sinif bir DataAcces nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands;

	public InMemoryBrandRepository() {

		brands = new ArrayList<Brand>();
		brands.add(new Brand(1, "BMW"));
		brands.add(new Brand(2, "FIAT"));
		brands.add(new Brand(3, "FORD"));
		brands.add(new Brand(4, "RENO"));
		brands.add(new Brand(5, "PUMA"));
		brands.add(new Brand(6, "KUGA"));
		brands.add(new Brand(6, "FJK8"));

	}

	@Override
	public List<Brand> getAll() {
		return brands;
	}

	@Override
	public Brand getById(int id) {
		for (Brand brand : brands) {
			if (brand.getId() == id) {
				return brand;
			}

		}
		return null;
	}

	@Override
	public void add(Brand brand) {
		brands.add(brand);

	}

	@Override
	public void update(Brand brand, int id) {
		Brand brandUp = getById(brand.getId());
		brandUp.setName(brand.getName());
	}

	@Override
	public void delete(int id) throws Exception {
		Brand brandDelete = getById(id);
		brands.remove(brandDelete);

	}

	@Override
	public boolean isValid(Brand brand) {

		return false;
	}

	@Override
	public boolean isValidId(int id) {

		return false;
	}
}
