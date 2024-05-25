package classes;

public abstract class ClasseModel {
    public static boolean magicClass;
    public String className;
    private int level = 0;
    private double EXP = 0;
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

    // Tabela de Níveis
    public void updateLevel() {
        if (EXP < 100) {
            level = 0;
        } else if (EXP < 500) {
            level = 1;
        } else if (EXP < 1000) {
            level = 2;
        } else if (EXP < 1500) {
            level = 3;
        } else if (EXP < 2000) {
            level = 4;
        } else if (EXP < 2500) {
            level = 5;
        } else if (EXP < 3000) {
            level = 6;
        } else if (EXP < 3500) {
            level = 7;
        } else if (EXP < 4000) {
            level = 8;
        } else if (EXP < 4500) {
            level = 9;
        } else {
            level = 10;
        }
    }
    // Getters e setters para level e EXP
    public int getLevel() {
        return level;
    }
    public static void setEXP(ClasseModel instance, double EXP) {
        instance.EXP = EXP;
        instance.updateLevel(); // Atualiza o nível sempre que a EXP é definida
    }
    public double getEXP() {
        return EXP;
    }
    // Pontos de Vida
    private static int HP = 100;

    // Métodos para manipulação dos pontos de vida (HP)
    public static void addHP(ClasseModel classeModel, int amount) {
        HP += amount;
    }
    public static void subtractHP(ClasseModel classeModel, int amount) {
        HP -= amount;
        if (HP < 0) {
            HP = 0;
        }
    }

    // Getters e setters para pontos de vida
    public void setHP(int HP) {
        ClasseModel.HP = HP;
        if (ClasseModel.HP < 0) {
            ClasseModel.HP = 0; // Evita HP negativo
        }
    }
    public int getHP() {
        return HP;
    }
    public boolean isAlive() {
        return HP > 0;
    }

    public void manipulateStats(int i, int i1) {
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

    // Ataques






}
