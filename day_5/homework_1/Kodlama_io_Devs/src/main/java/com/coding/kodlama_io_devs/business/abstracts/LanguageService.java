package com.coding.kodlama_io_devs.business.abstracts;

import java.util.List;

import com.coding.kodlama_io_devs.entities.concretes.Language;

public interface LanguageService {

	List<Language> getAll();

	Language getById(int id);

	void add(Language language) throws Exception;

	void update(int id, Language language) throws Exception;

	void delete(int id) throws Exception;

	boolean isValid(Language language);

	boolean isValidId(int id);
	
	public boolean IsNameBlankAndEmpty(Language language);

}