package model.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import database.Conexao;
import database.DBException;

import model.dao.ClienteDao;
import model.domain.Cliente;
import model.domain.Endereco;
import model.domain.Telefone;
import model.domain.enums.SiglaEstado;
import model.domain.enums.TipoTelefone;

public class ClienteDaoJDBC implements ClienteDao{
	
	private Connection conexao;
	
	//Construtor força a dependência de uma conexão com o banco de dados	
	public ClienteDaoJDBC(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void insere(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualiza(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletaPorId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscarPorId(int id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conexao.prepareStatement(
					    "SELECT * FROM clientes c INNER JOIN enderecos e ON c.id = e.id_cliente "
					    + "NATURAL JOIN telefones t WHERE id = ?");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			
			if(rs.next()) {
				
				//Resgata os dados do telefone
				Telefone tel = new Telefone();
				tel.setDdd(rs.getString("ddd"));
				tel.setTelefone(rs.getString("telefone"));
				tel.setTipo(TipoTelefone.valueOf(rs.getString("tipo")));				
				
				//Resgata os dados do Endereço
				Endereco end = new Endereco();
				end.setRua(rs.getString("rua"));
				end.setNumero(rs.getString("numero"));
				end.setBairro(rs.getString("bairro"));
				end.setComplemento(rs.getString("complemento"));
				end.setCidade(rs.getString("cidade"));
				end.setSigla_estado(SiglaEstado.valueOf(rs.getString("sigla_estado")));
				
				//Resgata os dados do Cliente
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setSobrenome(rs.getString("sobrenome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEmail(rs.getString("email"));
				cliente.setEndereco(end);
				cliente.setTelefone(tel);
				
				return cliente;
			}
			
			return null;
		} 
		catch (SQLException e) {
			throw new DBException(e.getMessage());
		}
		finally {
			Conexao.fechaStatement(st);
			Conexao.fechaResultSet(rs);
		}		
	}

	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
