package classes;

public class Druid extends ClasseModel{

    public Druid(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Druida";
    }
    public boolean isMagicClass(){
        return true;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(1);
    }

}
