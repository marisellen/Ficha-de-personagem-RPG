package characteristics;
public class Character {
    public String name, behavior, clothes, idioms, appearance;
    public double height;

    public Character(){
        this.name = "Sem nome";
    }

    public Character(String name){
        this.name = name;
    }

    public Character(String name, String clothes, double height){
        this.name = name;
        this.height = height;
        this.clothes = clothes;
    }

    public Character(String behavior, String idioms, String appearance){
        this.idioms = idioms;
        this.behavior = behavior;
        this.appearance = appearance;
    }
