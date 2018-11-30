/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Raymison
 */
@XmlRootElement
public class Cidade {

   
    private int id;
    private String nome;
    private String estado;

    public Cidade(int id,String nome, String estado) {
        this.id= id;
        this.nome = nome;
        this.estado = estado;
    }

    public Cidade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
