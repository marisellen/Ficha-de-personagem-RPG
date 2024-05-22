package view;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import characteristics.Character;
import races.*;

public abstract class Main implements interChar{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Ficha personagem");
        System.out.println("----------------------------");

        // personagem
        Character charObj = makeCharacter();
        List<Race> races = new ArrayList<Race>();
        // Variável raça
        Race selectedRace = characterRace(races);


        // futura lista de classes
       /* List<Class> classes = new ArrayList<Class>();
        List<Craft> crafts = new ArrayList<Craft>(); */

    }
    // método de criação
        public static Character makeCharacter () {
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite o nome do personagem:");
            String name = sc.next();
            return  new Character(name);

            class Character {
                private String name;

                public Character(String name) {
                    this.name = name;
                }
            }
    }

    // método escolher raça
    public static Race characterRace(List<Race> allRaces){
        Scanner sc = new Scanner(System.in);
        String[] raceNames = new String[allRaces.size()];
        for (int i = 0; i < allRaces.size(); i++){
            raceNames[i] = allRaces.get(i).getRaceName();
        }
        System.out.println("Escolha a raça do personagem:");
        Race selectedRace = null;
        for (int i = 0; i < raceNames.length; i++) {
            System.out.println(i + 1 + ". " + raceNames[i]);
        }
        int selectedRaceIndex = sc.nextInt() - 1;
        selectedRace = allRaces.get(selectedRaceIndex);
            return selectedRace;
        }

    // Definir atributos do humano
    public static void HumanAtt() {
        Human human = new Human();
        System.out.println("O personagem é um " + human.getName());
        System.out.println("Força: " + human.getForca());
        System.out.println("Destreza: " + human.getDestreza());
        System.out.println("Inteligência: " + human.getInteligencia());
        System.out.println("Constituição: " + human.getConstituicao());
        System.out.println("Carisma: " + human.getCarisma());

    }


/* futuro escolher classe
        public static Character characterClass(List<Class> allClasses) {
            String class = JOptionPane.showConfirmDialog("Escolha a classe do personagem:");
                Class slectedClass = null;
            for (Class classes : allClasses )

        }



// futuro caracteristicas
        System.out.print("Digite a altura do personagem:");
        charObj.height = sc.nextDouble();

        System.out.print("Digite o comportamento do personagem:");
        charObj.behavior = sc.nextLine();

        System.out.print("Descreva a aparência do personagem:");
        charObj.appearance = sc.nextLine();

        System.out.println("Descreva as roupas do personagem:");
        charObj.clothes = sc.nextLine();
*/
/* futuro idiomas
        System.out.print("\nDigite os idiomas que o personagem fala:");
    charObj.idioms = sc.nextLine();
*/

    }
