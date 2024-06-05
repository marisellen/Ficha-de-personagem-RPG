package dao;

import characteristics.Character;
import classes.ClasseModel;
import races.Race;
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
        String sql = "INSERT INTO personagem (name, race, classe, craft, age, height, appearance, clothes, alignment, idioms) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            // Adicionar valores
            ps.setString(1, character.getName());
            ps.setObject(2, character.getRace());
            ps.setObject(3, character.getClasse());
            ps.setObject(4, character.getCraft());
            ps.setInt(5, character.getAge());
            ps.setDouble(6, character.getHeight());
            ps.setString(7, character.getApparence());
            ps.setString(8, character.getClothes());
            ps.setString(9, character.getAlignment());
            ps.setString(10, character.getLanguages());
            // Executar
            ps.execute();

            System.out.println("Personagem salvo com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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
        // Recuperar dados
        ResultSet rset = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            rset = ps.executeQuery();

            while (rset.next()) {
                Character character = new Character(rset.getString("name"));
                // Inserir no banco de dados
                character.setName(rset.getString("name"));
                character.setRace((Race) rset.getObject("race"));
                character.setClasse((ClasseModel) rset.getObject("classe"));
                character.setCraft((Craft) rset.getObject("craft"));
                character.setAge(rset.getInt("age"));
                character.setHeight(rset.getDouble("height"));
                character.setAppearance(rset.getString("apparence"));
                character.setClothes(rset.getString("clothes"));
                character.setAlignment(rset.getString("alignment"));
                character.setLanguages(rset.getString("idioms"));

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
    }    // Update
    public static void updateChar(Character character){
        String sql = "UPDATE personagem SET name = ?, race = ?, classe = ?, craft = ?, age = ?, height = ?, appearance = ?, clothes = ?, alignment = ?, idioms = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);

            // Atualisar
            ps.setString(1, character.getName());
            ps.setObject(2, character.getRace());
            ps.setObject(3, character.getClass());
            ps.setObject(4, character.getCraft());
            ps.setInt(5, character.getAge());
            ps.setDouble(6, character.getHeight());
            ps.setString(7, character.getApparence());
            ps.setString(8, character.getClothes());
            ps.setString(9, character.getAlignment());
            ps.setString(10, character.getLanguages());

            ps.execute();
        } catch (Exception e) {
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
    public static void deleteChar(int id){
        String sql = "DELETE FROM personagem WHERE id = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
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