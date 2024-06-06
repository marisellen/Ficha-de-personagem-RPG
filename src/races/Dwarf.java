package races;

import points.Attributes;

public class Dwarf extends Race implements Attributes {
    public Dwarf() {
        super("Dwarf");
    }

    public boolean hasDarkVision() {
        return true;
    }
    public int deslocamento(int des){
        return 5;
    }

    @Override
    public String getRaceName() {
        return "Dwarf";
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
        return 0;
    }
    @Override
    public int getConstituicao() {
        return 2;
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
        return 2;
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
        return 2;
    }
    @Override
    public int Vontade() {
        return 0;
    }
}

/*
        this.valoresDeAtributo = +2 em Constituição, +2 em Força ou Sabedoria
        this.deslocamento = 5;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = +2 em Exploração, +2 em Tolerância
 */


