package points;

public class StatusBar {
    private int level = 0;
    private static int HP = 50;
    private int MP = 30;
    private static int XP = 0;
    private int PE;
    private int PC;
    private int PH;

    //  HP - Pontos de vida
    //	XP - Pontos de Experiência
    //	MP - Pontos de Magia
    //	PE - Pontos de Estamina
    //	PC - Pontos de Constituição
    //  PH - Pontos de Habilidades

    // Construtor
    public StatusBar(int hp, int xp, int pe, int mp, int pc, int ph) {
        this.HP = hp;
        this.XP = xp;
        this.MP = mp;
        this.PE = pe;
        this.PC = pc;
        this.PH = ph;
    }

    // Tabela de Níveis
    public void updateLevel() {
        if (XP < 100) {
            level = 0;
        } else if (XP < 500) {
            level = 1;
        } else if (XP < 1000) {
            level = 2;
        } else if (XP < 1500) {
            level = 3;
        } else if (XP < 2000) {
            level = 4;
        } else if (XP < 2500) {
            level = 5;
        } else if (XP < 3000) {
            level = 6;
        } else if (XP < 3500) {
            level = 7;
        } else if (XP < 4000) {
            level = 8;
        } else if (XP < 4500) {
            level = 9;
        } else {
            level = 10;
        }
    }

    // Getter e Setter para level
    public int getLevel() {
        return level;
    }
    public void setXP(double XP) {
        XP = XP;
        updateLevel(); // Atualiza o nível sempre que a XP é definida
    }
    public static double getEXP() {
        return XP;
    }

    // Pontos de Vida

    // Getters e setters para pontos de vida
    public void setHP(int HP) {
        HP = HP;
        if (HP < 0) {
            HP = 0; // Evita HP negativo
        }
    }
    public int getHP() {
        return HP;
    }

    // Métodos para manipulação dos pontos de vida (HP)
    public static void addHP(int amount) {
        HP += amount;
    }
    public static void subtractHP(int amount) {
        HP -= amount;
        if (HP < 0) {
            HP = 0;
        }
    }
    public boolean isAlive() {
        return HP > 0;
    }

// Pontos de magia

    public int getMp() {
        return MP;
    }

    public void setMp(int mp) {
        this.MP = mp;
    }

    public void useMagia(int valor) {
        this.MP = Math.max(0, this.MP - valor);
    }

    public void recMp(int valor) {
        this.MP += valor;
    }



    // Pontos de Stamina

    public int getPe() {
    return PE;
}

    public void setPe(int pe) {
        this.PE = pe;
    }

    public void losePe(int valor) {
        this.PE = Math.max(0, this.PE - valor);
    }

    public void addPe(int valor) {PE += valor;
    }


    // Pontos de Constituição


    public int getPc() {
        return PC;
    }

    public void setPc(int pc) {
        this.PC = pc;
    }

    public void aumentarPc(int valor) {
        this.PC += valor;
    }



    // Pontos de Habilidade



    public int getPh() {
        return PH;
    }

    public void setPh(int ph) {
        this.PH = ph;
    }

    public void addPh(int valor) {
        this.PH = valor;
    }








    // Método para exibir o status do personagem
    public void exibirStatus() {
        System.out.println("Status do Personagem:");
        System.out.println("HP: " + HP);
        System.out.println("XP: " + XP);
        System.out.println("PE: " + PE);
        System.out.println("MP: " + MP);
        System.out.println("PC: " + PC);
        System.out.println("PH: " + PH);
    }
}