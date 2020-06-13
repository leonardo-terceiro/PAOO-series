/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.ads.series.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author leonardo.bertuzzi
 */
public class JPAUtil {
    private static EntityManagerFactory factory = null;
    
    public static EntityManager getEntityManager(){
        if (factory == null)
        factory = Persistence.createEntityManagerFactory("seriesPU");
        return factory.createEntityManager();
    }
    
}
