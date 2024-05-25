package classes;

public class Bard extends ClasseModel{

    public Bard(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Bardo";
    }
    public boolean isMagicClass(){
        return true;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(1);
    }


}
