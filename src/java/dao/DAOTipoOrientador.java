package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import fw.Data;
import to.TOTipoOrientador;

public class DAOTipoOrientador {

    public static void inserir(Connection c, TOTipoOrientador tipoorientador) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" insert into tipoorientador ( ");
        query.append(" tipo) ");
        query.append(" values(?) ");
        Data.executeUpdate(c, query.toString(), tipoorientador.getTipo());
    }

    public static void alterar(Connection c, TOTipoOrientador tipoorientador) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" update tipoorientador set ");
        query.append(" tipo = ? ");
        query.append(" where id = ? ");
        Data.executeUpdate(c, query.toString(), tipoorientador.getTipo(), tipoorientador.getId());
    }

    public static void excluir(Connection c, int id) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" delete from tipoorientador ");
        query.append(" where id = ? ");
        Data.executeUpdate(c, query.toString(), id);
    }

    public static TOTipoOrientador obter(Connection c, int id) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" select id, tipo");
        query.append(" from tipoorientador ");
        query.append(" where id = ? ");
        try (ResultSet rs = Data.executeQuery(c, query.toString(), id)) {
            if (rs.next()) {
                return new TOTipoOrientador(rs);
            } else {
                return null;
            }
        }
    }

    public static List<TOTipoOrientador> lista(Connection c) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" select id, tipo ");
        query.append(" from tipoorientador ");
        query.append(" order by tipo ");
        List<TOTipoOrientador> lista = new ArrayList<>();
        try (ResultSet rs = Data.executeQuery(c, query.toString())) {
            while (rs.next()) {
                lista.add(new TOTipoOrientador(rs));
            }
        }
        return lista;
    }

    public static List<TOTipoOrientador> lista(Connection c, String filtro) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append(" select id, tipo ");
        query.append(" from tipoorientador ");
        query.append(" where nome like concat(concat('%', ?), '%') ");
        query.append(" order by tipo ");
        List<TOTipoOrientador> lista = new ArrayList<>();
        try (ResultSet rs = Data.executeQuery(c, query.toString(), filtro)) {
            while (rs.next()) {
                lista.add(new TOTipoOrientador(rs));
            }
        }
        return lista;
    }
}
