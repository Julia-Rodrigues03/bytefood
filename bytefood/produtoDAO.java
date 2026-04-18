package bytefood;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class produtoDAO {

    public void cadastrarNoBanco(produtos produto) {
        String sql = "INSERT INTO produto (nome, descricao, preco) VALUES (?, ?, ?)";

        try (Connection conexao = ConexaoBD.conectar();
            PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, produto.getNome());
            comando.setString(2, produto.getDescricao());
            comando.setDouble(3, produto.getPreco());

            comando.executeUpdate();
            System.out.println("✅ Produto '" + produto.getNome() + "' registado com sucesso!");

        } catch (SQLException e) {
            System.out.println("❌ Erro ao salvar produto: " + e.getMessage());
        }
    }
}