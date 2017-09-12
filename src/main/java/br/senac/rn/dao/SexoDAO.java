
package br.senac.rn.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SexoDAO {
    private EntityManager manager;
    private EntityManagerFactory factory;

    public SexoDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
    }
    
    
    
}
