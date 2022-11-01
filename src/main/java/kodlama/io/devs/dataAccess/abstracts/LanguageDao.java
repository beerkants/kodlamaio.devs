package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.Language;

import java.util.ArrayList;
import java.util.List;

public interface LanguageDao {

    void add(Language language);
    void delete(Language language);
    void update(Language language, String setName);
    List<Language> getAll();
    Language getOne(int id);
}
