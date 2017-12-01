package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import fw.Data;
import to.TOFornecedor;

public class DAOFornecedor {
	public static void inserir(Connection c, TOFornecedor fornecedor) throws Exception{
		StringBuilder query = new StringBuilder();
		query.append(" insert into fornecedor ( ");
		query.append(" nome, identificador, cpf, rg, mae, convocacao) ");
		query.append(" values(?, ?, ?, ?, ?, ?) ");
		Data.executeUpdate(c, query.toString(), fornecedor.getNome(), fornecedor.getIdentificador(),
				fornecedor.getCpf(), fornecedor.getRg(), fornecedor.getMae(),
				fornecedor.getConvocacao());
	}
	public static void alterar(Connection c, TOFornecedor fornecedor) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" update fornecedor set ");
		query.append(" nome = ?, identificador = ?, cpf = ?,");
		query.append(" rg = ?, mae = ?, convocacao = ? "); 
		query.append(" where id = ? ");
		Data.executeUpdate(c, query.toString(), fornecedor.getNome(), fornecedor.getIdentificador(),
				fornecedor.getCpf(), fornecedor.getRg(), fornecedor.getMae(),
				fornecedor.getConvocacao(), fornecedor.getId());
	}
	public static void excluir(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" delete from fornecedor ");
		query.append(" where id = ? ");
                query.append(" order by id ");
		Data.executeUpdate(c, query.toString(), id);
	}
	public static TOFornecedor obter(Connection c, int id) throws Exception {
            StringBuilder query = new StringBuilder();
            query.append(" select id, nome, identificador, cpf, rg, mae, convocacao ");
            query.append(" from fornecedor ");
            query.append(" where id = ? ");
            try (ResultSet rs = Data.executeQuery(c, query.toString(), id)) {
                if (rs.next()) {
                    return new TOFornecedor(rs);
                } else {
                    return null;
                }
            }
	}
	
        public static List<TOFornecedor> lista (Connection c) throws Exception {
            StringBuilder query = new StringBuilder();
            query.append(" select id, nome, identificador, cpf, rg, mae, convocacao ");
            query.append(" from fornecedor ");
            query.append(" order by nome ");
            List<TOFornecedor> lista = new ArrayList<>();
            try (ResultSet rs = Data.executeQuery(c, query.toString())) {
                while (rs.next()) {
                    lista.add(new TOFornecedor(rs));
                }
            }
                return lista;
        }
	public static List<TOFornecedor> lista (Connection c, String filtro) throws Exception {
            StringBuilder query = new StringBuilder();
            query.append(" select id, nome, identificador, cpf, rg, mae, convocacao ");
            query.append(" from fornecedor ");
            query.append(" where nome like concat(concat('%', ?), '%') ");
            query.append(" order by nome ");
            List<TOFornecedor> lista = new ArrayList<>();
            try (ResultSet rs = Data.executeQuery(c, query.toString(), filtro)) {
                while (rs.next()) {
                    lista.add(new TOFornecedor(rs));
                }
            }
                return lista;
        }
}
