package points;

public class StatusBar {
    private int level = 0;
    private int HP = 50;
    private int MP = 30;
    private int XP = 0;
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
        updateLevel(); // Atualiza o nível baseado na XP inicial
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

    public void setXP(int XP) {
        this.XP = XP;
        updateLevel(); // Atualiza o nível sempre que a XP é definida
    }

    public int getXP() {
        return XP;
    }

    // Pontos de Vida
    // Getters e setters para pontos de vida
    public void setHP(int HP) {
        this.HP = HP;
        if (this.HP < 0) {
            this.HP = 0; // Evita HP negativo
        }
    }

    public int getHP() {
        return HP;
    }

    // Métodos para manipulação dos pontos de vida
    public void addHP(int amount) {
        HP += amount;
    }

    public void subtractHP(int amount) {
        HP -= amount;
        if (HP < 0) {
            HP = 0;
        }
    }

    public boolean isAlive() {
        return HP > 0;
    }

    // Pontos de Magia
    // Getters e setters de pontos de magia
    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    // Métodos para manipulação dos pontos de magia
    public void useMagic(int valor) {
        MP = Math.max(0, MP - valor);
    }

    public void recMP(int valor) {
        MP += valor;
    }

    public void manipulateMagic(int valor) {
        MP += valor;
        if (MP < 0) {
            MP = 0; // Evita MP negativo
        }
    }

    // Pontos de Estamina
    // Getters e setters de pontos de estamina
    public int getPE() {
        return PE;
    }

    public void setPE(int PE) {
        this.PE = PE;
    }

    public void losePE(int valor) {
        PE = Math.max(0, PE - valor);
    }

    public void addPE(int valor) {
        PE += valor;
    }

    // Pontos de Constituição
    // Getters e setters de pontos de constituição
    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }

    public void increasePC(int valor) {
        PC += valor;
    }

    // Pontos de Habilidade
    // Getters e setters de pontos de habilidade
    public int getPH() {
        return PH;
    }

    public void setPH(int PH) {
        this.PH = PH;
    }

    public void addPH(int valor) {
        PH += valor;
    }

    public void manipulateHabil(int valor) {
        PH += valor;
    }

    // Método para exibir o status do personagem
    public void manipulateStats() {
        System.out.println("Status do Personagem:");
        System.out.println("HP: " + HP);
        System.out.println("XP: " + XP);
        System.out.println("PE: " + PE);
        System.out.println("MP: " + MP);
        System.out.println("PC: " + PC);
        System.out.println("PH: " + PH);
    }
}