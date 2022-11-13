package com.coding.kodlama_io_devs.business.concretes;

import org.springframework.stereotype.Service;

import com.coding.kodlama_io_devs.business.abstracts.LanguageService;

import com.coding.kodlama_io_devs.dataAccess.abstracts.LanguageRepository;
import com.coding.kodlama_io_devs.entities.concretes.Language;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository brandRepository) {
		this.languageRepository = brandRepository;
	}

	private boolean controlNameIsEmpty(String name) {
		return name == null || name.trim().isEmpty();
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language languageValid) throws Exception {

		if (isValid(languageValid)) {
			throw new Exception("İsim tekrar edemez.");
		} else if (isValidId(languageValid.getId())) {
			throw new Exception("id tekrar edemez");
		} else if (!IsNameBlankAndEmpty(languageValid)) {
			throw new Exception("Program ismi boş geçilemez");
		}
		languageRepository.add(languageValid);
	}

	@Override
	public void update(int id, Language language) throws Exception {

		if (controlNameIsEmpty(language.getName())) {
			throw new Exception("Program yazmaisiniz.");
		}
		if (getById(language.getId()) == null) {
			throw new Exception("Güncellenmek istenen dil bulunamadı.");
		}
		for (Language languageUp : languageRepository.getAll()) {
			if (languageUp.getName().trim().equalsIgnoreCase(language.getName().trim()))
				throw new Exception("Aynı isim ile bir kayıt bulunmaktadır.");
		}
		languageRepository.update(id, language);
	}

	/*
	 * @Override public void update(Language language, int id) {
	 * languageRepository.add(language);
	 * 
	 * }
	 * 
	 */

	@Override
	public void delete(int id) throws Exception {
		languageRepository.delete(id);
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public boolean isValid(Language language) {

		for (Language languageValid : getAll()) {
			if (languageValid.getName().equalsIgnoreCase(language.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isValidId(int id) {
		for (Language languageId : getAll()) {
			if (languageId.getId() == id) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean IsNameBlankAndEmpty(Language language) {
		if (language.getName().isEmpty() == language.getName().isBlank()) {
			return true;
		}
		return false;
	}

}
