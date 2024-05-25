package classes;

public class Paladin extends ClasseModel{
    public Paladin(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Paladino";
    }
    public boolean isMagicClass(){
        return false;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(3);
    }

}
