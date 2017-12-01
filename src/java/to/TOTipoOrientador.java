package to;

import java.sql.ResultSet;

public class TOTipoOrientador {
	private int id;
	private String tipo;
	
	public TOTipoOrientador() {
	}
	public TOTipoOrientador(ResultSet rs) throws Exception {
		this.id = rs.getInt("id");
		this.tipo = rs.getString("tipo");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
