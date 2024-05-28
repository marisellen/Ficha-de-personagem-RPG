package classes;

public class Warrior extends ClasseModel{
    public Warrior(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Guerreiro";
    }
    public boolean isMagicClass(){
        return false;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(3);
    }
    // Habilidades
    public void ataqueExtra(){
        System.out.println("Atacar com ataque extra");
    }
    public void ataqueReflexo(){
        System.out.println("Atacar com ataque reflexo");
    }
    public void ataqueEspecial(){
        System.out.println("Atacar com Ataque Especial");
    }
    public void poderDeGuerreiro(){
        System.out.println("Usar poder de guerreiro");
    }

}
