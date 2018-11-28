/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Raymison
 */
public interface ICidadeBean{
    public void salvar(Cidade c);
    public List<Cidade> listar();
    public void removerSEJB();
    public void persistir();
}
