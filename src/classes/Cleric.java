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
// Magias
    public void abençoarArma(){
    System.out.println("Usar abençoar arma");
    }
    public void aumentoDeAtributo(){
        System.out.println("Usar aumento de atributo");
    }
    public void canaEnergiaPositiva(){
        System.out.println("Canalizar Energia Positiva");
    }
    public void canaEnergiaNegativa(){
        System.out.println("Canalizar Energia Negativa");
    }
    public void magiaSagrada(){
        System.out.println("Ataca com Magia Sagrada");
    }

}
