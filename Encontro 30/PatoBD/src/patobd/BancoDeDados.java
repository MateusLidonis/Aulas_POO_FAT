package patobd;

import java.sql.*;

public class BancoDeDados {
    private final static String URL = "jdbc:mysql://localhost:3306/Animais";
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
    
    public void incluirPato(String nome) {
        String sql = "INSERT INTO Pato (nome) VALUES (?)";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.executeUpdate();
            System.out.println("Pato inserido com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o pato: " + e.getMessage());
        }
    }
    
    public void buscarPatos() {
        String sql = "SELECT * FROM Pato";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            
            System.out.println("Lista dos patos:");
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar lista de patos: " + e.getMessage());
        }
    }
    
    public void desconectar() {
        try {
            if(conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("Conexão encerrada!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão:" + e.getMessage());
        }
    }
}
