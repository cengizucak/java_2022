package com.coding.kodlama_io_devs.dataAccess.abstracts;

import java.util.List;

import com.coding.kodlama_io_devs.entities.concretes.Language;

public interface LanguageRepository {

	List<Language> getAll();

	Language getById(int id);

	void add(Language language);

	void update(int id, Language language);

	void delete(int id) throws Exception;

	boolean isValid(Language language);

	boolean isValidId(int id);

}
