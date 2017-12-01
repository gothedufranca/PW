package bo;

import java.sql.Connection;
import java.util.List;
import dao.DAOJogo;
import fw.Data;
import to.TOJogo;

public class BOJogo {
	public static void inserir (TOJogo jogo) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOJogo.inserir(c, jogo);
		}
	}
	public static void alterar (TOJogo jogo) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOJogo.alterar(c, jogo);
		}
	}
	public static void excluir (int id) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOJogo.excluir(c, id);
		}
	}
	public static TOJogo obter(int id) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOJogo.obter(c, id);
		}
	}
	public static List<TOJogo> lista() throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOJogo.lista(c);
		}
	}
	public static List<TOJogo> lista(String filtro) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOJogo.lista(c, filtro);
		}
	}
}
