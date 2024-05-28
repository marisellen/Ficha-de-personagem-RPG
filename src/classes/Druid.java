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
    // Habilidades
    public void formaSelvagem(){
        System.out.println("Forma Selvagem");
    }
    public void vínculoNatural(){
        System.out.println("Usar vínculo natural");
    }
    public void caminhodaFloresta(){
        System.out.println("Usar caminho da floresta");
    }
    public void rastroInvisível(){
        System.out.println("Usar Rastro Invisível");
    }

}
