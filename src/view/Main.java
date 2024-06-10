package view;

import characteristics.Character;
import classes.*;
import dao.BagDAO;
import dao.CharacterDAO;
import dao.StatusBarDAO;
import inventory.Bag;
import inventory.Items;
import points.StatusBar;
import races.*;
import skills.Craft;

import javax.swing.*;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static dao.StatusBarDAO.*;
import static java.lang.System.in;

public abstract class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        List<Character> characters = CharacterDAO.getChar();
        List<Items> items = BagDAO.getItems();

        System.out.println("----------------------------");
        System.out.println("Ficha personagem");
        System.out.println("----------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criar personagem"); // ok
        System.out.println("2 - Listar personagens"); // ok
        System.out.println("3 - Alterar Status");  // ok
        System.out.println("4 - Adicionar itens"); // ok
        System.out.println("5 - Listar itens"); // ok
        System.out.println("6 - Excluir item"); // ok
        System.out.println("7 - Excluir personagem"); // ok
        System.out.println("----------------------------");

        int opcao;
        do {
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    createCharacter();
                    break;
                case 2:
                    characters = CharacterDAO.getChar();
                    listarChars(characters);
                    break;
                case 3:
                    System.out.print("Informe o nome do personagem: ");
                    String nomePersonagemCase3 = sc.nextLine();
                    int personagemIdCase3 = getIdFromName(nomePersonagemCase3);
                    if (personagemIdCase3 != -1) {
                        StatusBar statusBar = getStatus(personagemIdCase3);
                        updateStatusBar(statusBar, personagemIdCase3);
                    } else {
                        System.out.println("Personagem não encontrado.");
                    }
                    break;
                case 4:
                    updateInvent();
                    break;
                case 5:
                    List<Items> item = BagDAO.getItems();
                    listInvent(item);
                    break;
                case 6:
                    removeItesInvent(sc);
                    break;
                case 7:
                    delChar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao != 0);

    }

    // Método criar personagem
    public static void createCharacter() throws SQLException {
        Character character = makeCharacter();
        character = characterRace(character);
        character = characterClass(character);
        character = choiceCraft(character);
        character = choiceCharacteristcs(character);
        character = idionsAdd(character);

        System.out.println(STR."\n Personagem criado: \{character.getName()}");
        System.out.println(STR."Raça do personagem: \{character.getRace().getRaceName()}");
        System.out.println(STR."Classe do personagem: \{character.getClasse().getClasseName()}");
        System.out.println(STR."Profissão do personagem: \{character.getCraft().getCraftName()}");
        System.out.println(STR."Alinhamento do personagem: \{character.getAlignment()}");
        System.out.println(STR."Idiomas do personagem: \{character.getLanguages()}");

        // Inventário
        Bag bag = invent();

        // Manipula EXP e HP
        StatusBar characterStatus = new StatusBar(50, 0, 20, 30, 0, 0);

        System.out.println(bag);

        characterStatus.manipulateStats();
        System.out.println(STR."Level: \{characterStatus.getLevel()}");
        System.out.println(STR."HP: \{characterStatus.getHP()}");
        System.out.println(STR."Magic: \{characterStatus.getMP()}");
        System.out.println(STR."Stamina: \{characterStatus.getPE()}");
        System.out.println(STR."Constitution: \{characterStatus.getPC()}");
        System.out.println(STR."Skill points: \{characterStatus.getPH()}");

        // Inserir personagem no banco de dados
        int personagemId = CharacterDAO.insertChar(character);

        // Inserir barra de status no banco de dados
        StatusBarDAO.insertPoints(characterStatus, personagemId);

        // Insere ou atualiza os itens no banco de dados
        for (Items item : bag.getItems()) {
            BagDAO.insertItems(personagemId, item);
        }
    }

    // Método listar personagens criados
    public static void listarChars(List<Character> characters) {
        // Exibir os personagens
        String texto = "Personagens cadastrados:";
        if (characters.isEmpty()) {
            texto += "\n\nNenhum personagem cadastrado";
        } else {
            for (Character character : characters) {
                texto += "\n " + character.getName() +
                        "\n-------------------------";
            }
        }
        System.out.println(texto);
    }

    // Método deletar personagem
    public static void delChar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do personagem que deseja excluir:");
        String characterName = scanner.nextLine();

        CharacterDAO.deleteChar(characterName);

        scanner.close();
    }

    // Método criar nome
    public static Character makeCharacter() {
        Scanner sc = new Scanner(in);
        System.out.print("Digite o nome do personagem: ");
        String name = sc.nextLine();
        return new Character(name);
    }

    // Método escolher raça
    public static Character characterRace(Character character) {
        Scanner scanner = new Scanner(in);
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

    // Método escolher classe
    public static Character characterClass(Character character) {
        Scanner scanner = new Scanner(in);
        System.out.println("Escolha a classe do personagem:");
        System.out.println("1. Archer");
        System.out.println("2. Bard");
        System.out.println("3. Cleric");
        System.out.println("4. Druid");
        System.out.println("5. Mage");
        System.out.println("6. Necromancer");
        System.out.println("7. Paladin");
        System.out.println("8. Rogue");
        System.out.println("9. Warrior");

        int chose = scanner.nextInt();
        ClasseModel classeEscolhida = null;

        switch (chose) {
            case 1:
                classeEscolhida = new Archer("Arqueiro");
                break;
            case 2:
                classeEscolhida = new Bard("Bardo");
                break;
            case 3:
                classeEscolhida = new Cleric("Clérigo");
                break;
            case 4:
                classeEscolhida = new Druid("Druida");
                break;
            case 5:
                classeEscolhida = new Mage("Mage");
                break;
            case 6:
                classeEscolhida = new Necromancer("Necromante");
                break;
            case 7:
                classeEscolhida = new Paladin("Paladino");
                break;
            case 8:
                classeEscolhida = new Rogue("Ladino");
                break;
            case 9:
                classeEscolhida = new Warrior("Guerreiro");
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        character.setClasse(classeEscolhida); // Definir a classe no personagem.
        return character;
    }

    public static Character choiceCraft(Character character) {
        // Escolher a profissão
        Scanner scanner = new Scanner(in);
        System.out.println("Escolha a profissão do personagem:");
        System.out.println("1. Ferreiro");
        System.out.println("2. Artesão");
        System.out.println("3. Alquimista");
        System.out.println("4. Construtor");
        System.out.println("5. Padre");
        System.out.println("6. Explorador");

        int escolha = scanner.nextInt();
        Craft profEscolhida = null;

        switch (escolha) {
            case 1:
                profEscolhida = Craft.FERREIRO;
                break;
            case 2:
                profEscolhida = Craft.ARTESAO;
                break;
            case 3:
                profEscolhida = Craft.ALQUIMISTA;
                break;
            case 4:
                profEscolhida = Craft.CONSTRUTOR;
                break;
            case 5:
                profEscolhida = Craft.PADRE;
                break;
            case 6:
                profEscolhida = Craft.EXPLORADOR;
                break;
            default:
                System.out.println("Escolha inválida.");
                return character; // Retorna o personagem sem a se a escolha for inválida.
        }

        character.setCraft(profEscolhida);

        return character;
    }

    // Caracteristicas
    public static Character choiceCharacteristcs(Character character) {
        Scanner scan = new Scanner(in);

        System.out.println("Digite a idade e depois a altura do personagem:");
        int age;
        age = scan.nextInt();
        double height;
        height = scan.nextDouble();
        character.setAge(age);
        character.setHeight(height);

        scan.nextLine();

        System.out.println("Descreva a aparência do personagem:");
        String appearance = scan.nextLine();
        character.setAppearance(appearance);

        System.out.println("Descreva as roupas do personagem:");
        String clothes = scan.nextLine();
        character.setClothes(clothes);

        System.out.print("Escolha o alinhamento do personagem:");
        System.out.println("1. Leal bom");
        System.out.println("2. Neutro bom");
        System.out.println("3. Caótico bom");
        System.out.println("4. Neutro bom");
        System.out.println("5. Neutro Verdadeiro");
        System.out.println("6. Neutro Caótico");
        System.out.println("7. Caótico bom");
        System.out.println("8. Caótico neutro");
        System.out.println("9. Caótico mal");

        int allin = scan.nextInt();
        String alinhaEscolhido = null;

        switch (allin) {
            case 1:
                alinhaEscolhido = "Leal bom";
                break;
            case 2:
                alinhaEscolhido = "Neutro bom";
                break;
            case 3:
                alinhaEscolhido = "Caótico Bom";
                break;
            case 4:
                alinhaEscolhido = "Neutro leal";
                break;
            case 5:
                alinhaEscolhido = "Neutro Verdadeiro";
                break;
            case 6:
                alinhaEscolhido = "Neutro Caótico";
                break;
            case 7:
                alinhaEscolhido = "Leal Mal";
                break;
            case 8:
                alinhaEscolhido = "Neutro Mal";
                break;
            case 9:
                alinhaEscolhido = "Caótico Mal";
                break;
            default:
                System.out.println("Escolha inválida.");
        }
        if (alinhaEscolhido != null) {
            character.setAlignment(alinhaEscolhido);
        }
        return character;
    }

    // Idiomas
    public static Character idionsAdd(Character character) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Digite os idiomas que o personagem fala, separados em vírgula");
        String idioms;
        idioms = sca.nextLine();
        character.setLanguages(idioms);

        return character;
    }

    // Inventário
    public static Bag invent() {
        Scanner ler = new Scanner(System.in);
        Bag bolsa = new Bag();

        System.out.println("Adicione os três itens iniciais a sua bolsa:");

        System.out.print("Item 1 nome: ");
        String nome1 = ler.nextLine();
        System.out.print("Item 1 quantidade: ");
        int qtd1 = ler.nextInt();
        ler.nextLine();

        System.out.print("Item 2 nome: ");
        String nome2 = ler.nextLine();
        System.out.print("Item 2 quantidade: ");
        int qtd2 = ler.nextInt();
        ler.nextLine();

        System.out.print("Item 3 nome: ");
        String nome3 = ler.nextLine();
        System.out.print("Item 3 quantidade: ");
        int qtd3 = ler.nextInt();
        ler.nextLine();

        bolsa.addItem(new Items(nome1, qtd1));
        bolsa.addItem(new Items(nome2, qtd2));
        bolsa.addItem(new Items(nome3, qtd3));

        ler.close();

        return bolsa;
    }

    // Atualizar pontos
    public static void updateStatusBar(StatusBar points, int personagemId) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Solicitar os novos valores para os pontos de status
            System.out.println("Informe os novos valores para os pontos de status:");

            System.out.print("Pontos de Vida: ");
            int hp = scanner.nextInt();

            System.out.print("Pontos de Experiência: ");
            int xp = scanner.nextInt();

            System.out.print("Pontos de Magia: ");
            int mp = scanner.nextInt();

            System.out.print("Pontos de Estamina: ");
            int pe = scanner.nextInt();

            System.out.print("Pontos de Constituição: ");
            int pc = scanner.nextInt();

            System.out.print("Pontos de Habilidades: ");
            int ph = scanner.nextInt();

            // Atualiza o objeto StatusBar com os novos valores
            points.setHP(hp);
            points.setXP(xp);
            points.setMP(mp);
            points.setPE(pe);
            points.setPC(pc);
            points.setPH(ph);

            // Atualiza a barra de status no banco de dados
            updatePoints(points, personagemId);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir números inteiros para os pontos de status.");
        } finally {
            scanner.close();
        }
    }

    // Atualizar inventário

    public static Bag updateInvent() throws SQLException {
        Scanner ler = new Scanner(System.in);
        Bag inventory = new Bag();
        boolean itemExists = false;

        // Obtém o nome do personagem
        System.out.print("Informe o nome do personagem: ");
        String nomePersonagem = ler.nextLine();

        // Obtém o ID do personagem pelo nome
        int personagemId = BagDAO.getCharByID(nomePersonagem);
        if (personagemId == -1) {
            System.out.println("Personagem não encontrado.");
        }

        // Nome e a quantidade do item
        System.out.print("Informe o nome do item: ");
        String itemName = ler.nextLine();
        System.out.print("Informe a quantidade do item: ");
        int itemQuantity = ler.nextInt();
        ler.nextLine();

        Items item = new Items(itemName, itemQuantity);

        // Verifica se o item já existe no inventário e atualiza a quantidade se necessário
        for (Items i : inventory.getItems()) {
            if (i.getName().equals(item.getName())) {
                i.setQuantity(i.getQuantity() + item.getQuantity());
                itemExists = true;
                break;
            }
        }
        // Adiciona no inventário se não existe
        if (!itemExists) {
            inventory.addItem(item);
            System.out.println("Inventário atualizado com sucesso!");
        }

        // Insere ou atualiza os itens no banco de dados
        BagDAO.insertItems(personagemId, item);
        return inventory;
    }

    // Listar itens do inventário
    public static void listInvent(List<Items> items){
        // Exibir os itens
        String texto = "Itens cadastrados:";
        if (items.isEmpty()) {
            texto += "\n\nNenhum item cadastrado";
        } else {
            for (Items item : items) {
                texto += "\n " + item.getName() + " - Quantidade: " + item.getQuantity() +
                        "\n-------------------------";
            }
        }
        System.out.println(texto);
    }

    // Deletar item no inventário
    public static void removeItesInvent(Scanner scanner) {
        List<Items> items = BagDAO.getItems();
        listInvent(items);

        System.out.println("Digite o nome do item a ser removido:");
        String itemName = scanner.nextLine();

        boolean success = BagDAO.deleteItem(itemName);
        if (success) {
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Item não encontrado.");
        }

        // Atualizar e listar os itens após a remoção
        items = BagDAO.getItems();
        listInvent(items);
    }

}