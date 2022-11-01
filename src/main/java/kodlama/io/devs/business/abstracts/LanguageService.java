package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    void add(Language language);
    void delete(Language language);
    void update(Language language, String setName);
    List<Language> getAll();
    Language getOne(int id);
}
