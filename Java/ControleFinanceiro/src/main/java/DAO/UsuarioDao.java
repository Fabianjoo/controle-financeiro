package dao;

import DAO.ConnectionFactory;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDao {

    // INSERIR USUÁRIO
    public void inserir(Usuario u) {
        String sql = "INSERT INTO usuario (nome, sobrenome, email, usuario, senha) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSobrenome());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getUsuario());
            stmt.setString(5, u.getSenha());

            stmt.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir usuário: " + e.getMessage());
        }
    }

    // DELETAR USUÁRIO PELO ID
    public void deletar(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar usuário: " + e.getMessage());
        }
    }
}
