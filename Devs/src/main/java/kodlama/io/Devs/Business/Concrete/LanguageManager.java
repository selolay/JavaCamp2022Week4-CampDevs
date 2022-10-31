package kodlama.io.Devs.Business.Concrete;
import kodlama.io.Devs.Business.Abstract.LanguageService;
import kodlama.io.Devs.DataAccess.Abstract.LanguageRepository;
import kodlama.io.Devs.Entities.Language;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;


    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;

    }
    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }

    @Override
    public Language getByName(String name) {
        return languageRepository.getByName(name);
    }
    @Override
    public void add(Language language) {
        if(Check(language)){
            languageRepository.add(language);
        }
    }
    @Override
    public void delete(int id) {
        if(!CheckId(id)){
            languageRepository.delete(id);
        };
    }


    @Override
    public void update(Language language) {
        for(Language lang : languageRepository.getAll()){
            if(language.getId()==lang.getId()){
                lang.setName(language.getName());
            }
        }
        languageRepository.update(language);
        System.out.println("güncellendi");
    }

    @Override
    public boolean Check(Language language)  {
        if(!CheckName(language)){
            return false;
        }
        if(!CheckId(language.getId())){
            return false;
        }

        return true;
    }

    public boolean CheckId(int id){
        for(Language langId: languageRepository.getAll()){
            if(langId.getId()==id){
                return false;
            }
        }
        return true;
    }
    public boolean CheckName(Language language){
        for (Language lang : languageRepository.getAll()) {

            if (language.getName().isEmpty()) {
                return false;
            }
            if (lang.getName().equalsIgnoreCase(language.getName())) {
                return false;
            }
        }
        return true;
    }
}