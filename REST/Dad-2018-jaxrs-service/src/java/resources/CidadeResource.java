/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Cidade;

/**
 *
 * @author Raymison
 */
@Path("cidade")
public class CidadeResource {
    @GET
    @Path("/json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cidade consultarJSON(@PathParam("id")int id){
        Cidade c = new Cidade(1, "manaus", "amazonas");
        return c;
    }
    
    @GET
    @Path("/xml/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Cidade consultarXML(@PathParam("id")int id){
        Cidade c = new Cidade(1, "manaus", "amazonas");
        return c;
    }
    // arrumar
    @POST
    @Path("/inserir")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Cidade inserir(@FormParam("id")int id, @FormParam("cidade")String cidade, @FormParam("estado")String estado){
        Cidade c = new Cidade(id, cidade, estado);
        System.out.println(c.getId()+c.getNome()+c.getEstado());
        return c; 
    }
    // 
    @POST
    @Path("/salvar")
    @Consumes(MediaType.APPLICATION_JSON)
    public String salvar(Cidade c){
        System.out.println("Cidade: "+c.getNome());
        return c.getNome();
    }
}
