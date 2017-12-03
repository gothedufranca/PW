/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import bo.BOTipoOrientador;
import to.TOTipoOrientador;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import to.TORetorno;


/**
 * REST Web Service
 *
 * @author usuario
 */
@Path("tipoorientador")
public class ServiceTipoOrientador {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceUsuario
     */
    public ServiceTipoOrientador() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public TOTipoOrientador salvar(TOTipoOrientador tipoorientador) throws Exception{
        BOTipoOrientador.inserir(tipoorientador);
        return tipoorientador;
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public TOTipoOrientador alterar(TOTipoOrientador tipoorientador) throws Exception {
        BOTipoOrientador.alterar(tipoorientador);
        return tipoorientador;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TOTipoOrientador> obterTipoOrientadores() throws Exception{
        return BOTipoOrientador.lista();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TOTipoOrientador obterFornecedores(@PathParam("id") int id) throws Exception{
        return BOTipoOrientador.obter(id);
    }
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TORetorno excluir(@PathParam("id") int id) throws Exception {
        TORetorno r = new TORetorno();
        try {
            BOTipoOrientador.excluir(id);
            r.setSucesso(true);
        } catch (Exception e) {
            r.setSucesso(false);
        }
        return r;
    }
    
}
