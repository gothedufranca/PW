package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import fw.Data;
import to.TOCampeonato;

public class DAOCampeonato {

    public static void inserir(Connection c, TOCampeonato campeonato) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" insert into campeonato (");
        query.append(" nome) ");
        query.append(" values(?)");
        Data.executeUpdate(c, query.toString(), campeonato.getNome());
    }

    public static void alterar(Connection c, TOCampeonato campeonato) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" update campeonato set ");
        query.append(" nome = ? ");
        query.append(" where id = ? ");
        Data.executeUpdate(c, query.toString(), campeonato.getNome(), campeonato.getId());
    }

    public static void excluir(Connection c, int id) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" delete from campeonato ");
        query.append(" where id = ? ");
        Data.executeUpdate(c, query.toString(), id);
    }

    public static TOCampeonato obter(Connection c, int id) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" select id, nome ");
        query.append(" from campeonato ");
        query.append(" where id = ? ");
        try (ResultSet rs = Data.executeQuery(c, query.toString(), id)) {
            if (rs.next()) {
                return new TOCampeonato(rs);
            } else {
                return null;
            }
        }
    }

    public static List<TOCampeonato> lista(Connection c) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" select id, nome ");
        query.append(" from campeonato ");
        query.append(" order by nome ");
        List<TOCampeonato> lista = new ArrayList<>();
        try (ResultSet rs = Data.executeQuery(c, query.toString())) {
            while (rs.next()) {
                lista.add(new TOCampeonato(rs));
            }
        }
        return lista;
    }

    public static List<TOCampeonato> lista(Connection c, String filtro) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" select id, nome ");
        query.append(" from campeonato ");
        query.append(" where nome like concat(concat('%', ?), '%') ");
        query.append(" order by nome ");
        List<TOCampeonato> lista = new ArrayList<>();
        try (ResultSet rs = Data.executeQuery(c, query.toString(), filtro)) {
            while (rs.next()) {
                lista.add(new TOCampeonato(rs));
            }
        }
        return lista;
    }
}
