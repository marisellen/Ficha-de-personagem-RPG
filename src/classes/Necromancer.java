package classes;

public class Necromancer extends ClasseModel{
    public Necromancer(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Necromante";
    }
    public boolean isMagicClass(){
        return true;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(1);
    }

}
