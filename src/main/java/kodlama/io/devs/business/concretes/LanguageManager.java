package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageDao;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LanguageManager implements LanguageService{

    private LanguageDao languageDao;
    @Autowired
    public LanguageManager(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }





    @Override
    public void add(Language language) {
        if (isNameExist(language.getName())) {
            System.out.println("zaten kayıtlı : " + language.getName());
        } else if (language.getName().isEmpty()) {
            System.out.println("isim boş geçilemez");
        } else {
            languageDao.add(language);
        }
    }

    @Override
    public void delete(Language language) {
        if (isNameExist(language.getName())) {
            languageDao.delete(language);
        }else {
            System.out.println("kayıt bulunamadı");
        }
    }

    @Override
    public void update(Language language, String setName) {
        if (isNameExist(language.getName())) {
            if (!isNameExist(setName)) {languageDao.update(language,setName);}else {
                System.out.println("kayıt zaten mevcut");
            }
        }else {
            System.out.println("kayıt bulunamadı");
        }
    }

    @Override
    public List<Language> getAll() {
        return languageDao.getAll();
    }

    @Override
    public Language getOne(int id) {
        if (!isIdExist(id)) {
            System.out.println("bulunamdı");
        }
        return languageDao.getOne(id);
    }


    public boolean isNameExist(String name) {
        List<Language> languages = languageDao.getAll();
        for (Language language : languages) {
            if (language.getName() == name) {
                return true;
            }
        }
        return false;
    }
    public boolean isIdExist(int id) {
        List<Language> languages = languageDao.getAll();
        for (Language language : languages) {
            if (language.getId()==id) {
                return true;
            }
        }
        return false;
    }
}

