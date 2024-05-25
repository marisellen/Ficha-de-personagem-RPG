package characteristics;

import classes.ClasseModel;
import races.Race;
import skills.Craft;

// classe das caracteristicas do personagem
public class Character {
    public String name, behavior, clothes, idioms, appearance;
    public double age;
    public double height;
    private Race race;
    private Craft craft;
    public ClasseModel classe;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setRace(Race race) {
        this.race = race;
    }
    public Race getRace() {
        return race;
    }
    public void setClasse(ClasseModel classe) {
        this.classe = classe;
    }
    public Craft setCraft(Craft profEscolhida) {
        this.craft = profEscolhida;
        return craft;
    }
    public Craft getCraft() {
        return craft;
    }
    public ClasseModel getClasse() {
        return classe;
    }
    //**********************************************


    public Character(String clothes,double age, double height){
        this.height = height;
        this.age = age;
        this.clothes = clothes;
    }

    public Character(String behavior, String idioms, String appearance){
        this.idioms = idioms;
        this.behavior = behavior;
        this.appearance = appearance;
    }


}
