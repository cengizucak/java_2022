package com.example.rentacar5.webApicontrollers;


import com.example.rentacar5.business.abstracts.BrandService;
import com.example.rentacar5.business.requests.CreateBrandsRequest;
import com.example.rentacar5.business.responses.GetAllBrandsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("getall")
    public List<GetAllBrandsResponse> getir(){
        return brandService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandsRequest createBrandsRequest) {
    	this.brandService.add(createBrandsRequest);
    }
}
