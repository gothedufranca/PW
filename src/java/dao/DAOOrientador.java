package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import fw.Data;
import to.TOOrientador;

public class DAOOrientador {
	public static void inserir(Connection c, TOOrientador orientador) throws Exception{
		StringBuilder query = new StringBuilder();
		query.append(" insert into orientador (");
		query.append(" dataCadastro, tipo, nome, telefone, celular, contato, email, setor, ");
		query.append(" atuacao, disponibilidade, cpf, rg, mae, ctps, pis, banco, ");
		query.append(" agencia, digAgencia, conta, digConta, nascimento) ");
		query.append(" values(now(), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		Data.executeUpdate(c, query.toString(), orientador.getTipo(), orientador.getNome(),
				orientador.getTelefone(), orientador.getCelular(), orientador.getContato(), orientador.getEmail(), 
				orientador.getSetor(), orientador.getAtuacao(), orientador.getDisponibilidade(), orientador.getCpf(), 
				orientador.getRg(), orientador.getMae(), orientador.getCtps(), orientador.getPis(), 
				orientador.getBanco(), orientador.getAgencia(), orientador.getDigAgencia(), 
				orientador.getConta(), orientador.getDigConta(), orientador.getNascimento());
	}
	public static void alterar(Connection c, TOOrientador orientador) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" update orientador set ");
		query.append(" tipo = ?, nome = ?, telefone = ?, celular = ?, contato = ?, email = ?, setor = ?, "); 
		query.append(" atuacao = ?, disponibilidade = ?, cpf = ?, rg = ?, mae = ?, ctps = ?, pis = ?, banco = ?, "); 
		query.append(" agencia = ?, digAgencia = ?, conta = ?, digConta = ?, nascimento = ? "); 
		query.append(" where id = ?");
		Data.executeUpdate(c, query.toString(), orientador.getTipo(), orientador.getNome(),
				orientador.getTelefone(), orientador.getCelular(), orientador.getContato(), orientador.getEmail(), 
				orientador.getSetor(), orientador.getAtuacao(), orientador.getDisponibilidade(), orientador.getCpf(), 
				orientador.getRg(), orientador.getMae(), orientador.getCtps(), orientador.getPis(), 
				orientador.getBanco(), orientador.getAgencia(), orientador.getDigAgencia(), 
				orientador.getConta(), orientador.getDigConta(), orientador.getNascimento(),
				orientador.getId());
	}
	public static void excluir(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" delete from orientador ");
		query.append(" where id = ? ");
		Data.executeUpdate(c, query.toString(), id);
	}
	public static TOOrientador obter(Connection c, int id) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, dataCadastro, tipo, nome, telefone, celular, contato, email, setor, ");
		query.append(" atuacao, disponibilidade, cpf, rg, mae, ctps, pis, banco, "); 
		query.append(" agencia, digAgencia, conta, digConta, nascimento ");
		query.append(" from orientador ");
		query.append(" where id = ? ");
		try (ResultSet rs = Data.executeQuery(c, query.toString(), id)) {
            if (rs.next()) {
                return new TOOrientador(rs);
            } else {
                return null;
            }
        }
	}
	public static List<TOOrientador> lista (Connection c) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, dataCadastro, tipo, nome, telefone, celular, contato, email, setor, ");
		query.append(" atuacao, disponibilidade, cpf, rg, mae, ctps, pis, banco, "); 
		query.append(" agencia, digAgencia, conta, digConta, nascimento ");
		query.append(" from orientador ");
		query.append(" where nome like concat(concat('%', ?), '%') ");
		query.append(" order by nome ");
		List<TOOrientador> lista = new ArrayList<>();
		try (ResultSet rs = Data.executeQuery(c, query.toString())) {
            while (rs.next()) {
                lista.add(new TOOrientador(rs));
            }
        }
		return lista;
	}
	public static List<TOOrientador> lista (Connection c, String filtro) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append(" select id, dataCadastro, tipo, nome, telefone, celular, contato, email, setor, ");
		query.append(" atuacao, disponibilidade, cpf, rg, mae, ctps, pis, banco, "); 
		query.append(" agencia, digAgencia, conta, digConta, nascimento ");
		query.append(" from orientador ");
		query.append(" where nome like concat(concat('%', ?), '%') ");
		query.append(" order by nome ");
		List<TOOrientador> lista = new ArrayList<>();
		try (ResultSet rs = Data.executeQuery(c, query.toString(), filtro)) {
            while (rs.next()) {
                lista.add(new TOOrientador(rs));
            }
        }
		return lista;
	}
}
