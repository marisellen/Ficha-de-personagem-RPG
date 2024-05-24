package view;

import java.util.Scanner;
import characteristics.Character;
import races.*;

public abstract class Main implements interChar {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Ficha personagem");
        System.out.println("----------------------------");

        Character character = makeCharacter();
        character = characterRace(character);

        System.out.println("Personagem criado: " + character.getName());
        System.out.println("Raça do personagem: " + character.getRace().getRaceName());
    }
    // Método de criação
    public static Character makeCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do personagem: ");
        String name = sc.next();
        return new Character(name);
    }
    // Método escolher raça
    public static Character characterRace(Character character) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a raça do personagem:");
        System.out.println("1. Dwarf");
        System.out.println("2. Dragonborn");
        System.out.println("3. Elven");
        System.out.println("4. Halfling");
        System.out.println("5. Human");
        System.out.println("6. Ork");
        System.out.println("7. Tiefling");

        int escolha = scanner.nextInt();
        Race racaEscolhida = null;

        switch (escolha) {
            case 1:
                racaEscolhida = new Dwarf();
                break;
            case 2:
                racaEscolhida = new Dragonborn();
                break;
            case 3:
                racaEscolhida = new Elven();
                break;
            case 4:
                racaEscolhida = new Halfling();
                break;
            case 5:
                racaEscolhida = new Human();
                break;
            case 6:
                racaEscolhida = new Ork();
                break;
            case 7:
                racaEscolhida = new Tiefling();
                break;
            default:
                System.out.println("Escolha inválida.");
                return character; // Retorna o personagem sem raça se a escolha for inválida.
        }

        character.setRace(racaEscolhida); // Definir a raça no personagem.

        // Caso escolher humano, definir atributos extras.
        if (racaEscolhida instanceof Human) {
            Human human = (Human) racaEscolhida;
            System.out.println("O personagem é um " + human.getName() + ", então os atributos extras podem ser definidos pelo jogador:");

            System.out.print("Força: ");
            human.setForca(scanner.nextInt());
            System.out.print("Destreza: ");
            human.setDestreza(scanner.nextInt());
            System.out.print("Inteligência: ");
            human.setInteligencia(scanner.nextInt());
            System.out.print("Constituição: ");
            human.setConstituicao(scanner.nextInt());
            System.out.print("Carisma: ");
            human.setCarisma(scanner.nextInt());
        }

        return character;
    }
}

        /*
futuro escolher classe
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
