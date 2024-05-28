package races;

import points.Attributes;

public class Ork extends Race implements Attributes {
    public Ork() {
        super("Ork");
    }
    public boolean hasDarkVision() {
        return true;
    }
    public int deslocamento(int des){
        return 5;
    }

    @Override
    public String getRaceName() {
        return "Ork";
    }

    @Override
    public int getForca() {
        return 2;
    }
    @Override
    public int getDestreza() {
        return 0;
    }
    @Override
    public int getInteligencia() {
        return -2;
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
        this.valoresDeAtributo = VDA; // +2 em força, -2 em inteligência
        this.deslocamento = 2;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = bonusPeri; // +2 em Intimidação
    */
