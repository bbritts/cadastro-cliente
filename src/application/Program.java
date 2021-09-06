package application;

import java.util.List;

import model.dao.ClienteDao;
import model.dao.DaoFabrica;
import model.domain.Cliente;

public class Program {

	public static void main(String[] args) {		
		
		ClienteDao clienteDao = DaoFabrica.criaClienteDao();
		
		System.out.println("------ Achando cliente por ID ------");
		
		Cliente c1 = clienteDao.buscarPorId(2);
		
		System.out.println(c1);
		
		System.out.println("------- Achando todos os clientes do banco -----------");
		
		List<Cliente> lista = clienteDao.listarTodos();
		
		//foreach
		for (Cliente obj : lista) {
			System.out.println(obj);
		}		
	}
}
