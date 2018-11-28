/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.ValidationException;
import modelo.Cidade;
import modelo.ICidadeBean;
import org.jboss.ejb3.annotation.Cache;

/**
 *
 * @author Raymison
 */
@Cache("passivating")
@Stateful
public class CidadeBean implements ICidadeBean{
    @PersistenceContext
    private EntityManager em;
    @Override
    public void salvar(Cidade c) {
        em.persist(c);
    }

    @Override
    public List<Cidade> listar() {
        TypedQuery consulta = (TypedQuery) em.createQuery("select c from Cidade c", Cidade.class);
        return consulta.getResultList();
    }

    @Remove
    public void removerSEJB() {
        System.out.println("chamando o remover");
    }
    
    @PreDestroy
    public void preDestroy(){
        System.out.println("chamando Pre Destroy!!!");
    }
    
    @PrePassivate
    public void prePassivate(){
        System.out.println("chamando o Pre Passivate");
    }
    
    @PostActivate
    public void posActivate(){
        System.out.println("chamando o pos Actitive");
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void persistir() throws ValidationException{
        Cidade c1 = new Cidade();
        c1.setNome("manaus");
        em.persist(c1);
        Cidade c2 = new Cidade();
        c1.setNome("Itacoatiara");
        em.persist(c2);
        
        throw new ValidationException("erro de validacao");
    }
    
}
