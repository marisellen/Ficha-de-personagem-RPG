package races;

import points.Attributes;

public abstract class Dwarf extends Race implements Attributes {
    public String raca;

    public Dwarf() {
        super("Dwarf");
    }
    public boolean hasDarkVision() {
        return true;
    }

    @Override
    public int getForca() {
        return 2;
    }
    @Override
    public int getConstituicao() {
        return 2;
    }
    @Override
    public int Exploracao() {
        return 2;
    }
    @Override
    public int Sobrevivencia() {
        return 2;
    }
}

/*
        this.valoresDeAtributo = +2 em Constituição, +2 em Força ou Sabedoria
        this.deslocamento = 5;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = +2 em Exploração, +2 em Tolerância
 */


