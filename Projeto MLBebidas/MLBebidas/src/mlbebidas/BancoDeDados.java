package mlbebidas;

import java.sql.*;
import javax.swing.JFrame;

public class BancoDeDados {

    private final static String URL = "jdbc:mysql://localhost:3306/mlbebidas";
    private final static String USER = "root";
    private final static String PASSWORD = "root";

    private Connection conn;

    public void conectar() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado ao banco de dados");
        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }
    }

//-----Login--------------------------------------------------------------------
    public void validaLogin(String nome, String senha, JFrame Login) {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND senha = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Usuário " + nome + " logado com sucesso!");
                    Login.dispose();
                    frame.Menu novaTela = new frame.Menu();
                    novaTela.setVisible(true);
                } else {
                    System.out.println("Erro ao efetuar login");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
//-----Listar Bebidas-----------------------------------------------------------
    public ResultSet listarBebidas() throws SQLException{
        String sql = "SELECT * FROM bebidas";
        PreparedStatement stmt = conn.prepareStatement(sql);
        return stmt.executeQuery();
    }
    
//-----Incluir Bebidas----------------------------------------------------------    
    public void incluirBebidas(String nome, int quantidade) {
        // Não insiro o id pois na criação da tabela deixei esse campo como serial (autonumber)
        String sql = "INSERT INTO bebidas (nome, quantidade) VALUES (?, ?)";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.setInt(2, quantidade);
            stmt.executeUpdate();
            System.out.println("Bebida " + nome + " inserida com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir a bebida: " + e.getMessage());
        }
    }  
    
//-----Excluir Bebidas----------------------------------------------------------    
    public void excluirBebidas(int id) {
        // Não insiro o id pois na criação da tabela deixei esse campo como serial (autonumber)
        String sql = "DELETE FROM bebidas WHERE id = ?";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Bebida excluída com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir a bebida: " + e.getMessage());
        }
    }     
    
//-----Atualizar Bebidas----------------------------------------------------------    
    public void atualizarBebidas(int id, String nome, int quantidade) {
        // Não insiro o id pois na criação da tabela deixei esse campo como serial (autonumber)
        String sql = "UPDATE bebidas SET nome = ?, quantidade = ? WHERE id = ?";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.setInt(2, quantidade);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Bebida " + nome + " atualizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a bebida: " + e.getMessage());
        }
    }     

    public void desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexão encerrada!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão:" + e.getMessage());
        }
    }
}
