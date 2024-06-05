package characteristics;

import classes.ClasseModel;
import races.Race;
import skills.Craft;

// classe das caracteristicas do personagem
public class Character {
    public String name, alignment, clothes, idioms, appearance;
    public int age;
    public double height;
    private Race race;
    public ClasseModel classe;
    private Craft craft;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    public ClasseModel getClasse() {
        return classe;
    }
    public void setClasse(ClasseModel classe) {
        this.classe = classe;
    }

    public Craft getCraft() {
        return craft;
    }
    public Craft setCraft(Craft profEscolhida) {
        this.craft = profEscolhida;
        return craft;
    }

    public String getAlignment(){
        return alignment;
    }
    public String setAlignment(String alignment ){
        this.alignment = alignment;
        return alignment;
    }

    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public String getApparence(){
        return appearance;
    }
    public String setAppearance(String appearance){
        this.appearance = appearance;
        return appearance;
    }

    public String getClothes(){
        return clothes;
    }
    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getLanguages(){
        return idioms;
    }
    public void setLanguages(String idioms) {
        this.idioms = idioms;
    }

}