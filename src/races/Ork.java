package races;

public class Ork extends Race{
    public String raca;

    private void Race(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }

    private static Race createOrk() {
        return new Race("Ork");
    }

    /*
        this.valoresDeAtributo = VDA; // +2 em força, -2 em inteligência
        this.deslocamento = 2;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = bonusPeri; // +2 em Intimidação
    */

}
