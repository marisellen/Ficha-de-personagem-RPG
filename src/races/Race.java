package races;
// classe pai das raças
import skills.PericiaBonus;
import view.interChar;
import skills.Skills;

import java.util.ArrayList;
import java.util.List;

public abstract class Race implements interChar, Skills {
    public static String name;
    public static int valoresDeAtributo;
    public static int deslocamento;
    public static boolean visaoNoEscuro;
    public static int bonusNaPericia;
    public static String pericia;
    public static int bonus;


    // construtor raça
    public Race() {
        this.name = "Sem raça";
    }
    // método nome da raça
    public Race(String name) {
        this.name = name;
    }
    // getter do nome da raça
    public static String getRaceName(){
        return name;
    }

    // métodos visão no escuro
    public boolean darkVision(boolean visaoEsc){
        this.visaoNoEscuro = visaoEsc;
        return visaoEsc;
    }
    // tem visão no escuro
    public boolean hasDarkVision() {
        return visaoNoEscuro;
    }
    // setter visão no escuro
    public void setDarkVision(boolean visaoEsc) {
        this.visaoNoEscuro = visaoEsc;
    }



// método deslocamento
    public int deslocamento(String Race){
        int des;
        switch (Race){
            case "Dragonborn":
                des = 6;
                break;
            case "Dwarf":
                des = 5;
                break;
            case "Elven":
                des = 7;
                break;
            case "Halfling":
                des = 6;
                break;
            case "Human":
                des = 6;
                break;
            case "Ork":
                des = 2;
                break;
            case "Tiefling":
                des = 2;
                break;
            default: des = 0;
            break;
        }
        return des;
    }

// método dos bônus na pericia
    public void bonusPeri(String skill, int bonus) {
        this.pericia = skill;
        this.bonus = bonus;
    }
    // getter periicia
    public String getPericia() {
        return pericia;
    }
    // getter bônus
    public int getBonus() {
        return bonus;
    }
    // list dos bônus na pericia
    public List<Skills> bonusNaPericia(String race) {
        List<Skills> bonusList = new ArrayList<>();

        switch (race) {
            case "Dragonborn":
                bonusList.add(new PericiaBonus("Conhecimento", 2) {
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
                });
                bonusList.add(new PericiaBonus("Intimidação", 2) {
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
                });
                break;
            case "Dwarf":
                bonusList.add(new PericiaBonus("Exploracao", 2) {
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
                        return 2;
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
                });
                bonusList.add(new PericiaBonus("Sobrevivencia", 2) {
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
                        return 2;
                    }

                    @Override
                    public int Vontade() {
                        return 0;
                    }
                });
                break;
            case "Elven":
                bonusList.add(new PericiaBonus("Natureza", 2) {
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
                });
                bonusList.add(new PericiaBonus("Percepcao", 2) {
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
                        return 0;
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
                });
                break;
            case "Halfling":
                bonusList.add(new PericiaBonus("Acrobacia", 2) {
                    @Override
                    public int Acrobacia() {
                        return 2;
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
                });
                bonusList.add(new PericiaBonus("Ladinagem", 2) {
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
                        return 2;
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
                });
               break;
            case "Human":
                bonusList.add(new PericiaBonus("Natureza",2) {
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
                });
                bonusList.add(new PericiaBonus("Percepção",2) {
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
                });
               break;
            case "Ork":
                bonusList.add(new PericiaBonus("Intimidação", 2) {
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
                });
                break;
            case "Tiefling":
                bonusList.add(new PericiaBonus("Atuação", 2) {
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
                        return 2;
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
                });
                bonusList.add(new PericiaBonus("Furtividade", 2) {
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
                        return 2;
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
                });
                break;
            default:
                // No bonus for unrecognized race
                break;
        }

        return bonusList;
    }


    // método de atributos
    public int valoresDeAtributo(){


        return 0;
    }

}