package classes;

public class Mage extends ClasseModel{

    public Mage(String name) {
        super(name);
    }
    public boolean isMagicClass(){
        return true;
    }
    @Override
    public String getClasseName(){
        return "Mago";
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(1);
    }

}