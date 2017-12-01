package bo;

import java.sql.Connection;
import java.util.List;
import dao.DAOOrientador;
import fw.Data;
import to.TOOrientador;

public class BOOrientador {
	public static void inserir (TOOrientador orientador) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOOrientador.inserir(c, orientador);
		}
	}
	public static void alterar (TOOrientador orientador) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOOrientador.alterar(c, orientador);
		}
	}
	public static void excluir (int id) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOOrientador.excluir(c, id);
		}
	}
	public static TOOrientador obter(int id) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOOrientador.obter(c, id);
		}
	}
	public static List<TOOrientador> lista() throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOOrientador.lista(c);
		}
	}
	public static List<TOOrientador> lista(String filtro) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOOrientador.lista(c, filtro);
		}
	}
}
