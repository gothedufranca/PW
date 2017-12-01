package bo;

import java.sql.Connection;
import java.util.List;
import dao.DAOCampeonato;
import fw.Data;
import to.TOCampeonato;

public class BOCampeonato {
	public static void inserir (TOCampeonato campeonato) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOCampeonato.inserir(c, campeonato);
		}
	}
	public static void alterar (TOCampeonato campeonato) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOCampeonato.alterar(c, campeonato);
		}
	}
	public static void excluir (int id) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOCampeonato.excluir(c, id);
		}
	}
	public static TOCampeonato obter(int id) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOCampeonato.obter(c, id);
		}
	}
	public static List<TOCampeonato> lista(String filtro) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOCampeonato.lista(c, filtro);
		}
	}
	public static List<TOCampeonato> lista() throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOCampeonato.lista(c);
		}
	}
}
