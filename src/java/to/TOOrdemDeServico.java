package to;

import java.sql.Date;
import java.sql.ResultSet;

public class TOOrdemDeServico {
	private int id;
	private String evento;
	private String time1;
	private String time2;
	private String classificacao;
	private Date data;
	private Date aberturaPortoes;
	private Date aberturaEsplanadaEstacionamento;
	private Date inicio;
	private Date fim;
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
		this.data = rs.getDate("data");
		this.aberturaPortoes = rs.getDate("aberturaPortoes");
		this.aberturaEsplanadaEstacionamento = rs.getDate("aberturaEsplanadaEstacionamento");
		this.inicio = rs.getDate("inicio");
		this.fim = rs.getDate("fim");
		this.arquibancadaSuperiorNorte = rs.getInt("arquibancadaSuperiorNorte");
		this.arquibancadaInferiorNorte = rs.getInt("arquibancadaInferiorNorte");
		this.arquibancadaSuperiorSul = rs.getInt("arquibancadaSuperiorSul");
		this.arquibancadaInferiorSul = rs.getInt("arquibancadaInferiorSul");
		this.arquibancadaSuperiorOeste = rs.getInt("arquibancadaSuperiorOeste");
		this.cadeirasEspeciaisOeste = rs.getInt("cadeirasEspeciaisOeste");
		this.arquibancadaSuperiorLeste = rs.getInt("arquibancadaSuperiorLeste");
		this.cadeirasEspeciaisLeste = rs.getInt("cadeirasEspeciaisLeste");
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
	 * @return the evento
	 */
	public String getEvento() {
		return evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(String evento) {
		this.evento = evento;
	}

	/**
	 * @return the time1
	 */
	public String getTime1() {
		return time1;
	}

	/**
	 * @param time1 the time1 to set
	 */
	public void setTime1(String time1) {
		this.time1 = time1;
	}

	/**
	 * @return the time2
	 */
	public String getTime2() {
		return time2;
	}

	/**
	 * @param time2 the time2 to set
	 */
	public void setTime2(String time2) {
		this.time2 = time2;
	}

	/**
	 * @return the classificacao
	 */
	public String getClassificacao() {
		return classificacao;
	}

	/**
	 * @param classificacao the classificacao to set
	 */
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the aberturaPortoes
	 */
	public Date getAberturaPortoes() {
		return aberturaPortoes;
	}

	/**
	 * @param aberturaPortoes the aberturaPortoes to set
	 */
	public void setAberturaPortoes(Date aberturaPortoes) {
		this.aberturaPortoes = aberturaPortoes;
	}

	/**
	 * @return the aberturaEsplanadaEstacionamento
	 */
	public Date getAberturaEsplanadaEstacionamento() {
		return aberturaEsplanadaEstacionamento;
	}

	/**
	 * @param aberturaEsplanadaEstacionamento the aberturaEsplanadaEstacionamento to set
	 */
	public void setAberturaEsplanadaEstacionamento(Date aberturaEsplanadaEstacionamento) {
		this.aberturaEsplanadaEstacionamento = aberturaEsplanadaEstacionamento;
	}

	/**
	 * @return the inicio
	 */
	public Date getInicio() {
		return inicio;
	}

	/**
	 * @param inicio the inicio to set
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	/**
	 * @return the fim
	 */
	public Date getFim() {
		return fim;
	}

	/**
	 * @param fim the fim to set
	 */
	public void setFim(Date fim) {
		this.fim = fim;
	}

	/**
	 * @return the arquibancadaSuperiorNorte
	 */
	public int getArquibancadaSuperiorNorte() {
		return arquibancadaSuperiorNorte;
	}

	/**
	 * @param arquibancadaSuperiorNorte the arquibancadaSuperiorNorte to set
	 */
	public void setArquibancadaSuperiorNorte(int arquibancadaSuperiorNorte) {
		this.arquibancadaSuperiorNorte = arquibancadaSuperiorNorte;
	}

	/**
	 * @return the arquibancadaInferiorNorte
	 */
	public int getArquibancadaInferiorNorte() {
		return arquibancadaInferiorNorte;
	}

	/**
	 * @param arquibancadaInferiorNorte the arquibancadaInferiorNorte to set
	 */
	public void setArquibancadaInferiorNorte(int arquibancadaInferiorNorte) {
		this.arquibancadaInferiorNorte = arquibancadaInferiorNorte;
	}

	/**
	 * @return the arquibancadaSuperiorSul
	 */
	public int getArquibancadaSuperiorSul() {
		return arquibancadaSuperiorSul;
	}

	/**
	 * @param arquibancadaSuperiorSul the arquibancadaSuperiorSul to set
	 */
	public void setArquibancadaSuperiorSul(int arquibancadaSuperiorSul) {
		this.arquibancadaSuperiorSul = arquibancadaSuperiorSul;
	}

	/**
	 * @return the arquibancadaInferiorSul
	 */
	public int getArquibancadaInferiorSul() {
		return arquibancadaInferiorSul;
	}

	/**
	 * @param arquibancadaInferiorSul the arquibancadaInferiorSul to set
	 */
	public void setArquibancadaInferiorSul(int arquibancadaInferiorSul) {
		this.arquibancadaInferiorSul = arquibancadaInferiorSul;
	}

	/**
	 * @return the arquibancadaSuperiorOeste
	 */
	public int getArquibancadaSuperiorOeste() {
		return arquibancadaSuperiorOeste;
	}

	/**
	 * @param arquibancadaSuperiorOeste the arquibancadaSuperiorOeste to set
	 */
	public void setArquibancadaSuperiorOeste(int arquibancadaSuperiorOeste) {
		this.arquibancadaSuperiorOeste = arquibancadaSuperiorOeste;
	}

	/**
	 * @return the cadeirasEspeciaisOeste
	 */
	public int getCadeirasEspeciaisOeste() {
		return cadeirasEspeciaisOeste;
	}

	/**
	 * @param cadeirasEspeciaisOeste the cadeirasEspeciaisOeste to set
	 */
	public void setCadeirasEspeciaisOeste(int cadeirasEspeciaisOeste) {
		this.cadeirasEspeciaisOeste = cadeirasEspeciaisOeste;
	}

	/**
	 * @return the arquibancadaSuperiorLeste
	 */
	public int getArquibancadaSuperiorLeste() {
		return arquibancadaSuperiorLeste;
	}

	/**
	 * @param arquibancadaSuperiorLeste the arquibancadaSuperiorLeste to set
	 */
	public void setArquibancadaSuperiorLeste(int arquibancadaSuperiorLeste) {
		this.arquibancadaSuperiorLeste = arquibancadaSuperiorLeste;
	}

	/**
	 * @return the cadeirasEspeciaisLeste
	 */
	public int getCadeirasEspeciaisLeste() {
		return cadeirasEspeciaisLeste;
	}

	/**
	 * @param cadeirasEspeciaisLeste the cadeirasEspeciaisLeste to set
	 */
	public void setCadeirasEspeciaisLeste(int cadeirasEspeciaisLeste) {
		this.cadeirasEspeciaisLeste = cadeirasEspeciaisLeste;
	}	
}
