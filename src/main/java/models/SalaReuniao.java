package models;

public class SalaReuniao {

	private int id;
	private String nome;
	private int capacidade;
	private String localizacao;
	private boolean possuiProjetor;
	private boolean possuiArCondicionado;
	private int numeroCadeiras;
	private String recursosAdicionais;
	
	public SalaReuniao() {
		
	}

	public SalaReuniao(String nome, int capacidade, String localizacao, boolean possuiProjetor,
			boolean possuiArCondicionado, int numeroCadeiras, String recursosAdicionais) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.localizacao = localizacao;
		this.possuiProjetor = possuiProjetor;
		this.possuiArCondicionado = possuiArCondicionado;
		this.numeroCadeiras = numeroCadeiras;
		this.recursosAdicionais = recursosAdicionais;
	}

	public SalaReuniao(int id, String nome, int capacidade, String localizacao, boolean possuiProjetor,
			boolean possuiArCondicionado, int numeroCadeiras, String recursosAdicionais) {
		super();
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
		this.localizacao = localizacao;
		this.possuiProjetor = possuiProjetor;
		this.possuiArCondicionado = possuiArCondicionado;
		this.numeroCadeiras = numeroCadeiras;
		this.recursosAdicionais = recursosAdicionais;
	}

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

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public boolean isPossuiProjetor() {
		return possuiProjetor;
	}

	public void setPossuiProjetor(boolean possuiProjetor) {
		this.possuiProjetor = possuiProjetor;
	}

	public boolean isPossuiArCondicionado() {
		return possuiArCondicionado;
	}

	public void setPossuiArCondicionado(boolean possuiArCondicionado) {
		this.possuiArCondicionado = possuiArCondicionado;
	}

	public int getNumeroCadeiras() {
		return numeroCadeiras;
	}

	public void setNumeroCadeiras(int numeroCadeiras) {
		this.numeroCadeiras = numeroCadeiras;
	}

	public String getRecursosAdicionais() {
		return recursosAdicionais;
	}

	public void setRecursosAdicionais(String recursosAdicionais) {
		this.recursosAdicionais = recursosAdicionais;
	}
	
	
}
