/**
 * Classe User
 *
 * Esta classe representa um usuário e contém métodos para interagir com um banco de dados MySQL.
 *
 * @version 1.0
 * @since 2023-10-19
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    /**
     * Estabelece uma conexão com o banco de dados MySQL.
     *
     * @return Uma instância de Connection ou null em caso de falha na conexão.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // Configuração da URL de conexão com o banco de dados
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Lida com exceções de conexão
        }
        return conn;
    }

    /**
     * Nome do usuário.
     */
    public String nome = "";

    /**
     * Resultado da verificação de usuário.
     */
    public boolean result = false;

    /**
     * Verifica as credenciais de um usuário no banco de dados.
     *
     * @param login O nome de usuário a ser verificado.
     * @param senha A senha associada ao nome de usuário.
     * @return true se as credenciais forem válidas, caso contrário, false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();

        // INSTRUÇÃO SQL para buscar o nome do usuário com base no login e senha fornecidos
        sql += "SELECT nome FROM usuarios ";
        sql += "WHERE login = '" + login + "'";
        sql += " AND senha = '" + senha + "'";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            // Se uma linha é retornada, as credenciais são válidas
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Lida com exceções durante a verificação do usuário
        }
        return result;
    }
}
