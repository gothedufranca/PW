/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import bo.BOFornecedor;
import to.TOFornecedor;
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
@Path("fornecedor")
public class ServiceFornecedor {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceUsuario
     */
    public ServiceFornecedor() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public TOFornecedor salvar(TOFornecedor fornecedor) throws Exception{
        BOFornecedor.inserir(fornecedor);
        return fornecedor;
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public TOFornecedor alterar(TOFornecedor fornecedor) throws Exception {
        BOFornecedor.alterar(fornecedor);
        return fornecedor;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TOFornecedor> obterFornecedores() throws Exception{
        return BOFornecedor.lista();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TOFornecedor obterFornecedores(@PathParam("id") int id) throws Exception{
        return BOFornecedor.obter(id);
    }
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TORetorno excluir(@PathParam("id") int id) throws Exception {
        TORetorno r = new TORetorno();
        try {
            BOFornecedor.excluir(id);
            r.setSucesso(true);
        } catch (Exception e) {
            r.setSucesso(false);
        }
        return r;
    }
    
}
