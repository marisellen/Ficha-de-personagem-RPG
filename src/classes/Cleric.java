package classes;

public class Cleric extends ClasseModel{

    public Cleric(String name) {
        super(name);
    }

    @Override
    public String getClasseName() {
        return "Clérigo";
    }
    public boolean isMagicClass(){
        return true;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(2);
    }



}
