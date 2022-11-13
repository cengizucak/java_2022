package com.example.rentacar5.business.concretes;

import com.example.rentacar5.business.abstracts.BrandService;
import com.example.rentacar5.business.requests.CreateBrandsRequest;
import com.example.rentacar5.business.responses.GetAllBrandsResponse;
import com.example.rentacar5.dataAccess.abtsracts.BrandRepository;
import com.example.rentacar5.entiries.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {

		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();

		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());

			brandsResponses.add(responseItem);
		}

		// is kurallari

		return brandsResponses;
	}

	@Override
	public void add(CreateBrandsRequest createBrandsRequest) {

		Brand brand = new Brand();
		brand.setName(createBrandsRequest.getName());

		this.brandRepository.save(brand);

	}

	
}
