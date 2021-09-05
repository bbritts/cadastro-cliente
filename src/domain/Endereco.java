package domain;

import domain.enums.SiglaEstado;

public class Endereco {
	
	//Atributos
	
	private String rua;
	private String numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private SiglaEstado sigla_estado;
	
	//Construtor
	
	public Endereco(String rua, String numero, String bairro, 
			String complemento, String cidade, SiglaEstado sigla_estado) {
		
		setRua(rua);
		setNumero(numero);
		setBairro(bairro);
		setComplemento(complemento);
		setCidade(cidade);
		setSigla_estado(sigla_estado);
	}
	
	//Getters e Setters

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public SiglaEstado getSigla_estado() {
		return sigla_estado;
	}

	public void setSigla_estado(SiglaEstado sigla_estado) {
		this.sigla_estado = sigla_estado;
	}	

}
