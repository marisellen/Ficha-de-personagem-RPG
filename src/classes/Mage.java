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
    // Magias
    public void bolaDeFogo(){
        System.out.println("Atacar com bola de fogo");
    }
    public void rastroInvisível(){
        System.out.println("Atacar com bola de fogo controlável");
    }
    public void conjuração(){
        System.out.println("Usar Conjuração");
    }
    public void Familiar(){
        System.out.println("Invocar familiar");
    }

}