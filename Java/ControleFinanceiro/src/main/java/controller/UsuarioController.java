package controller;

import dao.UsuarioDAO;
import model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/usuario")
public class UsuarioController extends HttpServlet {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String email = req.getParameter("email");
        String usuario = req.getParameter("usuario");
        String senha = req.getParameter("senha");

        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSobrenome(sobrenome);
        u.setEmail(email);
        u.setUsuario(usuario);
        u.setSenha(senha);

        usuarioDAO.inserir(u);

        resp.setContentType("text/plain; charset=UTF-8");
        resp.getWriter().write("Usuário criado com sucesso!");
    }
}
