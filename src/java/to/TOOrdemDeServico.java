package to;

import java.sql.Date;
import java.sql.ResultSet;

public class TOOrdemDeServico {
	private int id;
	private String evento;
	private String time1;
	private String time2;
	private String classificacao;
	private int dia;
        private int mes;
        private int ano;
        private int aberturaPortoesH;
        private int aberturaPortoesM;
        private int aberturaEstacionamentoH;
        private int aberturaEstacionamentoM;
        private int inicioh;
        private int iniciom;
        private int fimh;
        private int fimm;
	private int arquibancadaSuperiorNorte;
	private int arquibancadaInferiorNorte;
	private int arquibancadaSuperiorSul;
	private int arquibancadaInferiorSul;
	private int arquibancadaSuperiorOeste;
	private int cadeirasEspeciaisOeste;
	private int arquibancadaSuperiorLeste;
	private int cadeirasEspeciaisLeste;

	public TOOrdemDeServico() {
	}

    public TOOrdemDeServico(ResultSet rs) throws Exception {
        this.id = rs.getInt("id");
        this.evento = rs.getString("evento");
        this.time1 = rs.getString("time1");
        this.time2 = rs.getString("time2");
        this.classificacao = rs.getString("classificacao");
        this.dia = rs.getInt("dia");
        this.mes = rs.getInt("mes");
        this.ano = rs.getInt("ano");
        this.aberturaPortoesH = rs.getInt("aberturaPortoesH");
        this.aberturaPortoesM = rs.getInt("aberturaPortoesM");
        this.inicioh = rs.getInt("inicioh");
        this.iniciom = rs.getInt("iniciom");
        this.fimh = rs.getInt("fimh");
        this.fimm = rs.getInt("fimm");
        this.arquibancadaSuperiorNorte = rs.getInt("arquibancadaSuperiorNorte");
        this.arquibancadaInferiorNorte = rs.getInt("arquibancadaInferiorNorte");
        this.arquibancadaSuperiorSul = rs.getInt("arquibancadaSuperiorSul");
        this.arquibancadaInferiorSul = rs.getInt("arquibancadaInferiorSul");
        this.arquibancadaSuperiorOeste = rs.getInt("arquibancadaSuperiorOeste");
        this.cadeirasEspeciaisOeste = rs.getInt("cadeirasEspeciaisOeste");
        this.arquibancadaSuperiorLeste = rs.getInt("arquibancadaSuperiorLeste");
        this.cadeirasEspeciaisLeste = rs.getInt("cadeirasEspeciaisLeste");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
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

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
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

    public int getAberturaPortoesH() {
        return aberturaPortoesH;
    }

    public void setAberturaPortoesH(int aberturaPortoesH) {
        this.aberturaPortoesH = aberturaPortoesH;
    }

    public int getAberturaPortoesM() {
        return aberturaPortoesM;
    }

    public void setAberturaPortoesM(int aberturaPortoesM) {
        this.aberturaPortoesM = aberturaPortoesM;
    }

    public int getAberturaEstacionamentoH() {
        return aberturaEstacionamentoH;
    }

    public void setAberturaEstacionamentoH(int aberturaPortoesH) {
        this.aberturaEstacionamentoH = aberturaEstacionamentoH;
    }

    public int getAberturaEstacionamentoM() {
        return aberturaEstacionamentoM;
    }

    public void setAberturaEstacionamentoM(int aberturaPortoesM) {
        this.aberturaEstacionamentoM = aberturaEstacionamentoM;
    }

    public int getInicioh() {
        return inicioh;
    }

    public void setInicioh(int inicioh) {
        this.inicioh = inicioh;
    }

    public int getIniciom() {
        return iniciom;
    }

    public void setIniciom(int iniciom) {
        this.iniciom = iniciom;
    }

    public int getFimh() {
        return fimh;
    }

    public void setFimh(int fimh) {
        this.fimh = fimh;
    }

    public int getFimm() {
        return fimm;
    }

    public void setFimm(int fimm) {
        this.fimm = fimm;
    }

    public int getArquibancadaSuperiorNorte() {
        return arquibancadaSuperiorNorte;
    }

    public void setArquibancadaSuperiorNorte(int arquibancadaSuperiorNorte) {
        this.arquibancadaSuperiorNorte = arquibancadaSuperiorNorte;
    }

    public int getArquibancadaInferiorNorte() {
        return arquibancadaInferiorNorte;
    }

    public void setArquibancadaInferiorNorte(int arquibancadaInferiorNorte) {
        this.arquibancadaInferiorNorte = arquibancadaInferiorNorte;
    }

    public int getArquibancadaSuperiorSul() {
        return arquibancadaSuperiorSul;
    }

    public void setArquibancadaSuperiorSul(int arquibancadaSuperiorSul) {
        this.arquibancadaSuperiorSul = arquibancadaSuperiorSul;
    }

    public int getArquibancadaInferiorSul() {
        return arquibancadaInferiorSul;
    }

    public void setArquibancadaInferiorSul(int arquibancadaInferiorSul) {
        this.arquibancadaInferiorSul = arquibancadaInferiorSul;
    }

    public int getArquibancadaSuperiorOeste() {
        return arquibancadaSuperiorOeste;
    }

    public void setArquibancadaSuperiorOeste(int arquibancadaSuperiorOeste) {
        this.arquibancadaSuperiorOeste = arquibancadaSuperiorOeste;
    }

    public int getCadeirasEspeciaisOeste() {
        return cadeirasEspeciaisOeste;
    }

    public void setCadeirasEspeciaisOeste(int cadeirasEspeciaisOeste) {
        this.cadeirasEspeciaisOeste = cadeirasEspeciaisOeste;
    }

    public int getArquibancadaSuperiorLeste() {
        return arquibancadaSuperiorLeste;
    }

    public void setArquibancadaSuperiorLeste(int arquibancadaSuperiorLeste) {
        this.arquibancadaSuperiorLeste = arquibancadaSuperiorLeste;
    }

    public int getCadeirasEspeciaisLeste() {
        return cadeirasEspeciaisLeste;
    }

    public void setCadeirasEspeciaisLeste(int cadeirasEspeciaisLeste) {
        this.cadeirasEspeciaisLeste = cadeirasEspeciaisLeste;
    }
    	        
}
