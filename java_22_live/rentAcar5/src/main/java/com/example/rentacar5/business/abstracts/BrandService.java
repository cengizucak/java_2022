package com.example.rentacar5.business.abstracts;



import com.example.rentacar5.business.requests.CreateBrandsRequest;
import com.example.rentacar5.business.responses.GetAllBrandsResponse;


import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandsRequest createBrandsRequest);
}
