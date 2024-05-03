package races;

public class Elven extends Race{
    public String raca;

    private void Race(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }

    private static Race createElven() {
        return new Race("Elfo");
    }


      /*
        this.valoresDeAtributo = VDA; // +2 em Destreza, +2 em Sabedoria
        this.deslocamento = 7;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = bonusPeri; // +2 em Natureza, +2 em Percepção
    */

}
