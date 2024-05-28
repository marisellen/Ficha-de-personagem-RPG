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
    // Magias
    public void armaDaFe(){
    System.out.println("Usar arma da fé");
}
    public void armaduraDaFe(){
        System.out.println("Usar Armadura da Fé");
    }
    public void poderSagrado(){
        System.out.println("Atacar com poder sagrado");
    }
    public void campeãodoBem(){
        System.out.println("Campeão do Bem");
    }

}
