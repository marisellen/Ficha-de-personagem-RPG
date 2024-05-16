package view;

import javax.swing.JOptionPane;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import characteristics.Character;
import races.Race;
import classes.Class;
import skills.Craft;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Ficha personagem");
        System.out.println("----------------------------");

        Character charObj = makeCharacter();
        List<Race> races = new ArrayList<Race>();

        Race selectedRace = characterRace(races);


       /* List<Class> classes = new ArrayList<Class>();
        List<Craft> crafts = new ArrayList<Craft>(); */

    }
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

        public static Race characterRace(List<Race> allRaces){
            Scanner sc = new Scanner(System.in);
            String[] raceNames = new String[allRaces.size()];
            for (int i = 0; i < allRaces.size(); i++){
                raceNames[i] = allRaces.get(i).getName();
            }
            System.out.println("Escolha a raça do personagem:");
            Race selectedRace = null;
            for (int i = 0; i < raceNames.length; i++) {
                System.out.println(i + 1 + ". " + raceNames[i]);
            }
            int selectedRaceIndex = sc.nextInt() - 1;
            Race selectedRace = allRaces.get(selectedRaceIndex);

            return selectedRace;
        }




/*
        public static Character characterClass(List<Class> allClasses) {
            String class = JOptionPane.showConfirmDialog("Escolha a classe do personagem:");
                Class slectedClass = null;
            for (Class classes : allClasses )

        }


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
*/



    }
}