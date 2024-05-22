package races;

import points.Attributes;

public abstract class Tiefling extends Race implements Attributes {
    public String raca;

    public Tiefling() {
        super("Tiefling");
    }

    public boolean hasDarkVision() {
        return true;
    }

    @Override
    public int getInteligencia() {
        return 1;
    }
    @Override
    public int getCarisma() {
        return 2;
    }
    @Override
    public int Atuacao() {
        return 2;
    }
    @Override
    public int Furtividade() {
        return 2;
    }
}
    /*
        this.valoresDeAtributo = VDA; // +1 em Inteligência, +2 em Carisma
        this.deslocamento = 2;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = bonusPeri; // +2 em Atuação, +2 em Furtividade
    */