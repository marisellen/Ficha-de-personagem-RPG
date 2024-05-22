package races;

import points.*;

public abstract class Dragonborn extends Race implements Attributes {
    public String raca;

    public Dragonborn() {
        super("Dragonborn");
    }

    public boolean hasDarkVision() {
        return false;
    }

    @Override
    public int getForca() {
        return 2;
    }
    @Override
    public int getCarisma() {
        return 2;
    }
    @Override
    public int Conhecimento() {
        return 2;
    }
    @Override
    public int Intimidação() {
        return 2;
    }
}

/*
        valoresDeAtributo = +2 em Força, +2 em Carisma
        deslocamento = 6;
        visaoNoEscuro = false;
        bonusNaPericia = +2 em História, +2 em Intimidação
 */

