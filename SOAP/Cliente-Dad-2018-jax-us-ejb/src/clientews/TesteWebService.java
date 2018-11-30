/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

/**
 *
 * @author Raymison
 */
public class TesteWebService {
    public static void main(String args[]){
        CidadeWS_Service service = new CidadeWS_Service();
        // dentro da porta ficam as operações
        Cidade cidade = service.getCidadeWSPort().consultar(1);
        System.out.println("Cidade: "+cidade.getNome()+" Estado: "+cidade.getEstado());
    }
}
