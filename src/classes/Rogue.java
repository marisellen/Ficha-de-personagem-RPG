package classes;

public class Rogue extends ClasseModel{
    public Rogue(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Ladino";
    }
    public boolean isMagicClass(){
        return false;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(2);
    }
    // Habilidades
    public void encontrarArmadilhas(){
        System.out.println("Encontrar Armadilhas");
    }
    public void ataqueIncapacitante(){
        System.out.println("Atacar com ataque incapacitante");
    }
    public void furtividadeRápida(){
        System.out.println("Furtividade Rápida");
    }
    public void evasao(){
        System.out.println("Usar Evasão");
    }

}
