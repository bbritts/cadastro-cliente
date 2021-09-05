package application;

import java.sql.Connection;
import database.Conexao;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = Conexao.abrirConexao();
		Conexao.fecharConexao();
	}
}
