package dao;

import characteristics.Character;
import classes.*;
import points.StatusBar;
import races.*;
import skills.Craft;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterDAO {

    //Create - Insert - ok
    public static int insertChar(Character character) throws SQLException {
        String sql = "INSERT INTO personagem (name, race_id, classe, craft, age, height, appearance, clothes, alignment, idioms) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement psPersonagem = null;

        ResultSet rs;
        int personagemId = -1;
        try {
            conn = Conect.conector();

            //Inserir os dados na tabela Race
            String raceSql = "INSERT INTO Race (name, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
            psPersonagem = conn.prepareStatement(raceSql, PreparedStatement.RETURN_GENERATED_KEYS);
            psPersonagem.setString(1, character.getRace().getRaceName());
            psPersonagem.setInt(2, character.getRace().deslocamento(0));
            psPersonagem.setBoolean(3, character.getRace().hasDarkVision());
            psPersonagem.executeUpdate();
            ResultSet rs2 = psPersonagem.getGeneratedKeys();
            int raceId = 0;
            if (rs2.next()) {
                raceId = rs2.getInt(1);
            }
            rs2.close();
            psPersonagem.close();

            //Inserir os dados na tabela Classe
            String classeSql = "INSERT INTO classe (name, magicClass) VALUES (?, ?)";
            psPersonagem = conn.prepareStatement(classeSql, PreparedStatement.RETURN_GENERATED_KEYS);
            psPersonagem.setString(1, character.getClasse().getClasseName());
            psPersonagem.setBoolean(2, character.getClasse().isMagicClass());
            psPersonagem.executeUpdate();
            ResultSet rs1 = psPersonagem.getGeneratedKeys();
            int classId = 0;
            if (rs1.next()) {
                classId = rs1.getInt(1);
            }
            rs1.close();
            psPersonagem.close();

            // Dados específicos das subraças
            if (character.getRace() instanceof Dragonborn) {
                String dragonbornSql = "INSERT INTO dragonborn (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                psPersonagem = conn.prepareStatement(dragonbornSql);
                psPersonagem.setInt(1, raceId);
                psPersonagem.setInt(2, character.getRace().deslocamento(0));
                psPersonagem.setBoolean(3, ((Dragonborn) character.getRace()).hasDarkVision());
                psPersonagem.executeUpdate();
                psPersonagem.close();
            }
            if (character.getRace() instanceof Dwarf) {
                String dwarfSql = "INSERT INTO dwarf (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                psPersonagem = conn.prepareStatement(dwarfSql);
                psPersonagem.setInt(1, raceId);
                psPersonagem.setInt(2, character.getRace().deslocamento(0));
                psPersonagem.setBoolean(3, ((Dwarf) character.getRace()).hasDarkVision());
                psPersonagem.executeUpdate();
                psPersonagem.close();
            }
            if (character.getRace() instanceof Elven) {
                String elvenSql = "INSERT INTO elven (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                psPersonagem = conn.prepareStatement(elvenSql);
                psPersonagem.setInt(1, raceId);
                psPersonagem.setInt(2, character.getRace().deslocamento(0));
                psPersonagem.setBoolean(3, ((Elven) character.getRace()).hasDarkVision());
                psPersonagem.executeUpdate();
                psPersonagem.close();
            }
            if (character.getRace() instanceof Halfling) {
                String halflingfSql = "INSERT INTO halfling (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                psPersonagem = conn.prepareStatement(halflingfSql);
                psPersonagem.setInt(1, raceId);
                psPersonagem.setInt(2, character.getRace().deslocamento(0));
                psPersonagem.setBoolean(3, ((Halfling) character.getRace()).hasDarkVision());
                psPersonagem.executeUpdate();
                psPersonagem.close();
            }
            if (character.getRace() instanceof Human) {
                String humanfSql = "INSERT INTO human (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                psPersonagem = conn.prepareStatement(humanfSql);
                psPersonagem.setInt(1, raceId);
                psPersonagem.setInt(2, character.getRace().deslocamento(0));
                psPersonagem.setBoolean(3, ((Human) character.getRace()).hasDarkVision());
                psPersonagem.executeUpdate();
                psPersonagem.close();
            }
            if (character.getRace() instanceof Ork) {
                String orkSql = "INSERT INTO ork (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                psPersonagem = conn.prepareStatement(orkSql);
                psPersonagem.setInt(1, raceId);
                psPersonagem.setInt(2, character.getRace().deslocamento(0));
                psPersonagem.setBoolean(3, ((Ork) character.getRace()).hasDarkVision());
                psPersonagem.executeUpdate();
                psPersonagem.close();
            }
            if (character.getRace() instanceof Tiefling) {
                String tieflingSql = "INSERT INTO tiefling (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                psPersonagem = conn.prepareStatement(tieflingSql);
                psPersonagem.setInt(1, raceId);
                psPersonagem.setInt(2, character.getRace().deslocamento(0));
                psPersonagem.setBoolean(3, ((Tiefling) character.getRace()).hasDarkVision());
                psPersonagem.executeUpdate();
                psPersonagem.close();
            }

            // Dados específicos das subclasses
            if (character.getClasse() instanceof Archer) {
                String archerSql = "INSERT INTO archer (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(archerSql);
                psPersonagem.setInt(1, classId);
                //ps.executeUpdate();
                psPersonagem.close();
            }
            if (character.getClasse() instanceof Bard) {
                String bardSql = "INSERT INTO bard (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(bardSql);
                psPersonagem.setInt(1, classId);
                psPersonagem.close();
            }
            if (character.getClasse() instanceof Cleric) {
                String clericSql = "INSERT INTO cleric (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(clericSql);
                psPersonagem.setInt(1, classId);
                psPersonagem.close();
            }
            if (character.getClasse() instanceof Druid) {
                String druidSql = "INSERT INTO druid (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(druidSql);
                psPersonagem.setInt(1, classId);
                psPersonagem.close();
            }
            if (character.getClasse() instanceof Mage) {
                String mageSql = "INSERT INTO mage (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(mageSql);
                psPersonagem.setInt(1, classId);
                psPersonagem.close();
            }
            if (character.getClasse() instanceof Necromancer) {
                String necromancerSql = "INSERT INTO necromancer (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(necromancerSql);
                psPersonagem.setInt(1, classId);
                psPersonagem.close();
            }
            if (character.getClasse() instanceof Paladin) {
                String paladinSql = "INSERT INTO paladin (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(paladinSql);
                psPersonagem.setInt(1, classId);
                psPersonagem.close();
            }
            if (character.getClasse() instanceof Rogue) {
                String rogueSql = "INSERT INTO rogue (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(rogueSql);
                psPersonagem.setInt(1, classId);
                psPersonagem.close();
            }
            if (character.getClasse() instanceof Warrior) {
                String warriorSql = "INSERT INTO warrior (class_id, magicClass) VALUES (?, ?)";
                psPersonagem = conn.prepareStatement(warriorSql);
                psPersonagem.setInt(1, classId);
                psPersonagem.close();
            }

            // Dados de craft
            String craftSql = "INSERT INTO craft (name) VALUES (?)";
            Craft craft = character.getCraft();
            int craftId = 0;

            try {
                conn = Conect.conector();
                psPersonagem = conn.prepareStatement(craftSql, PreparedStatement.RETURN_GENERATED_KEYS);
                psPersonagem.setString(1, craft.getCraftName());
                psPersonagem.executeUpdate();
                rs = psPersonagem.getGeneratedKeys();
                if (rs.next()) {
                    craftId = rs.getInt(1);
                }
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Insere os dados do personagem
            String charSql = "INSERT INTO personagem (name, age, height, appearance, clothes, alignment, idioms) VALUES (?, ?, ?, ?, ?, ?, ?)";
            psPersonagem = conn.prepareStatement(charSql, Statement.RETURN_GENERATED_KEYS); // Solicita chaves geradas
            psPersonagem.setString(1, character.getName());
            psPersonagem.setInt(2, character.getAge());
            psPersonagem.setDouble(3, character.getHeight());
            psPersonagem.setString(4, character.getApparence());
            psPersonagem.setString(5, character.getClothes());
            psPersonagem.setString(6, character.getAlignment());
            psPersonagem.setString(7, character.getLanguages());
            psPersonagem.execute();
            System.out.println("Personagem salvo com sucesso!");

            // Recupera o ID gerado do personagem
            ResultSet rsx = psPersonagem.getGeneratedKeys();
            if (rsx.next()) {
                personagemId = rsx.getInt(1);
            } else {
                throw new SQLException("Falha ao recuperar o ID do personagem.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar conexões
            try {
                if (psPersonagem != null) {
                    psPersonagem.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return personagemId;
    }

    // Read - Select - ok
    public static List<Character> getChar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Character> characters = new ArrayList<>();

        try {
            conn = Conect.conector();
            String sql = "SELECT name FROM personagem";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Character character = new Character();
                character.setName(rs.getString("name"));
                characters.add(character);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return characters;
        }
    }

    // Delete - ok
    public static void deleteChar(String name) {
        String getIdSql = "SELECT id FROM personagem WHERE name = ?";
        String deleteBarraDeStatusSql = "DELETE FROM barra_de_status WHERE personagem_id = ?";
        String deleteInventarioSql = "DELETE FROM inventario WHERE personagem_id = ?";
        String deletePersonagemSql = "DELETE FROM personagem WHERE id = ?";
        Connection conn = null;
        PreparedStatement psGetId = null;
        PreparedStatement psDeleteBarraDeStatus = null;
        PreparedStatement psDeleteInventario = null;
        PreparedStatement psDeletePersonagem = null;

        try {
            conn = Conect.conector();
            conn.setAutoCommit(false); // Iniciar transação

            // Buscar o ID do personagem
            psGetId = conn.prepareStatement(getIdSql);
            psGetId.setString(1, name);
            ResultSet rs = psGetId.executeQuery();

            if (rs.next()) {
                int personagemId = rs.getInt("id");

                // Deletar registros relacionados na tabela barra_de_status
                psDeleteBarraDeStatus = conn.prepareStatement(deleteBarraDeStatusSql);
                psDeleteBarraDeStatus.setInt(1, personagemId);
                psDeleteBarraDeStatus.executeUpdate();

                // Deletar registros relacionados na tabela inventario
                psDeleteInventario = conn.prepareStatement(deleteInventarioSql);
                psDeleteInventario.setInt(1, personagemId);
                psDeleteInventario.executeUpdate();

                // Deletar registro da tabela personagem
                psDeletePersonagem = conn.prepareStatement(deletePersonagemSql);
                psDeletePersonagem.setInt(1, personagemId);
                int rowsAffected = psDeletePersonagem.executeUpdate();

                if (rowsAffected > 0) {
                    conn.commit(); // Confirmar transação
                    System.out.println("Personagem excluído com sucesso!");
                } else {
                    conn.rollback(); // Reverter transação em caso de erro
                    System.out.println("Nenhum personagem encontrado com o nome fornecido.");
                }
            } else {
                System.out.println("Nenhum personagem encontrado com o nome fornecido.");
            }
        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback(); // Reverter transação em caso de erro
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // Fecha a conexão e as declarações
            try {
                if (psGetId != null) {
                    psGetId.close();
                }
                if (psDeleteBarraDeStatus != null) {
                    psDeleteBarraDeStatus.close();
                }
                if (psDeleteInventario != null) {
                    psDeleteInventario.close();
                }
                if (psDeletePersonagem != null) {
                    psDeletePersonagem.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}