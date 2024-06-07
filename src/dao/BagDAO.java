package dao;

import inventory.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BagDAO {

//Create - Insert - ok
public static void insertItems(int personagemId, Items item) throws SQLException {
    Connection conn = null;
    PreparedStatement psSelect = null;
    PreparedStatement psUpdate = null;
    PreparedStatement psInsert = null;
    ResultSet rs = null;

    try {
        conn = Conect.conector();

        // Verifica se o personagem existe
        String personagemSql = "SELECT id FROM personagem WHERE id = ?";
        psSelect = conn.prepareStatement(personagemSql);
        psSelect.setInt(1, personagemId);
        rs = psSelect.executeQuery();

        if (!rs.next()) {
            throw new SQLException("Personagem com ID " + personagemId + " não encontrado.");
        }

        // Verifica se o item já existe no inventário
        String selectSql = "SELECT quantidade FROM inventario WHERE name = ? AND personagem_id = ?";
        psSelect = conn.prepareStatement(selectSql);
        psSelect.setString(1, item.getName());
        psSelect.setInt(2, personagemId);
        rs = psSelect.executeQuery();

        if (rs.next()) {
            // Atualiza a quantidade do item existente
            int currentQuantity = rs.getInt("quantidade");
            int newQuantity = currentQuantity + item.getQuantity();

            String updateSql = "UPDATE inventario SET quantidade = ? WHERE name = ? AND personagem_id = ?";
            psUpdate = conn.prepareStatement(updateSql);
            psUpdate.setInt(1, newQuantity);
            psUpdate.setString(2, item.getName());
            psUpdate.setInt(3, personagemId);
            psUpdate.executeUpdate();
        } else {
            // Insere um novo registro no inventário
            String insertSql = "INSERT INTO inventario (name, quantidade, personagem_id) VALUES (?, ?, ?)";
            psInsert = conn.prepareStatement(insertSql);
            psInsert.setString(1, item.getName());
            psInsert.setInt(2, item.getQuantity());
            psInsert.setInt(3, personagemId);
            psInsert.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (psSelect != null) {
                psSelect.close();
            }
            if (psUpdate != null) {
                psUpdate.close();
            }
            if (psInsert != null) {
                psInsert.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    // Read -
    public static List<Items> getItems() {
        String sql = "SELECT * FROM inventario";

        List<Items> items = new ArrayList<>();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rset = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            rset = ps.executeQuery();

            while (rset.next()) {
                Items item = new Items(null, 0);

                item.setName(rset.getString("name"));
                item.setQuantity(rset.getInt("quantidade"));
                items.add(item);
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
        return items;
    }

    // Delete -
    public static void deleteItems(int id) {
        String sql = "DELETE FROM inventario where id = ?";

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