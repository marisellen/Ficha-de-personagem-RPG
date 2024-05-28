package races;
// classe pai das raças
import skills.Skills;

public abstract class Race implements Skills {
    public static String name;
    public static int deslocamento;
    public static boolean visaoNoEscuro;
    private Race race;

    // Construtor
    public Race(String name) {
        Race.name = name;
    }
    public abstract String getRaceName();
    public Race getRace() {
        return race;
    }
    @Override
    public String toString() {
        return "Personagem da raça: " + race.getRaceName();
    }


    // método visão no escuro
    public boolean hasDarkVision() {
        return visaoNoEscuro;
    }
    // método deslocamento
    public int deslocamento(int des) {
        this.deslocamento = des;
        return des;
    }
}