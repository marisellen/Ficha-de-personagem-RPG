package dao;

import points.StatusBar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatusBarDAO  extends CharacterDAO{

    //Create - Insert
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

/*    // Read -
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

    // Update -
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

    // Delete -
    public static void deletePoints(int id) {
        String sql = "DELETE FROM barra_de_status where id = ?";

        Connection conn = null;

        PreparedStatement ps = null;

        try {
            conn = Conect.conector();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
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
*/

}
