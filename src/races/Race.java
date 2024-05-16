package races;

import java.util.List;

public class Race {
    public static String name;
    public static int valoresDeAtributo;
    public static int deslocamento;
    public static boolean visaoNoEscuro;
    public static int bonusNaPericia;

    public Race() {
        this.name = "Sem raça";
    }
    public Race(String name) {
        this.name = name;
    }
    public static String getName(){
        return name;
    }


/*
    public Race(int des) {
        this.deslocamento = des;
    }

    public Race(boolean visaoEsc){
        this.visaoNoEscuro = visaoEsc;
    }

    public Race(short bonusPeri, short valueAtri){
        this.bonusNaPericia = bonusPeri;
        this.valoresDeAtributo =  valueAtri;
    }
*/

}