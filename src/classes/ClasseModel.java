package classes;

public abstract class ClasseModel {
    public static boolean magicClass;
    public String className;
    private ClasseModel classe;

    // Construtor
    public ClasseModel(String name) {
        this.className = name;
    }
    public abstract String getClasseName();
    @Override
    public String toString() {return "Personagem da classe: " + classe.getClasseName();}

    // Tipo
    public boolean isMagicClass(){
        return magicClass;
    }

    // Equipamento
    public String tipoDeEquiP(int type) {
        if (type == 1) {
            return "Leve";
        } else if (type == 2) {
            return "Média";
        } else {
            return "Pesada";
        }
    }
    // Getter equipamento
    public String gettEquip(int type) {
        return tipoDeEquiP(type);
    }
}
