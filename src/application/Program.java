package application;

import java.util.List;

import model.dao.ClienteDao;
import model.dao.DaoFabrica;
import model.domain.Cliente;
import model.domain.enums.SiglaEstado;
import model.domain.enums.TipoTelefone;

public class Program {

	public static void main(String[] args) {		
		
		ClienteDao clienteDao = DaoFabrica.criaClienteDao();
		
		System.out.println("------ Achando cliente por ID ------");
		
		Cliente c1 = clienteDao.buscaPorId(2);
		
		System.out.println(c1);
		
		System.out.println("------- Achando todos os clientes do banco -----------");
		
		List<Cliente> lista = clienteDao.listarTodos();		
		
		//foreach
		for (Cliente obj : lista) {
			System.out.println(obj);
		}	
		
		System.out.println("------- Inserindo um cliente no banco -----------");
		
		Cliente clienteNovo = new Cliente(null, "Romário", "Faria", "09876543210", 
				"romario@fifa.com", "Rua dos Camelos", "890", "Jardins", null, 
				"Campo Grande", SiglaEstado.MS, "67", "98765432", TipoTelefone.CELULAR);
		
		//clienteDao.insere(clienteNovo);
		//System.out.println("Inserido com sucesso. Novo cliente: %n");
		//System.out.println(clienteNovo.getId());
		//Cliente c3 = clienteDao.buscarPorId(clienteNovo.getId());
		//System.out.println(c3);
		
		System.out.println("------- Atualizando um cliente no banco -----------");
		clienteNovo = clienteDao.buscaPorId(1);
		clienteNovo.setNome("Ronaldo");
		clienteDao.atualiza(clienteNovo);
		System.out.println("Atualização completa");
		
		System.out.println("------- Deletando um cliente no banco -----------");
		clienteDao.deletaPorId(11);
		System.out.println("Deleção completa!");	
		
	}
}
