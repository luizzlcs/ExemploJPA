
package br.senac.rn.dao;

import br.senac.rn.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteDAO {
    private EntityManager manager;
    private EntityManagerFactory factory;
    
    public ClienteDAO(){
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    
    public void inserir(Cliente cliente){
       manager.getTransaction().begin();
        manager.persist(cliente); //inserir    
        manager.getTransaction().commit();
        
    }
    
    public void excluir(Cliente cliente){
        manager.getTransaction().begin();;
        manager.remove(cliente); // remover
        manager.getTransaction().commit();
    }
    
    public void atualizar(Cliente cliente){
        manager.getTransaction().begin();
        manager.merge(cliente); //atualizar
        manager.getTransaction().commit();
        
    }
    
    public List<Cliente> buscarTodos(){
        TypedQuery<Cliente> consulta = manager.createQuery("SELECT s FROM Cleinte s", Cliente.class);
        return consulta.getResultList();
    }
    
}
