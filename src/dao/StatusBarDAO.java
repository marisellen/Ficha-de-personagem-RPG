package dao;

import points.StatusBar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StatusBarDAO {

    public static void insertPoints(StatusBar points) {
        String sql = "INSERT INTO barra_de_status(pontos_vida, pontos_experiência, pontos_magia, Pontos_estamina, pontos_constituição, pontos_habilidades VALUES (?, ?, ?, ?, ?, ?)) ";
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);

            // Adicionar valores
            ps.setInt(1, points.getHP());
            ps.setInt(2, points.getXP());
            ps.setInt(3, points.getMP());
            ps.setInt(4, points.getPE());
            ps.setInt(5, points.getPC());
            ps.setInt(6, points.getPH());
            // Esecutar
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Fechar conecções
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

    public static List<StatusBar> getPoints() {
        String sql = "SELECT * FROM barra_de_status";

        List<StatusBar> points = new ArrayList<StatusBar>();

        Connection conn = null;
        PreparedStatement ps = null;

        // Recuperar dados
        ResultSet rset = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            rset = ps.executeQuery();

            while (rset.next()){
                StatusBar point = new StatusBar(0, 0, 0, 0, 0, 0);

                point.setHP(rset.getInt(1));
                point.setXP(rset.getInt(2));
                point.setPE(rset.getInt(3));
                point.setMP(rset.getInt(4));
                point.setPC(rset.getInt(5));
                point.setPH(rset.getInt(6));

                points.add(point);
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
        return points;
    }

    public static void updatePoints(StatusBar points) {

        String sql = "UPDATE barra_de_status SET pontos_vida = ?, pontos_experiência = ?, pontos_magia = ?, Pontos_estamina = ?, pontos_constituição = ?, pontos_habilidades = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);

            // Atualisar
            ps.setInt(1, points.getHP());
            ps.setInt(2, points.getXP());
            ps.setInt(3, points.getMP());
            ps.setInt(4, points.getPE());
            ps.setInt(5, points.getPC());
            ps.setInt(6, points.getPH());

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

    public static void deletePoints(int id) {
        String sql = "DELETE FROM barra_de_status where id = ?";

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
