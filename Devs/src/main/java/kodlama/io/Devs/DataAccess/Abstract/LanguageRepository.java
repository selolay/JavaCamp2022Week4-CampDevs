package kodlama.io.Devs.DataAccess.Abstract;

import kodlama.io.Devs.Entities.Language;

import java.util.List;

public interface LanguageRepository {
   List<Language> getAll();
    Language getById(int id);
    Language getByName(String name);
    void add(Language language);
    void delete(int id);
    void update(Language language);




}
