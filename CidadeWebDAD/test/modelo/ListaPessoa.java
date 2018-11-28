/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Raymison
 */
@XmlRootElement(name="listaDePessoasXML")
public class ListaPessoa {
    List<Pessoa> pessoas;
    Pessoa p = new Pessoa("raymison", "rua cururepa", "93252649", new Cidade("Itacoatiara", new Estado("AM")));
}
