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
    public static void insertChar(Character character){
       String sql = "INSERT INTO character( name, race, classe, craft, age, height, appearance, clothes, alignment, idioms VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?))";
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

            System.out.println("Personagem Salvo com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Fechar conecções
            try{
                if (ps != null) {
                    ps.close();
                }
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

// Read - Select
    public List<Character> getChar() throws SQLException {
        String sql = "SELECT * FROM personagem";

        List<Character> personagems = new ArrayList<Character>();

        Connection conn = null;
        PreparedStatement ps = null;

        // Recuperar dados
        ResultSet rset = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            rset = ps.executeQuery();

            while (rset.next()){
                Character personagem = new Character(null);

                personagem.setName(rset.getString("name"));
                personagem.setRace((Race) rset.getObject("race"));
                personagem.setClasse((ClasseModel) rset.getObject("classe"));
                personagem.setCraft((Craft) rset.getObject("craft"));
                personagem.setAge(rset.getInt("age"));
                personagem.setHeight(rset.getDouble("height"));
                personagem.setAppearance(rset.getString("apparence"));
                personagem.setClothes(rset.getString("clothes"));
                personagem.setAlignment(rset.getString("alignment"));
                personagem.setLanguages(rset.getString("idioms"));

                personagems.add(personagem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (rset != null) {
                    rset.close();
                    ;
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
        return personagems;
    }
// Update
    public static void updateChar(Character character){

        String sql = "UPDATE personagem SET name = ?, race = ?, classe = ?, craft = ?, age = ?, height = ?, appearance = ?, clothers = ?, alignment = ?, idioms = ? WHERE id = ? ";

        Connection conn = null;
        PreparedStatement ps = null;

        try{
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
            try{
                if (ps != null){
                    ps.close();;
                }
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
// Delete
    public static void deleteChar(int id){
        String sql = "DELETE FROM personagem where id = ?";

        Connection conn = null;

        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if (ps != null){
                    ps.close();
                }
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
