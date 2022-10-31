package kodlama.io.Devs.WebApi.Controller;

import kodlama.io.Devs.Business.Abstract.LanguageService;
import kodlama.io.Devs.Entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/language")
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        super();
        this.languageService = languageService;
    }


    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(Language lang) {
        languageService.add(lang);
    }

    @GetMapping("/getById/{id}")
    public Language getById(@PathVariable int id) {
        return languageService.getById(id);
    }
    @GetMapping("/getByName/{name}")
    public Language getByName(@PathVariable String name) {
        return languageService.getByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        languageService.delete(id);
    }

    @PutMapping("/update")
    public void update(Language lang) {
        languageService.update(lang);
    }


}
