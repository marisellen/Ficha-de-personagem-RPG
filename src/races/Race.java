package races;
// classe pai das raças
import points.Attributes;
import skills.PericiaBonus;
import view.interChar;
import skills.Skills;

import java.util.ArrayList;
import java.util.List;

public abstract class Race implements interChar, Skills {
    public static String name;
    public static int valoresDeAtributo;
    public static int deslocamento;
    public static boolean visaoNoEscuro;
    public static int bonusNaPericia;
    public static String pericia;
    public static int bonus;


    // construtor raça
    public Race() {
        this.name = "Sem raça";
    }

    // método nome da raça
    public Race(String name) {
        this.name = name;
    }

    // getter do nome da raça
    public static String getRaceName() {
        return name;
    }

    // métodos visão no escuro
    public boolean darkVision(boolean visaoEsc) {
        this.visaoNoEscuro = visaoEsc;
        return visaoEsc;
    }

    // tem visão no escuro
    public boolean hasDarkVision() {
        return visaoNoEscuro;
    }

    // setter visão no escuro
    public void setDarkVision(boolean visaoEsc) {
        this.visaoNoEscuro = visaoEsc;
    }

    // método deslocamento
    public int deslocamento(String Race) {
        int des;
        switch (Race) {
            case "Dragonborn":
                des = 6;
                break;
            case "Dwarf":
                des = 5;
                break;
            case "Elven":
                des = 7;
                break;
            case "Halfling":
                des = 6;
                break;
            case "Human":
                des = 6;
                break;
            case "Ork":
                des = 2;
                break;
            case "Tiefling":
                des = 2;
                break;
            default:
                des = 0;
                break;
        }
        return des;
    }
}