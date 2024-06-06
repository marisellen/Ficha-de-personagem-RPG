package dao;

import characteristics.Character;
import classes.*;
import races.*;
import skills.Craft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterDAO {

    //Create - Insert
    public static void insertChar(Character character) {
        String sql = "INSERT INTO personagem (name, race_id, classe, craft, age, height, appearance, clothes, alignment, idioms) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();

            //Inserir os dados na tabela Race
            String raceSql = "INSERT INTO Race (name, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(raceSql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, character.getRace().getRaceName());
            ps.setInt(2, character.getRace().deslocamento(0));
            ps.setBoolean(3, character.getRace().hasDarkVision());
            ps.executeUpdate();
            ResultSet rs2 = ps.getGeneratedKeys();
            int raceId = 0;
            if (rs2.next()) {
                raceId = rs2.getInt(1);
            }
            rs2.close();
            ps.close();

            //Inserir os dados na tabela Classe
            String classeSql = "INSERT INTO classe (name, magicClass) VALUES (?, ?)";
            ps = conn.prepareStatement(classeSql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, character.getClasse().getClasseName());
            ps.setBoolean(2, character.getClasse().isMagicClass());
            ps.executeUpdate();
            ResultSet rs1 = ps.getGeneratedKeys();
            int classId = 0;
            if (rs1.next()) {
                classId = rs1.getInt(1);
            }
            rs1.close();
            ps.close();

            // Dados específicos das subraças
            if (character.getRace() instanceof Dragonborn) {
                String dragonbornSql = "INSERT INTO dragonborn (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(dragonbornSql);
                ps.setInt(1, raceId);
                ps.setInt(2, character.getRace().deslocamento(0));
                ps.setBoolean(3, ((Dragonborn) character.getRace()).hasDarkVision());
                ps.executeUpdate();
                ps.close();
            }
            if (character.getRace() instanceof Dwarf) {
                String dwarfSql = "INSERT INTO dwarf (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(dwarfSql);
                ps.setInt(1, raceId);
                ps.setInt(2, character.getRace().deslocamento(0));
                ps.setBoolean(3, ((Dwarf) character.getRace()).hasDarkVision());
                ps.executeUpdate();
                ps.close();
            }
            if (character.getRace() instanceof Elven) {
                String elvenSql = "INSERT INTO elven (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(elvenSql);
                ps.setInt(1, raceId);
                ps.setInt(2, character.getRace().deslocamento(0));
                ps.setBoolean(3, ((Elven) character.getRace()).hasDarkVision());
                ps.executeUpdate();
                ps.close();
            }
            if (character.getRace() instanceof Halfling) {
                String halflingfSql = "INSERT INTO halfling (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(halflingfSql);
                ps.setInt(1, raceId);
                ps.setInt(2, character.getRace().deslocamento(0));
                ps.setBoolean(3, ((Halfling) character.getRace()).hasDarkVision());
                ps.executeUpdate();
                ps.close();
            }
            if (character.getRace() instanceof Human) {
                String humanfSql = "INSERT INTO human (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(humanfSql);
                ps.setInt(1, raceId);
                ps.setInt(2, character.getRace().deslocamento(0));
                ps.setBoolean(3, ((Human) character.getRace()).hasDarkVision());
                ps.executeUpdate();
                ps.close();
            }
            if (character.getRace() instanceof Ork) {
                String orkSql = "INSERT INTO ork (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(orkSql);
                ps.setInt(1, raceId);
                ps.setInt(2, character.getRace().deslocamento(0));
                ps.setBoolean(3, ((Ork) character.getRace()).hasDarkVision());
                ps.executeUpdate();
                ps.close();
            }
            if (character.getRace() instanceof Tiefling) {
                String tieflingSql = "INSERT INTO tiefling (race_id, deslocamento, visaoNoEscuro) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(tieflingSql);
                ps.setInt(1, raceId);
                ps.setInt(2, character.getRace().deslocamento(0));
                ps.setBoolean(3, ((Tiefling) character.getRace()).hasDarkVision());
                ps.executeUpdate();
                ps.close();
            }

            // Dados específicos das subclasses
            if (character.getClasse() instanceof Archer) {
                String archerSql = "INSERT INTO archer (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(archerSql);
                ps.setInt(1, classId);
                //ps.executeUpdate();
                ps.close();
            }
            if (character.getClasse() instanceof Bard) {
                String bardSql = "INSERT INTO bard (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(bardSql);
                ps.setInt(1, classId);
                ps.close();
            }
            if (character.getClasse() instanceof Cleric) {
                String clericSql = "INSERT INTO cleric (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(clericSql);
                ps.setInt(1, classId);
                ps.close();
            }
            if (character.getClasse() instanceof Druid) {
                String druidSql = "INSERT INTO druid (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(druidSql);
                ps.setInt(1, classId);
                ps.close();
            }
            if (character.getClasse() instanceof Mage) {
                String mageSql = "INSERT INTO mage (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(mageSql);
                ps.setInt(1, classId);
                ps.close();
            }
            if (character.getClasse() instanceof Necromancer) {
                String necromancerSql = "INSERT INTO necromancer (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(necromancerSql);
                ps.setInt(1, classId);
                ps.close();
            }
            if (character.getClasse() instanceof Paladin) {
                String paladinSql = "INSERT INTO paladin (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(paladinSql);
                ps.setInt(1, classId);
                ps.close();
            }
            if (character.getClasse() instanceof Rogue) {
                String rogueSql = "INSERT INTO rogue (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(rogueSql);
                ps.setInt(1, classId);
                ps.close();
            }
            if (character.getClasse() instanceof Warrior) {
                String warriorSql = "INSERT INTO warrior (class_id, magicClass) VALUES (?, ?)";
                ps = conn.prepareStatement(warriorSql);
                ps.setInt(1, classId);
                ps.close();
            }

            // Dados de craft
            String craftSql = "INSERT INTO craft (name) VALUES (?)";
            Craft craft = character.getCraft();
            int craftId = 0;

            try {
                conn = Conect.conector();
                ps = conn.prepareStatement(craftSql, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, craft.getCraftName());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    craftId = rs.getInt(1);
                }
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Insere os dados do personagem
            String charSql = "INSERT INTO personagem (name, age, height, appearance, clothes, alignment, idioms) VALUES (?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(charSql);
            ps.setString(1, character.getName());
            ps.setInt(2, character.getAge());
            ps.setDouble(3, character.getHeight());
            ps.setString(4, character.getApparence());
            ps.setString(5, character.getClothes());
            ps.setString(6, character.getAlignment());
            ps.setString(7, character.getLanguages());
            ps.execute();
            System.out.println("Personagem salvo com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar conexões
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Read - Select
    public static List<Character> getChar() {
        String sql = "SELECT * FROM personagem";

        List<Character> characters = new ArrayList<>();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rset = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            rset = ps.executeQuery();

            while (rset.next()) {
                Character character = new Character(rset.getString("name"));
                // Recupere e configure os dados do personagem
                character.setName(rset.getString("name"));
                // Você precisará adicionar lógica para recuperar e configurar a subclasse Race
                // Com base no tipo de raça, consulte as tabelas específicas (Dragonborn, etc.)
                // e configure os atributos apropriados

                characters.add(character);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
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
        }
        return characters;
    }

    // Update
    public static void updateChar(Character character) {
        String sql = "UPDATE personagem SET name = ?, classe = ?, craft = ?, age = ?, height = ?, appearance = ?, clothes = ?, alignment = ?, idioms = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);

            // Atualize os dados do personagem
            ps.setString(1, character.getName());
            ps.setObject(2, character.getClasse());
            ps.setObject(3, character.getCraft());
            ps.setInt(4, character.getAge());
            ps.setDouble(5, character.getHeight());
            ps.setString(6, character.getApparence());
            ps.setString(7, character.getClothes());
            ps.setString(8, character.getAlignment());
            ps.setString(9, character.getLanguages());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Delete
    public static void deleteChar(int id) {
        String sql = "DELETE FROM personagem WHERE id = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
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