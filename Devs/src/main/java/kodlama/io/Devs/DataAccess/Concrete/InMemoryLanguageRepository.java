package kodlama.io.Devs.DataAccess.Concrete;

import kodlama.io.Devs.DataAccess.Abstract.LanguageRepository;
import kodlama.io.Devs.Entities.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;
    private static int id = 1;

    public InMemoryLanguageRepository(){
        languages= new ArrayList<Language>();
        languages.add(new Language(1,"java"));
        languages.add(new Language(2,"c#"));
        languages.add(new Language(3,"python"));
    }
    @Override
    public List<Language> getAll() {
        return languages;
    }
    @Override
    public Language getById(int id) {
        for(Language language : languages) {
            if(language.getId() == id) {
                return language;
            }
        }
        return null;
    }
    @Override
    public Language getByName(String name) {

        for(Language language : languages) {
            if(language.getName() == name) {
                return language;
            }
        }
        return null;
    }
    @Override
    public void add(Language language) {
        if(language.getId() < 1)
            language.setId(id++);
        languages.add(language);
    }
    @Override
    public void delete(int id) {
    languages.remove(id);
    }
    @Override
    public void update(Language language) {

    }

}