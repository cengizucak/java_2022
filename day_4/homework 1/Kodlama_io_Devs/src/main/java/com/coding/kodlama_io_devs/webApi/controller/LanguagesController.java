package com.coding.kodlama_io_devs.webApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coding.kodlama_io_devs.business.abstracts.LanguageService;
import com.coding.kodlama_io_devs.entities.concretes.Language;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService brandService) {
		this.languageService = brandService;
	}

	@GetMapping("/getall")
	public List<Language> getall() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}

	@DeleteMapping("/delete")
	public void delete( int id) throws Exception {
		languageService.delete(id);
	}

	@PutMapping("/update")
	public void update( int id, Language language) throws Exception {
		languageService.update(id, language);
	}

	@GetMapping("/getById")
	Language getById( int id) {
		return languageService.getById(id);
	}

}
