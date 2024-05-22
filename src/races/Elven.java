package races;

import points.Attributes;

public abstract class Elven extends Race implements Attributes {
    public String raca;
    public Elven() {
        super("Elven");
    }
    public boolean hasDarkVision() {
        return true;
    }

    @Override
    public int getDestreza() {
        return 2;
    }
    @Override
    public int getInteligencia() {
        return 2;
    }
    @Override
    public int Natureza() {
        return 2;
    }
    @Override
    public int Percepcao() {
        return 2;
    }

}
    /*
        valoresDeAtributo = VDA; // +2 em Destreza, +2 em Sabedoria
        deslocamento = 7;
        visaoNoEscuro = true;
        bonusNaPericia = bonusPeri; // +2 em Natureza, +2 em Percepção
    */


