package to;

import java.sql.ResultSet;

public class TOCampeonato {
	private int id;
	private String nome;
	
	public TOCampeonato() {
	}
	public TOCampeonato(ResultSet rs) throws Exception {
		this.id = rs.getInt("id");
		this.nome = rs.getString("nome");
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
}
