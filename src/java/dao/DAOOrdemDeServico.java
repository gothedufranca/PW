package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import fw.Data;
import to.TOOrdemDeServico;

public class DAOOrdemDeServico {
	public static void inserir(Connection c, TOOrdemDeServico os) throws Exception{
		StringBuilder query = new StringBuilder();
		query.append(" insert into ordemdeservico ( ");
		query.append(" evento, time1, time2, classificacao, dia, mes, ano, inicioh, iniciom, fimh, ");
                query.append(" fimm, aberturaPortoesH, aberturaPortoesM, aberturaEstacionamentoH, ");
                query.append(" aberturaEstacionamentoM, arquibancadaSuperiorNorte, arquibancadaInferiorNorte, ");
                query.append(" arquibancadaSuperiorSul, arquibancadaInferiorSul, arquibancadaSuperiorOeste, ");
                query.append(" cadeirasEspeciaisOeste, arquibancadaSuperiorLeste, cadeirasEspeciaisLeste ");
                query.append(" values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ) ");
		Data.executeUpdate(c, query.toString(), os.getEvento(), os.getTime1(),
				os.getTime2(), os.getClassificacao(), os.getDia(), os.getMes(),
                                os.getAno(), os.getInicioh(), os.getIniciom(), os.getFimh(),
                                os.getFimm(), os.getAberturaPortoesH(), os.getAberturaPortoesM(),
                                os.getAberturaEstacionamentoH(), os.getAberturaEstacionamentoM(),
                                os.getArquibancadaSuperiorNorte(), os.getArquibancadaInferiorNorte(),
                                os.getArquibancadaSuperiorSul(), os.getArquibancadaInferiorSul(),
                                os.getArquibancadaSuperiorOeste(), os.getCadeirasEspeciaisOeste(),
                                os.getArquibancadaSuperiorLeste(), os.getCadeirasEspeciaisLeste());
	}
	public static void alterar(Connection c, TOOrdemDeServico os) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" update ordemdeservico set ");
		query.append(" evento = ?, time1 = ?, time2 = ?, classificacao = ?, dia = ?,  ");
                query.append(" mes = ?, ano = ?, inicioh = ?, iniciom = ?, fimh = ?, fimm = ?, ");
                query.append(" aberturaPortoesH = ?, aberturaPortoesM = ?, aberturaEstacionamentoH = ?, ");
                query.append(" aberturaEstacionamentoM = ?, ");
		query.append(" arquibancadaSuperiorNorte = ?, arquibancadaInferiorNorte = ?, arquibancadaSuperiorSul = ?, ");
		query.append(" arquibancadaInferiorSul = ?, arquibancadaSuperiorOeste = ?, cadeirasEspeciaisOeste = ?, ");
		query.append(" arquibancadaSuperiorLeste = ?, cadeirasEspeciaisLeste = ?");
		query.append(" where id = ? ");
		query.append("  ");
		Data.executeUpdate(c, query.toString(), os.getEvento(), os.getTime1(),
				os.getTime2(), os.getClassificacao(), os.getDia(), os.getMes(),
                                os.getAno(), os.getInicioh(), os.getIniciom(), os.getFimh(),
                                os.getFimm(), os.getAberturaPortoesH(), os.getAberturaPortoesM(),
                                os.getAberturaEstacionamentoH(), os.getAberturaEstacionamentoM(),
                                os.getArquibancadaSuperiorNorte(), os.getArquibancadaInferiorNorte(),
                                os.getArquibancadaSuperiorSul(), os.getArquibancadaInferiorSul(),
                                os.getArquibancadaSuperiorOeste(), os.getCadeirasEspeciaisOeste(),
                                os.getArquibancadaSuperiorLeste(), os.getCadeirasEspeciaisLeste(),
                                os.getId());
	}
	public static void excluir(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" delete from ordemdeservico ");
		query.append(" where id = ? ");
		Data.executeUpdate(c, query.toString(), id);
	}
	public static TOOrdemDeServico obter(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, evento, time1, time2, classificacao, dia, mes, ano, inicioh, iniciom, fimh, ");
                query.append(" fimm, aberturaPortoesH, aberturaPortoesM, aberturaEstacionamentoH, ");
                query.append(" aberturaEstacionamentoM, arquibancadaSuperiorNorte, arquibancadaInferiorNorte, ");
                query.append(" arquibancadaSuperiorSul, arquibancadaInferiorSul, arquibancadaSuperiorOeste, ");
                query.append(" cadeirasEspeciaisOeste, arquibancadaSuperiorLeste, cadeirasEspeciaisLeste ");
		query.append(" from ordemdeservico ");
		query.append(" where id = ? ");
		try (ResultSet rs = Data.executeQuery(c, query.toString(), id)) {
            if (rs.next()) {
                return new TOOrdemDeServico(rs);
            } else {
                return null;
            }
        }
	}
	public static List<TOOrdemDeServico> lista (Connection c) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, evento, time1, time2, classificacao, dia, mes, ano, inicioh, iniciom, fimh, ");
                query.append(" fimm, aberturaPortoesH, aberturaPortoesM, aberturaEstacionamentoH, ");
                query.append(" aberturaEstacionamentoM, arquibancadaSuperiorNorte, arquibancadaInferiorNorte, ");
                query.append(" arquibancadaSuperiorSul, arquibancadaInferiorSul, arquibancadaSuperiorOeste, ");
                query.append(" cadeirasEspeciaisOeste, arquibancadaSuperiorLeste, cadeirasEspeciaisLeste ");
		query.append(" from ordemdeservico ");
		query.append(" order by dia, mes, ano, inicioh, iniciom ");
		List<TOOrdemDeServico> lista = new ArrayList<>();
		try (ResultSet rs = Data.executeQuery(c, query.toString())) {
            while (rs.next()) {
                lista.add(new TOOrdemDeServico(rs));
            }
        }
		return lista;
	}
	public static List<TOOrdemDeServico> lista (Connection c, String filtro) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, evento, time1, time2, classificacao, dia, mes, ano, inicioh, iniciom, fimh, ");
                query.append(" fimm, aberturaPortoesH, aberturaPortoesM, aberturaEstacionamentoH, ");
                query.append(" aberturaEstacionamentoM, arquibancadaSuperiorNorte, arquibancadaInferiorNorte, ");
                query.append(" arquibancadaSuperiorSul, arquibancadaInferiorSul, arquibancadaSuperiorOeste, ");
                query.append(" cadeirasEspeciaisOeste, arquibancadaSuperiorLeste, cadeirasEspeciaisLeste ");
		query.append(" from ordemdeservico ");
		query.append(" where nome like concat(concat('%', ?), '%') ");
		query.append(" order by dia, mes, ano, inicioh, iniciom ");
		List<TOOrdemDeServico> lista = new ArrayList<>();
		try (ResultSet rs = Data.executeQuery(c, query.toString(), filtro)) {
            while (rs.next()) {
                lista.add(new TOOrdemDeServico(rs));
            }
        }
		return lista;
	}
}
