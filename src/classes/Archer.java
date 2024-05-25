package classes;

public class Archer extends ClasseModel{
    public Archer(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Arqueiro";
    }
    public boolean isMagicClass(){
        return false;
    }
    @Override
    public String gettEquip(int type) {
    return tipoDeEquiP(2);
}

}
