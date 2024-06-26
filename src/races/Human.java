package races;

import points.Attributes;

public class Human extends Race implements Attributes {
    protected int forca;
    protected int destreza;
    protected int inteligencia;
    protected int constituicao;
    protected int carisma;

    public Human() {
        super("Human");
    }

    public static Object getName() {
    return "Human";
    }

    public boolean hasDarkVision() {
        return false;
    }
    public int deslocamento(int des){
        return 6;
    }

    @Override
    public String getRaceName() {
        return "Human";
    }

    // **********************************************************
    @Override
    public int getForca() {
        return forca;
    }
    @Override
    public int getDestreza() {
        return destreza;
    }
    @Override
    public int getInteligencia() {
        return inteligencia;
    }
    @Override
    public int getConstituicao() {
        return constituicao;
    }
    @Override
    public int getCarisma() {
        return carisma;
    }
    // **********************************************************
    public static void setForca(int forca){}
    public static void setDestreza(int destreza){}
    public static void setInteligencia(int inteligencia){}
    public static void setConstituicao(int constituicao){
    }
    public static void setCarisma(int carisma){
    }
    // **********************************************************
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
   bonusNaPericia +2 em Natureza, +2 em Percepção
    */