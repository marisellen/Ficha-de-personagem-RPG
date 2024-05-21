package races;

public class Tiefling extends Race {
    public String raca;

    private void Race(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    private static Race createTiefling() {
        return new Race("Tiefling");
    }

    /*
        this.valoresDeAtributo = VDA; // +1 em Inteligência, +2 em Carisma
        this.deslocamento = 2;
        this.visaoNoEscuro = true;
        this.bonusNaPericia = bonusPeri; // +2 em Atuação, +2 em Furtividade
    */
}