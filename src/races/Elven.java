package races;

import points.Attributes;

public class Elven extends Race implements Attributes {
    public Elven() {
        super("Elven");
    }
    public boolean hasDarkVision() {
        return true;
    }
    public int deslocamento(int des){
        return 7;
    }

    @Override
    public String getRaceName() {
        return "Elven";
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
        return 2;
    }
    @Override
    public int getConstituicao() {
        return 0;
    }
    @Override
    public int getCarisma() {
        return 0;
    }

    @Override
    public int Acrobacia() {
        return 0;
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
        return 0;
    }
    @Override
    public int Natureza() {
        return 2;
    }
    @Override
    public int Percepcao() {
        return 2;
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
        valoresDeAtributo = VDA; // +2 em Destreza, +2 em Sabedoria
        deslocamento = 7;
        visaoNoEscuro = true;
        bonusNaPericia = bonusPeri; // +2 em Natureza, +2 em Percepção
    */


