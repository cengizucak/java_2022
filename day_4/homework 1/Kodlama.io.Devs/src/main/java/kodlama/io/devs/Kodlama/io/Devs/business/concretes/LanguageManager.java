package kodlama.io.devs.Kodlama.io.Devs.business.concretes;


import kodlama.io.devs.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.devs.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

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
    public void add(Language language) throws Exception{
        if (controlNameIsEmpty(language.getName())){
            throw new Exception("Program adi yazmalisiniz.");
        }
        if (!languageRepository.getAll().isEmpty()){
            for (Language sprok : languageRepository.getAll()) {
                if (sprok.getId() == sprok.getId()) {
                    throw new Exception("Aynı id ile bir kayıt bulunmaktadır.");
                }
                if (sprok.getName().trim().equalsIgnoreCase(language.getName().trim())) {
                    throw new Exception("Aynı isim ile bir kayıt bulunmaktadır.");
                }
            }

        }

        languageRepository.add(language);
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    @Override
    public void update(int id, Language language) throws Exception{


        if (controlNameIsEmpty(language.getName())) {
            throw new Exception("Program yazmaisiniz.");
        }
        if (getLanguageById(language.getId()) == null) {
            throw new Exception("Güncellenmek istenen dil bulunamadı.");
        }
        for (Language sprok : languageRepository.getAll()) {
            if (sprok.getName().trim().equalsIgnoreCase(language.getName().trim()))
                throw new Exception("Aynı isim ile bir kayıt bulunmaktadır.");
        }
        languageRepository.update(id,language);
    }



    @Override
    public Language get(int id) {
        return languageRepository.get(id);
    }

    @Override
    public Language getLanguageById(int id) {
        return languageRepository.getLanguageById(id);
    }




}
