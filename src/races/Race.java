package races;
// classe pai das raças
import view.interChar;
import skills.Skills;

public abstract class Race implements interChar, Skills {
    public static String name;
    private Race race;
    public static int deslocamento;
    public static boolean visaoNoEscuro;

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