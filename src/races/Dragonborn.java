package races;

import points.*;

public class Dragonborn extends Race implements Attributes {
    public Dragonborn() {
        super("Dragonborn");
    }
    public boolean hasDarkVision() {
        return false;
    }
    public int deslocamento(int des){
        return 6;
    }

    @Override
    public String getRaceName() {
        return "Dragonborn";
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
        return 0;
    }
    @Override
    public int getCarisma() {
        return 2;
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
        return 2;
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
        return 2;
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
        valoresDeAtributo = +2 em Força, +2 em Carisma
        deslocamento = 6;
        visaoNoEscuro = false;
        bonusNaPericia = +2 em História, +2 em Intimidação
 */

