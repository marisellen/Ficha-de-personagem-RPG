package races;

import points.Attributes;

public abstract class Halfling extends Race implements Attributes {
    public String raca;

    public Halfling() {
        super("Halfling");
    }

    public boolean hasDarkVision() {
        return false;
    }
    @Override
    public int getDestreza() {
        return 2;
    }
    @Override
    public int getCarisma() {
        return 2;
    }
    @Override
    public int Acrobacia() {
        return 2;
    }
    @Override
    public int Ladinagem() {
        return 2;
    }
}
  /*
        this.valoresDeAtributo = VDA; // +2 em Destreza, +2 em Carisma
        this.deslocamento = 6;
        this.visaoNoEscuro = false;
        this.bonusNaPericia = bonusPeri; // +2 em Acrobacia, +2 em Ladinagem
    */
