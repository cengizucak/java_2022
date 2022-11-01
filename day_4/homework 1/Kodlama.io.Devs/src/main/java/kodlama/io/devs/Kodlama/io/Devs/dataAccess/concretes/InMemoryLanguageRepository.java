package kodlama.io.devs.Kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.devs.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

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
        languages.add(new Language(3, "PYTHON"));

    }


    @Override
    public void add(Language language) {
        languages.add(language)
        ;
    }

    @Override
    public void delete(int id) {

        for (Language delete : languages) {
            languages.remove(delete);
        }

    }

    @Override
    public void update(int id, Language language) {
        for (Language update : languages) {
            if (update.getId() == id) {
                update.setName(language.getName());
            }
        }

    }


    @Override
    public Language get(int id) {
        for (Language getir : languages) {
            if (getir.getId() == id) {
                return getir;
            }
        }
        return null;
    }

    @Override
    public List<Language> getAll() {

        return languages;
    }

    @Override
    public Language getLanguageById(int id) {
        for(Language language: languages) {
            if (language.getId()==id){
                return language;
            }
        }
        return null;
    }


}
