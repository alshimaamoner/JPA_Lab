/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author DELL
 */
public class JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPAPU");
        EntityManager manger=factory.createEntityManager();
       Account account= manger.find(Account.class, 1);
        System.out.println(account);
    }
    
}
