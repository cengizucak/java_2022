package kodlama.io.devs.Kodlama.io.Devs.business.abstracts;


import kodlama.io.devs.Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    void add(Language language) throws Exception;

    void delete(int id) throws Exception;

    void update(int id,Language language) throws Exception;

    Language get(int id);

    Language getLanguageById(int id);


}