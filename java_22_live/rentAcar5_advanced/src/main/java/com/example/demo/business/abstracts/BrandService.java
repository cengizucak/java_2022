package com.example.demo.business.abstracts;

import java.util.List;
import com.example.demo.business.requests.CreateBrandsRequest;
import com.example.demo.business.requests.DeleteBrandsRequest;
import com.example.demo.business.requests.UpdateBrandsRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.business.responses.GetByIdBrendsResponse;
import com.example.demo.concretes.Brand;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();

	GetByIdBrendsResponse getById(int id);

	void add(CreateBrandsRequest createBrandsRequest);

	void delete(DeleteBrandsRequest deleteBrandsRequest);

	void update(UpdateBrandsRequest updateBrandsRequest);

	boolean isValid(Brand brand);

	boolean isValidId(int id);

}
