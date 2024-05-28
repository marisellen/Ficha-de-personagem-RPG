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
    // Magias
    public void lacraio(){
        System.out.println("Invocar lacraio");
    }
    public void armaduraDeOssos(){
        System.out.println("Usar armadura de ossos");
    }
    public void ceifadorDeAlmas(){
        System.out.println("Atacar com Ceifador de Almas");
    }
    public void execitoDeMortos(){
        System.out.println("Invocar exécito de mortos");
    }

}
