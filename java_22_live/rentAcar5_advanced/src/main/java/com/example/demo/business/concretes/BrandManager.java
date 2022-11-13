package com.example.demo.business.concretes;
import org.springframework.stereotype.Service;
import com.example.demo.business.abstracts.BrandService;

import com.example.demo.business.requests.CreateBrandsRequest;
import com.example.demo.business.requests.DeleteBrandsRequest;
import com.example.demo.business.requests.UpdateBrandsRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.business.responses.GetByIdBrendsResponse;
import com.example.demo.concretes.Brand;
import com.example.demo.dataAccess.abtsracts.BrandRepository;
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

	@Override
	public void delete(DeleteBrandsRequest deleteBrandsRequest) {
		brandRepository.deleteById(deleteBrandsRequest.getId());
		
	}

	@Override
	public void update(UpdateBrandsRequest updateBrandsRequest) {
		Brand brand=  brandRepository.findById(updateBrandsRequest.getId()).get();
		brand.setName(updateBrandsRequest.getName());
		brandRepository.save(brand);
		
	}

	

	@Override
	public boolean isValid(Brand brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidId(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GetByIdBrendsResponse getById(int id) {
		
		Brand brandgetById=brandRepository.findById(id).get();
		GetByIdBrendsResponse responseItem= new GetByIdBrendsResponse();
		responseItem.setId(brandgetById.getId());
		responseItem.setName(brandgetById.getName());
		
		return responseItem;
	}

	
	

	
}
