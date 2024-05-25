package classes;

public class Rogue extends ClasseModel{
    public Rogue(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Ladino";
    }
    public boolean isMagicClass(){
        return false;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(2);
    }

}
