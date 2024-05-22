package races;

import points.Attributes;

public abstract class Ork extends Race implements Attributes {
    public String raca;

    public Ork() {
        super("Ork");
    }

    public boolean hasDarkVision() {
        return true;
    }

    @Override
    public int getForca() {
        return 2;
    }
    @Override
    public int getInteligencia() {
        return -2;
    }
    @Override
    public int Intimidação() {
        return 2;
    }

}
    /*
        this.valoresDeAtributo = VDA; // +2 em força, -2 em inteligência
        this.deslocamento = 2;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = bonusPeri; // +2 em Intimidação
    */
