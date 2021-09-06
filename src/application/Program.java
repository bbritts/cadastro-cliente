package application;

import model.dao.ClienteDao;
import model.dao.DaoFabrica;
import model.domain.Cliente;

public class Program {

	public static void main(String[] args) {		
		
		ClienteDao clienteDao = DaoFabrica.criaClienteDao();
		
		System.out.println("------ Achando cliente por ID ------");
		
		Cliente c1 = clienteDao.buscarPorId(2);
		
		System.out.println(c1);
	}
}
