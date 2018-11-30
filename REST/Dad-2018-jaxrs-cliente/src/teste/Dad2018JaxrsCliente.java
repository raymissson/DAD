/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import modelo.Cidade;

/**
 *
 * @author Raymison
 */
public class Dad2018JaxrsCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client cliente = new Client();
        WebResource recurso = cliente.resource("http://localhost:8080/Dad-2018-jaxrs-service/rest/cidade/xml/1");
        String json = recurso.get(String.class);
        System.out.println(json);
        Cidade c = recurso.get(Cidade.class);
        System.out.println(c.getNome());
    }
    
}
