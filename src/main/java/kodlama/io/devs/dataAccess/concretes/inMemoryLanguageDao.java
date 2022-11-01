package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.LanguageDao;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class inMemoryLanguageDao implements LanguageDao {

    List<Language> languages;

    public inMemoryLanguageDao() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Python"));
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        languages.remove(language);
    }

    @Override
    public void update(Language language,String setName) {
        language.setName(setName);
    }



    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getOne(int id) {
        for (Language language : languages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }
}
