package com.coding.kodlama_io_devs.dataAccess.concretes;

import org.springframework.stereotype.Repository;

import com.coding.kodlama_io_devs.dataAccess.abstracts.LanguageRepository;
import com.coding.kodlama_io_devs.entities.concretes.Language;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "JAVA"));
		languages.add(new Language(2, "C#"));
		languages.add(new Language(3, "PYTHON"));
		
		

	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
	}

	@Override
	public void delete(int id) throws Exception {

		Language languageDelete= getById(id);
		languages.remove(languageDelete);
		

	}

	@Override
	public void update(int id, Language language) {
		Language languageUpdate=getById(language.getId());
		languageUpdate.setName(language.getName());
		

	}

	@Override
	public boolean isValid(Language language) {
		
		return false;
	}

	@Override
	public boolean isValidId(int id) {
		
		return false;
	}

}
