package races;

public class Halfling extends Race{
    public String raca;

    private void Race(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }

    private static Race createHalfling() {
        return new Race("Halfling");
    }


  /*
        this.valoresDeAtributo = VDA; // +2 em Destreza, +2 em Carisma
        this.deslocamento = 6;
        this.visaoNoEscuro = false;
        this.bonusNaPericia = bonusPeri; // +2 em Acrobacia, +2 em Ladinagem
    */


}
