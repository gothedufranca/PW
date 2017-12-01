package bo;

import java.sql.Connection;
import java.util.List;
import dao.DAOSetor;
import fw.Data;
import to.TOSetor;

public class BOSetor {
	public static void inserir (TOSetor setor) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOSetor.inserir(c, setor);
		}
	}
	public static void alterar (TOSetor setor) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOSetor.alterar(c, setor);
		}
	}
	public static void excluir (int id) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOSetor.excluir(c, id);
		}
	}
	public static TOSetor obter(int id) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOSetor.obter(c, id);
		}
	}
	public static List<TOSetor> lista() throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOSetor.lista(c);
		}
	}
        public static List<TOSetor> lista(String filtro) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOSetor.lista(c, filtro);
		}
	}
}
