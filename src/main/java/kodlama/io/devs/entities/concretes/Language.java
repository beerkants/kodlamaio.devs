package kodlama.io.devs.entities.concretes;

import kodlama.io.devs.entities.abstracts.Entity;

public class Language implements Entity {

    private int id;
    private String name;

    public Language(){}
    public Language(int id,String name) {
        this.setId(id);
        this.setName(name);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
