package dao;

import points.StatusBar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatusBarDAO  extends CharacterDAO{

    //Create - Insert - ok
    public static void insertPoints(StatusBar points, int personagemId) {
        String sql = "INSERT INTO barra_de_status(pontos_vida, pontos_experiencia, pontos_magia, pontos_estamina, pontos_constituicao, pontos_habilidades, personagem_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement psStatusBar = null;

        try {
            conn = Conect.conector();
            psStatusBar = conn.prepareStatement(sql);

            // Adicionar valores
            psStatusBar.setInt(1, points.getHP());
            psStatusBar.setInt(2, points.getXP());
            psStatusBar.setInt(3, points.getMP());
            psStatusBar.setInt(4, points.getPE());
            psStatusBar.setInt(5, points.getPC());
            psStatusBar.setInt(6, points.getPH());
            psStatusBar.setInt(7, personagemId);

            // Executar
            psStatusBar.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar conexões
            try {
                if (psStatusBar != null) {
                    psStatusBar.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Update - ok
    public static void updatePoints(StatusBar points, int personagemId) {
        String sql = "UPDATE barra_de_status SET pontos_vida = ?, pontos_experiencia = ?, pontos_magia = ?, Pontos_estamina = ?, pontos_constituicao = ?, pontos_habilidades = ? WHERE personagem_id = ?";

        Connection conn = null;
        PreparedStatement psStatusBar = null;

        try{
            conn = Conect.conector();
            psStatusBar = conn.prepareStatement(sql);

            // Atualisar
            psStatusBar.setInt(1, points.getHP());
            psStatusBar.setInt(2, points.getXP());
            psStatusBar.setInt(3, points.getMP());
            psStatusBar.setInt(4, points.getPE());
            psStatusBar.setInt(5, points.getPC());
            psStatusBar.setInt(6, points.getPH());
            psStatusBar.setInt(7, personagemId);

            psStatusBar.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if (psStatusBar != null){
                    psStatusBar.close();;
                }
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static int getIdFromName(String nomePersonagem) throws SQLException {
        int id = -1;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = Conect.conector();
            String sql = "SELECT id FROM personagem WHERE name = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nomePersonagem);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return id;
    }
    public static StatusBar getStatus(int personagemId) throws SQLException {
        StatusBar statusBar = new StatusBar();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = Conect.conector();
            String sql = "SELECT pontos_vida, pontos_experiencia, pontos_magia, Pontos_estamina, pontos_constituicao, pontos_habilidades FROM barra_de_status WHERE personagem_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, personagemId);
            rs = ps.executeQuery();

            if (rs.next()) {
                statusBar.setHP(rs.getInt("pontos_vida"));
                statusBar.setXP(rs.getInt("pontos_experiencia"));
                statusBar.setMP(rs.getInt("pontos_magia"));
                statusBar.setPE(rs.getInt("Pontos_estamina"));
                statusBar.setPC(rs.getInt("pontos_constituicao"));
                statusBar.setPH(rs.getInt("pontos_habilidades"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return statusBar;
    }

}
