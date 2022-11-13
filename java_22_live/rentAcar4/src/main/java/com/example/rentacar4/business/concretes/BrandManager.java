package com.example.rentacar4.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rentacar4.business.abstracts.BrandService;
import com.example.rentacar4.dataAccess.abtsracts.BrandRepository;
import com.example.rentacar4.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {

		return brandRepository.getAll();
	}

	@Override
	public Brand getById(int id) {

		return brandRepository.getById(id);
	}

	@Override
	public void add(Brand brand) throws Exception {

		if (isValid(brand)) {
			throw new Exception("İsim tekrar edemez.");
		} else if (isValidId(brand.getId())) {
			throw new Exception("id tekrar edemez");
		} else if (IsNameBlankAndEmpty(brand)) {
			throw new Exception("Marka ismi boş geçilemez");
		}
		brandRepository.add(brand);

	}

	@Override
	public void update(Brand brand, int id) {
		brandRepository.update(brand, id);

	}

	@Override
	public void delete(int id) throws Exception {
		brandRepository.delete(id);
	}

	@Override
	public boolean isValid(Brand brand) {
		for (Brand brandValid : getAll()) {
			if (brandValid.getName().equalsIgnoreCase(brand.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isValidId(int id) {

	for (Brand  brandVaildId : getAll()) {
		if (brandVaildId.getId()==id) {
			return true;
		}
	}
		return false;
	}

	@Override
	public boolean IsNameBlankAndEmpty(Brand brand) {

		if (brand.getName().isEmpty() || brand.getName().isBlank()) {
			return true;
		}
		return false;
	}

}
