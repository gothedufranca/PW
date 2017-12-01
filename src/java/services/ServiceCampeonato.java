/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import bo.BOCampeonato;
import to.TOCampeonato;
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
@Path("campeonato")
public class ServiceCampeonato {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceUsuario
     */
    public ServiceCampeonato() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public TOCampeonato salvar(TOCampeonato campeonato) throws Exception{
        BOCampeonato.inserir(campeonato);
        return campeonato;
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public TOCampeonato alterar(TOCampeonato campeonato) throws Exception {
        BOCampeonato.alterar(campeonato);
        return campeonato;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TOCampeonato> obterCampeonatos() throws Exception{
        return BOCampeonato.lista();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TOCampeonato obterCampeonatos(@PathParam("id") int id) throws Exception{
        return BOCampeonato.obter(id);
    }
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TORetorno excluir(@PathParam("id") int id) throws Exception {
        TORetorno r = new TORetorno();
        try {
            BOCampeonato.excluir(id);
            r.setSucesso(true);
        } catch (Exception e) {
            r.setSucesso(false);
        }
        return r;
    }
    
}
