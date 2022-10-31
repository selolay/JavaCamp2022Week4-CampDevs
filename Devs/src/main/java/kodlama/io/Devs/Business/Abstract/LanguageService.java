package kodlama.io.Devs.Business.Abstract;

import kodlama.io.Devs.Entities.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    Language getById(int id);
    Language getByName(String name);
    void add(Language language);
    void delete(int id);
    void update(Language language);

    boolean Check(Language language) ;
}
