/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;



import bo.BOOrdemDeServico;
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
import to.TOOrdemDeServico;
import to.TORetorno;


/**
 * REST Web Service
 *
 * @author usuario
 */
@Path("ordemdeservico")
public class ServiceOrdemDeServico {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceUsuario
     */
    public ServiceOrdemDeServico() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public TOOrdemDeServico salvar(TOOrdemDeServico ordemdeservico) throws Exception{
        BOOrdemDeServico.inserir(ordemdeservico);
        return ordemdeservico;
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public TOOrdemDeServico alterar(TOOrdemDeServico ordemdeservico) throws Exception {
        BOOrdemDeServico.alterar(ordemdeservico);
        return ordemdeservico;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TOOrdemDeServico> obterOrdemDeServico() throws Exception{
        return BOOrdemDeServico.lista();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TOOrdemDeServico obterOrdemDeServico(@PathParam("id") int id) throws Exception{
        return BOOrdemDeServico.obter(id);
    }
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TORetorno excluir(@PathParam("id") int id) throws Exception {
        TORetorno r = new TORetorno();
        try {
            BOOrdemDeServico.excluir(id);
            r.setSucesso(true);
        } catch (Exception e) {
            r.setSucesso(false);
        }
        return r;
    }
    
}
