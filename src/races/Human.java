package races;
public class Human extends Race{
        public String raca;
        public boolean visaoNoEscuro;

        private void Race(String raca){
            this.raca = raca;
        }

        public String getRaca(){
            return raca;
        }

        public static Race createHman() {
            return new Race("Humano");
        }

        public boolean Raca(boolean visaoNoEscuro){
            this.visaoNoEscuro = visaoNoEscuro;
            return visaoNoEscuro(false);
        }

        public boolean visaoNoEscuro(boolean V){
            return visaoNoEscuro(false);
        }


    /*
        valoresDeAtributo = VDA; // valoresDeAtributo +2 num valor de atributo à escolha do jogador
        deslocamento = 6;
        visaoNoEscuro = false;
        bonusNaPericia = bonusPeri; // bonusNaPericia +2 em Natureza, +2 em Percepção
    */
}
