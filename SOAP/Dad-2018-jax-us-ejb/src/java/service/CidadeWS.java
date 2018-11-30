/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import modelo.Cidade;

/**
 *
 * @author Raymison
 */
@WebService(serviceName = "CidadeWS")
@Stateless
@Remote(ICidadeService.class)
public class CidadeWS implements ICidadeService{
    // webmethod anotar, customizar método cidade
    @WebMethod(operationName = "consultar")
    // webresult 
    @WebResult(name="retorno")
    // webparam para dar sentido
    public Cidade consultar(@WebParam(name="id") int id) {
        Cidade c = new Cidade();
        c.setId(1);
        c.setNome("Manaus");
        c.setEstado("Amazonas");
        return c;
    }
    
}
