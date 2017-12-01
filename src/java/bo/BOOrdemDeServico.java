package bo;

import java.sql.Connection;
import java.util.List;
import dao.DAOOrdemDeServico;
import fw.Data;
import to.TOOrdemDeServico;

public class BOOrdemDeServico {
	public static void inserir (TOOrdemDeServico os) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOOrdemDeServico.inserir(c, os);
		}
	}
	public static void alterar (TOOrdemDeServico os) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOOrdemDeServico.alterar(c, os);
		}
	}
	public static void excluir (int id) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOOrdemDeServico.excluir(c, id);
		}
	}
	public static TOOrdemDeServico obter(int id) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOOrdemDeServico.obter(c, id);
		}
	}
	public static List<TOOrdemDeServico> lista() throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOOrdemDeServico.lista(c);
		}
	}
	public static List<TOOrdemDeServico> lista(String filtro) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOOrdemDeServico.lista(c, filtro);
		}
	}
}
