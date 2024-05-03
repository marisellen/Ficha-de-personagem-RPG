package races;

public class Dragonborn extends Race{

    public String raca;

    private void Race(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }

    private static Race createDragonborn() {
        return new Race("Draconato");
    }


/*
        this.valoresDeAtributo = VDA; // +2 em Força, +2 em Carisma
        this.deslocamento = 6;
        this.visaoNoEscuro = false;
        this.bonusNaPericia = bonusPeri; // +2 em História, +2 em Intimidação
 */


}
