package to;

import java.sql.ResultSet;
import java.util.Date;

public class TOOrientador {
	private int id;
	private Date dataCadastro;
	private String tipo;
	private String nome;
	private int telefone;
	private int celular;
	private int contato;
	private String email;
	private String setor;
	private String atuacao;
	private String disponibilidade;
	private int cpf;
	private String rg;
	private String mae;
	private int ctps;
	private int pis;
	private String banco;
	private int agencia;
	private int digAgencia;
	private int conta;
	private int digConta;
	private Date nascimento;
	
	public TOOrientador() {
	}
	public TOOrientador(ResultSet rs) throws Exception {
		this.id= rs.getInt("id");
		this.dataCadastro = rs.getDate("dataCadastro");
		this.tipo = rs.getString("tipo");
		this.nome = rs.getString("nome");
		this.telefone = rs.getInt("telefone");
		this.celular = rs.getInt("celular");
		this.contato = rs.getInt("contato");
		this.email = rs.getString("email");
		this.setor = rs.getString("setor");
		this.atuacao = rs.getString("atuacao");
		this.disponibilidade = rs.getString("disponibilidade");
		this.cpf = rs.getInt("cpf");
		this.rg = rs.getString("rg");
		this.mae = rs.getString("mae");
		this.ctps = rs.getInt("ctps");
		this.pis = rs.getInt("pis");
		this.banco = rs.getString("banco");
		this.agencia = rs.getInt("agencia");
		this.digAgencia = rs.getInt("digAgencia");
		this.conta = rs.getInt("conta");
		this.digConta = rs.getInt("digConta");
		this.nascimento = rs.getDate("nascimento");	
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}
	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the celular
	 */
	public int getCelular() {
		return celular;
	}
	/**
	 * @param celular the celular to set
	 */
	public void setCelular(int celular) {
		this.celular = celular;
	}
	/**
	 * @return the contato
	 */
	public int getContato() {
		return contato;
	}
	/**
	 * @param contato the contato to set
	 */
	public void setContato(int contato) {
		this.contato = contato;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the setor
	 */
	public String getSetor() {
		return setor;
	}
	/**
	 * @param setor the setor to set
	 */
	public void setSetor(String setor) {
		this.setor = setor;
	}
	/**
	 * @return the atuacao
	 */
	public String getAtuacao() {
		return atuacao;
	}
	/**
	 * @param atuacao the atuacao to set
	 */
	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}
	/**
	 * @return the disponibilidade
	 */
	public String getDisponibilidade() {
		return disponibilidade;
	}
	/**
	 * @param disponibilidade the disponibilidade to set
	 */
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	/**
	 * @return the cpf
	 */
	public int getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the mae
	 */
	public String getMae() {
		return mae;
	}
	/**
	 * @param mae the mae to set
	 */
	public void setMae(String mae) {
		this.mae = mae;
	}
	/**
	 * @return the ctps
	 */
	public int getCtps() {
		return ctps;
	}
	/**
	 * @param ctps the ctps to set
	 */
	public void setCtps(int ctps) {
		this.ctps = ctps;
	}
	/**
	 * @return the pis
	 */
	public int getPis() {
		return pis;
	}
	/**
	 * @param pis the pis to set
	 */
	public void setPis(int pis) {
		this.pis = pis;
	}
	/**
	 * @return the banco
	 */
	public String getBanco() {
		return banco;
	}
	/**
	 * @param banco the banco to set
	 */
	public void setBanco(String banco) {
		this.banco = banco;
	}
	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	/**
	 * @return the digAgencia
	 */
	public int getDigAgencia() {
		return digAgencia;
	}
	/**
	 * @param digAgencia the digAgencia to set
	 */
	public void setDigAgencia(int digAgencia) {
		this.digAgencia = digAgencia;
	}
	/**
	 * @return the conta
	 */
	public int getConta() {
		return conta;
	}
	/**
	 * @param conta the conta to set
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}
	/**
	 * @return the digConta
	 */
	public int getDigConta() {
		return digConta;
	}
	/**
	 * @param digConta the digConta to set
	 */
	public void setDigConta(int digConta) {
		this.digConta = digConta;
	}
	/**
	 * @return the nascimento
	 */
	public Date getNascimento() {
		return nascimento;
	}
	/**
	 * @param nascimento the nascimento to set
	 */
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
}
