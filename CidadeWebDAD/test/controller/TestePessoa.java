/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import modelo.Pessoa;

/**
 *
 * @author Raymison
 */
public class TestePessoa {
    public static void main(String args[]) throws JAXBException, FileNotFoundException{
        JAXBContext contexto = JAXBContext.newInstance(Pessoa.class);
        Marshaller geradorXML = contexto.createMarshaller();
        Pessoa pessoa1 = new Pessoa();
        geradorXML.marshal(pessoa1, new FileOutputStream("pessoa.xml"));
    }
    
}
