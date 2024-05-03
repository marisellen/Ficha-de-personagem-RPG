package view;

import java.util.Scanner;
import characteristics.Character;
import races.*;
public class Main {
    public class main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
            System.out.println("Ficha personagem");
            System.out.println("----------------------------");

            Character charObj = new Character();
            // charObj.ID;
            Race rac01 = new Race();
            // rac01."raça";



// Criação
            System.out.print("Digite o nome do personagem:");
            charObj.name = sc.nextLine();

            System.out.println("Escolha a raça do personagem:");
            // raça

            System.out.println("Escolha a classe do personagem:");
            // classe

            System.out.print("Digite a altura do personagem:");
            charObj.height = sc.nextDouble();

            System.out.print("Digite o comportamento do personagem:");
            charObj.behavior = sc.nextLine();

            System.out.print("\nDigite os idiomas que o personagem fala:");
            charObj.idioms = sc.nextLine();

            System.out.print("Descreva a aparência do personagem:");
            charObj.appearance = sc.nextLine();

            System.out.println("Descreva as roupas do personagem:");
            charObj.clothes = sc.nextLine();

        }
}