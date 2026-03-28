package dao;

import conexion.ConexionDB;
import modelo.Operario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperarioDAO {

    public void insertar(Operario op) {
        String sql = "INSERT INTO operario(nombre, turno) VALUES (?, ?)";

        try (Connection conn = ConexionDB.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, op.getNombre());
            ps.setString(2, op.getTurno());
            ps.executeUpdate();

            System.out.println("Insertado");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Operario> listar() {
        List<Operario> lista = new ArrayList<>();
        String sql = "SELECT * FROM operario";

        try (Connection conn = ConexionDB.conectar();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Operario(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("turno")
                ));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
