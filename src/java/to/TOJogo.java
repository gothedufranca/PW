package to;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Time;

public class TOJogo {
	private int id;
	private int dia;
        private int mes;
        private int ano;
	private int hora;
        private int minuto;
	private String campeonato;
	private String time1;
	private String time2;
	
	public TOJogo() {
	}
	public TOJogo(ResultSet rs) throws Exception {
		this.id = rs.getInt("id");
		this.dia = rs.getInt("dia");
                this.mes = rs.getInt("mes");
                this.ano = rs.getInt("ano");
		this.hora = rs.getInt("hora");
                this.minuto = rs.getInt("minuto");
		this.campeonato = rs.getString("campeonato");
		this.time1 = rs.getString("time1");
		this.time2 = rs.getString("time2");
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }
}
