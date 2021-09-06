package application;

import model.dao.ClienteDao;
import model.dao.DaoFabrica;
import model.domain.Cliente;

public class Program {

	public static void main(String[] args) {		
		
		ClienteDao clienteDao = DaoFabrica.criaClienteDao();
		
		Cliente c1 = clienteDao.buscarPorId(1);
		
		System.out.println(c1);
	}
}
