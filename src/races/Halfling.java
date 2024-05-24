package races;

import points.Attributes;

public class Halfling extends Race implements Attributes {
    public Halfling() {
        super("Halfling");
    }
    public boolean hasDarkVision() {
        return false;
    }
    public int deslocamento(int des){
        return 6;
    }

    @Override
    public String getRaceName() {
        return "Halfling";
    }

    @Override
    public int getForca() {
        return 0;
    }
    @Override
    public int getDestreza() {
        return 2;
    }
    @Override
    public int getInteligencia() {
        return 0;
    }
    @Override
    public int getConstituicao() {
        return 0;
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
    public int Arcanismo() {
        return 0;
    }
    @Override
    public int Atletismo() {
        return 0;
    }
    @Override
    public int Atuacao() {
        return 0;
    }
    @Override
    public int Conhecimento() {
        return 0;
    }
    @Override
    public int Determinacao() {
        return 0;
    }
    @Override
    public int Exploracao() {
        return 0;
    }
    @Override
    public int Furtividade() {
        return 0;
    }
    @Override
    public int Iniciativa() {
        return 0;
    }
    @Override
    public int Intimidacao() {
        return 0;
    }
    @Override
    public int Investigacao() {
        return 0;
    }
    @Override
    public int Ladinagem() {
        return 2;
    }
    @Override
    public int Natureza() {
        return 0;
    }
    @Override
    public int Percepcao() {
        return 0;
    }
    @Override
    public int Performance() {
        return 0;
    }
    @Override
    public int Persuasao() {
        return 0;
    }
    @Override
    public int Pontaria() {
        return 0;
    }
    @Override
    public int Reflexos() {
        return 0;
    }
    @Override
    public int Sobrevivencia() {
        return 0;
    }
    @Override
    public int Vontade() {
        return 0;
    }
}
  /*
        this.valoresDeAtributo = VDA; // +2 em Destreza, +2 em Carisma
        this.deslocamento = 6;
        this.visaoNoEscuro = false;
        this.bonusNaPericia = bonusPeri; // +2 em Acrobacia, +2 em Ladinagem
    */
