package classes;

public class Bard extends ClasseModel{

    public Bard(String name) {
        super(name);
    }
    @Override
    public String getClasseName() {
        return "Bardo";
    }
    public boolean isMagicClass(){
        return true;
    }
    @Override
    public String gettEquip(int type) {
        return tipoDeEquiP(1);
    }
    // Marias
    public void cançãoAssustadora(){
        System.out.println("Ataca com canção assustadora");
    }
    public void melodiaRevigorante(){
        System.out.println("Usar melodia revigorante");
    }
    public void melodiaLibertadora(){
        System.out.println("Usar melodia libertadora");
    }
    public void facinar(){
        System.out.println("Usar facinar");
    }

}
