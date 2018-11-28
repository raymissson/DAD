/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Raymison
 */
public class Cidade {
    private String Nome;
    private Estado estado;

    public Cidade(String Nome, Estado estado) {
        this.Nome = Nome;
        this.estado = estado;
    }

    public Cidade() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
