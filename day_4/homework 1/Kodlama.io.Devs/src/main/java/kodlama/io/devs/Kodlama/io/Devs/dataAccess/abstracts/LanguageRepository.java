package kodlama.io.devs.Kodlama.io.Devs.dataAccess.abstracts;


import kodlama.io.devs.Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {


    void add(Language language );

    void update(int id,Language language);

    void delete(int id);

    Language get(int id);
    List<Language> getAll();

    Language getLanguageById(int id);
}
