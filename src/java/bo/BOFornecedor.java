package bo;

import java.sql.Connection;
import java.util.List;
import dao.DAOFornecedor;
import fw.Data;
import to.TOFornecedor;

public class BOFornecedor {
	public static void inserir (TOFornecedor fornecedor) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOFornecedor.inserir(c, fornecedor);
		}
	}
	public static void alterar (TOFornecedor fornecedor) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOFornecedor.alterar(c, fornecedor);
		}
	}
	public static void excluir (int id) throws Exception {
		try(Connection c = Data.openConnection()) {
			DAOFornecedor.excluir(c, id);
		}
	}
	public static TOFornecedor obter(int id) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOFornecedor.obter(c, id);
		}
	}
	public static List<TOFornecedor> lista() throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOFornecedor.lista(c);
		}
	}
        public static List<TOFornecedor> lista(String filtro) throws Exception {
		try(Connection c = Data.openConnection()){
			return DAOFornecedor.lista(c, filtro);
		}
	}
}
