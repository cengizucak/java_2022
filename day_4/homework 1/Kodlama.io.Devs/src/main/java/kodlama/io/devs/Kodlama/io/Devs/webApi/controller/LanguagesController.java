package kodlama.io.devs.Kodlama.io.Devs.webApi.controller;


import kodlama.io.devs.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.devs.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {


    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService brandService) {
        this.languageService = brandService;
    }


    @GetMapping("/getirhepsini")
    public List<Language> getall() {
        return languageService.getAll();
    }


    @PostMapping("/add")
    public void getSave(Language language) throws Exception {
        languageService.add(language);
    }

    @DeleteMapping("/delete")
    public void delete(int id) throws Exception {
        languageService.delete(id);
    }


    @PutMapping("/update")
    public void getUpdate(int id, Language language) throws Exception {
        languageService.update(id, language);
    }


    @GetMapping("/get")
    public Language get(int id) {
        return languageService.get(id);
    }

    @GetMapping("/getById")
    Language getLanguageById(int id) {
        return languageService.getLanguageById(id);
    }


}

