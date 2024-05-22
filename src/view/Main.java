package view;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import characteristics.Character;
import races.*;

public abstract class Main implements interChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Ficha personagem");
        System.out.println("----------------------------");

        // Criar personagem
        Character charObj = makeCharacter();

        // Lista de raças
        List<Race> races = new ArrayList<>();

        // Escolher raça
        Race selectedRace = characterRace(races);
        charObj.setRace(selectedRace);

        // Caso escoljer humano
        if (charObj.getRace() instanceof Human) {
            defineHumanAttributes((Human) charObj.getRace());
        }

        // futura lista de classes
       /* List<Class> classes = new ArrayList<Class>();
        List<Craft> crafts = new ArrayList<Craft>(); */

    }

    // método de criação
    public static Character makeCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do personagem:");
        String name = sc.next();
        return new Character(name);
    }

    // método escolher raça
    public static Race characterRace(List<Race> allRaces) {
        Scanner sc = new Scanner(System.in);
        String[] raceNames = new String[allRaces.size()];
        for (int i = 0; i < allRaces.size(); i++) {
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
    public static void defineHumanAttributes(Human human) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O personagem é um " + human.getName() + ", então os atributos extras podem ser definidos pelo jogador:");

        System.out.print("Força: ");
        human.setForca(sc.nextInt());
        System.out.print("Destreza: ");
        human.setDestreza(sc.nextInt());
        System.out.print("Inteligência: ");
        human.setInteligencia(sc.nextInt());
        System.out.print("Constituição: ");
        human.setConstituicao(sc.nextInt());
        System.out.print("Carisma: ");
        human.setCarisma(sc.nextInt());
        System.out.println("Atributos definidos:");
        System.out.println("Força: " + human.getForca());
        System.out.println("Destreza: " + human.getDestreza());
        System.out.println("Inteligência: " + human.getInteligencia());
        System.out.println("Constituição: " + human.getConstituicao());
        System.out.println("Carisma: " + human.getCarisma());
        sc.close();
    }

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
