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

    // Ataques
    public void tiroComArco(){
        System.out.println("Ataca com tiros com arco");
    }
    public void tiroPerfurante(){
        System.out.println("Ataca com tiros perfurantes");
    }
    public void tirosNaCabeça(){
        System.out.println("Ataca com tiros na cabeça");
    }
    public void tiroForte(){
        System.out.println("Ataca com tiro forte");
    }

}
