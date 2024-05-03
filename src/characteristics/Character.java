package characteristics;

import java.lang.String;
public class Character {
    public int ID;
    public String name, behavior, clothes, idioms, appearance;
    public double height;

    public Character(){
        this.name = "Sem nome";
    }

    public Character(String name){
        this.name = new String();
    }

    public Character(int ID, String name, String idioms, double height){
        this.ID = ID;
        this.name = name;
        this.idioms = idioms;
        this.height = height;
    }

    public Character(String behavior, String clothes, String appearance){
        this.behavior = behavior;
        this.clothes = clothes;
        this.appearance = appearance;
    }

}
