package bo;

import java.sql.Connection;
import java.util.List;
import dao.DAOTipoOrientador;
import fw.Data;
import to.TOTipoOrientador;

public class BOTipoOrientador {
	public static void inserir (TOTipoOrientador tipoOrientador) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOTipoOrientador.inserir(c, tipoOrientador);
		}
	}
	public static void alterar (TOTipoOrientador tipoOrientador) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOTipoOrientador.alterar(c, tipoOrientador);
		}
	}
	public static void excluir (int id) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOTipoOrientador.excluir(c, id);
		}
	}
	public static TOTipoOrientador obter(int id) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOTipoOrientador.obter(c, id);
		}
	}
	public static List<TOTipoOrientador> lista(String filtro) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOTipoOrientador.lista(c, filtro);
		}
	}
}
