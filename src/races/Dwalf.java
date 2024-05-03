package races;

public class Dwalf extends Race{
    public String raca;

    private void Race(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }

    private static Race createDwalf() {
        return new Race("Anão");
    }


/*
        this.valoresDeAtributo = VDA; // +2 em Constituição, +2 em Força ou Sabedoria
        this.deslocamento = 5;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = bonusPeri; // +2 em Exploração, +2 em Tolerância
 */

}
