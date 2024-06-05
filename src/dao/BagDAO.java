package dao;

import inventory.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BagDAO {

    public static void insertItems(Bag bag, Items items) {
        String sql = "INSERT INTO inventario(nome, quantidade) VALUES (?, ?)";
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);

            // Adicionar valores
            ps.setString(1, items.getName());
            ps.setInt(2, items.getQuantity());
            // Executar
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
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

                item.setName(rset.getString("nome"));
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

    public static void updateItems(Items items) {
        String sql = "UPDATE inventario SET nome = ?, quantidade = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);

            // Atualizar
            ps.setString(1, items.getName());
            ps.setInt(2, items.getQuantity());
            ps.executeUpdate();
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

    public static void deleteItems(int id) {
        String sql = "DELETE FROM inventario where id = ?";

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