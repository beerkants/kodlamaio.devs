package kodlama.io.devs.webApi.conttollers;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/languages")
public class languagesControllers {
    private LanguageService languageService;


    @Autowired
    public languagesControllers (LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public Language getOne(@PathVariable()int id) {
        return languageService.getOne(id);
    }

    @PostMapping
    public void add(@RequestBody Language language) {
        languageService.add(language);
    }
    @DeleteMapping
    public void delete(@RequestBody Language language) {
        languageService.delete(language);
    }
    @PutMapping("/{setName}")
    public void update(@RequestBody Language language ,@PathVariable(name = "setName") String setName) {
        languageService.update(language,setName);
    }


}
