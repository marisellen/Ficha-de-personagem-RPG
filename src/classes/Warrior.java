package classes;

public class Warrior extends ClasseModel{
    public Warrior(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Guerreiro";
    }
    public boolean isMagicClass(){
        return false;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(3);
    }

}
