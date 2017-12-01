package to;

import java.sql.ResultSet;

public class TOFornecedor {
	private int id;
	private String nome;
	private String identificador;
	private int cpf;
	private String rg;
	private String mae;
	private String convocacao;
	
	public TOFornecedor() {
	}
	public TOFornecedor(ResultSet rs) throws Exception {
		this.id = rs.getInt("id");
		this.nome = rs.getString("nome");
		this.identificador =rs.getString("identificador");
		this.cpf = rs.getInt("cpf");
		this.rg = rs.getString("rg");
		this.mae = rs.getString("mae");
		this.convocacao = rs.getString("convocacao");
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
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getConvocacao() {
		return convocacao;
	}
	public void setConvocacao(String convocacao) {
		this.convocacao = convocacao;
	}
}
