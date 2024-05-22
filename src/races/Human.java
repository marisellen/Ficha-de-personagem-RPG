package races;

import points.Attributes;

public class Human extends Race implements Attributes {
    public String race;
    protected int forca;
    protected int destreza;
    protected int inteligencia;
    protected int constituicao;
    protected int carisma;

    public Human() {
        super("Human");
    }

    @Override
    public boolean visaoNoEscuro() {
        return false;
    }
    @Override
    public int deslocamento() {
        return 0;
    }
    @Override
    public String getName() {
        return null;
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
    public void setForca(int forca) {
        this.forca = forca;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
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
    public int Intimidação() {
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