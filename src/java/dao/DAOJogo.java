package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import fw.Data;
import to.TOJogo;

public class DAOJogo {
	public static void inserir(Connection c, TOJogo jogo) throws Exception{
		StringBuilder query = new StringBuilder();
		query.append(" insert into jogo ( ");
		query.append(" dia, mes, ano, hora, minuto, campeonato, time1, time2) ");
		query.append(" values(?, ?, ?, ?, ?, ?, ?, ?) ");
		Data.executeUpdate(c, query.toString(), jogo.getDia(), jogo.getMes(), jogo.getAno(),
                        jogo.getHora(), jogo.getMinuto(), jogo.getCampeonato(),
                        jogo.getTime1(), jogo.getTime2());
	}
	public static void alterar(Connection c, TOJogo jogo) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" update jogo set ");
		query.append(" dia = ?, mes = ?, ano = ?, hora = ?, minuto = ?, campeonato = ?, time1 = ?, time2 = ? "); 
		query.append(" where id = ? ");
		Data.executeUpdate(c, query.toString(), jogo.getDia(), jogo.getMes(), jogo.getAno(),
                        jogo.getHora(), jogo.getMinuto(), jogo.getCampeonato(),
                        jogo.getTime1(), jogo.getTime2(), jogo.getId());
	}
	public static void excluir(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" delete from jogo ");
		query.append(" where id = ? ");
		Data.executeUpdate(c, query.toString(), id);
	}
	public static TOJogo obter(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, dia, mes, ano, hora, minuto, campeonato, time1, time2 ");
		query.append(" from jogo ");
		query.append(" where id = ? ");
		try (ResultSet rs = Data.executeQuery(c, query.toString(), id)) {
            if (rs.next()) {
                return new TOJogo(rs);
            } else {
                return null;
            }
        }
	}
	public static List<TOJogo> lista (Connection c) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, dia, mes, ano, hora, minuto, campeonato, time1, time2 ");
		query.append(" from jogo ");
		query.append(" order by dia, mes, ano ");
		List<TOJogo> lista = new ArrayList<>();
		try (ResultSet rs = Data.executeQuery(c, query.toString())) {
            while (rs.next()) {
                lista.add(new TOJogo(rs));
            }
        }
		return lista;
	}
	public static List<TOJogo> lista (Connection c, String filtro) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, dia, mes, ano, hora, minuto, campeonato, time1, time2 ");
		query.append(" from jogo ");
		query.append(" where dia like concat(concat('%', ?), '%') ");
		query.append(" order by dia, mes, ano ");
		List<TOJogo> lista = new ArrayList<>();
		try (ResultSet rs = Data.executeQuery(c, query.toString(), filtro)) {
            while (rs.next()) {
                lista.add(new TOJogo(rs));
            }
        }
		return lista;
	}
}
