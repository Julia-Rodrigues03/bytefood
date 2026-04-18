package bytefood;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {




    // 1. Configurações do Banco de Dados
    // Lembre-se de trocar "seubanco", "postgres" e "suasenha" pelos seus dados reais do pgAdmin!
    private static final String URL = "jdbc:postgresql://localhost:5432/Bytefood";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "root";

    // 2. Método para estabelecer a conexão
    public static Connection conectar() {
    Connection conexao = null;
    try {
        // 1. FORÇA O JAVA A LER O DRIVER DO POSTGRESQL
        Class.forName("org.postgresql.Driver");
        
        // 2. Tenta conectar no banco Bytefood
        conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("✅ Conexão com o PostgreSQL realizada com sucesso!");
        
    } catch (ClassNotFoundException e) {
        System.out.println("❌ O VS Code não encontrou o arquivo .jar do Driver!");
    } catch (SQLException e) {
        System.out.println("❌ Erro ao conectar com o banco de dados.");
        e.printStackTrace();
    }
    return conexao;
}

    // 3. Método para testar se está tudo funcionando
    public static void main(String[] args) {
        // Ao rodar este arquivo, ele tenta conectar e exibe a mensagem
        conectar();
    }
}