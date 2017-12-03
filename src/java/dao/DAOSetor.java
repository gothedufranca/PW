package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import fw.Data;
import to.TOSetor;

public class DAOSetor {
	public static void inserir(Connection c, TOSetor setor) throws Exception{
		StringBuilder query = new StringBuilder();
		query.append(" insert into setor ( ");
		query.append(" nome) ");
		query.append(" values(?)");
		Data.executeUpdate(c, query.toString(), setor.getNome());
	}
	public static void alterar(Connection c, TOSetor setor) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" update setor set ");
		query.append(" nome = ? "); 
		query.append(" where id = ? ");
		Data.executeUpdate(c, query.toString(), setor.getNome(), setor.getId());
	}
	public static void excluir(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" delete from setor ");
		query.append(" where id = ? ");
		Data.executeUpdate(c, query.toString(), id);
	}
	public static TOSetor obter(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, nome ");
		query.append(" from setor ");
		query.append(" where id = ? ");
		try (ResultSet rs = Data.executeQuery(c, query.toString(), id)) {
            if (rs.next()) {
                return new TOSetor(rs);
            } else {
                return null;
            }
        }
	}
	public static List<TOSetor> lista (Connection c) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, nome ");
		query.append(" from setor ");
		query.append(" order by nome ");
		List<TOSetor> lista = new ArrayList<>();
		try (ResultSet rs = Data.executeQuery(c, query.toString())) {
            while (rs.next()) {
                lista.add(new TOSetor(rs));
            }
        }
		return lista;
	}
	public static List<TOSetor> lista (Connection c, String filtro) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, nome ");
		query.append(" from setor ");
		query.append(" where nome like concat(concat('%', ?), '%') ");
		query.append(" order by nome ");
		List<TOSetor> lista = new ArrayList<>();
		try (ResultSet rs = Data.executeQuery(c, query.toString(), filtro)) {
            while (rs.next()) {
                lista.add(new TOSetor(rs));
            }
        }
		return lista;
	}
}
