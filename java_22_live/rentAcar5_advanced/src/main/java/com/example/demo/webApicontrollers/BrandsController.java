package com.example.demo.webApicontrollers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.BrandService;
import com.example.demo.business.requests.CreateBrandsRequest;
import com.example.demo.business.requests.DeleteBrandsRequest;
import com.example.demo.business.requests.UpdateBrandsRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.business.responses.GetByIdBrendsResponse;

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
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }
    
    @GetMapping("/getById")
    public GetByIdBrendsResponse getById(@RequestParam int id) {
		return brandService.getById(id);}
  
   
    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandsRequest createBrandsRequest) {
    	this.brandService.add(createBrandsRequest);
    }
    @PostMapping("/update")
	public void update(UpdateBrandsRequest updateBrandsRequest) {
		brandService.update(updateBrandsRequest);
	}
    
    @DeleteMapping("/delete")
	public void delete(DeleteBrandsRequest deleteBrandsRequest) {
		brandService.delete(deleteBrandsRequest);
	}
    
}
