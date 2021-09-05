package domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private List<Endereco> enderecos;
	private List<Telefone> telefones;
	
	//Construtor
	public Cliente(int id, String nome, String sobrenome, String cpf, 
			String email) {
		
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.email = email;
		this.enderecos = new ArrayList<>();
		this.telefones = new ArrayList<>();
	}
	
	//Getters e Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", sobrenome=" 
				+ sobrenome + ", cpf=" + cpf + ", email=" + email
				+ ", enderecos=" + enderecos + ", telefones=" + telefones + "]";
	}	

}
