/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tonyd
 */
public class ea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("ea", "dp");
        Producto p = new Producto("camaronciza",200,30,120);
        //Pedido p = new Pedido(200, cliente);

        EntityManager em;
        //Obtiene acceso alemFactory a partir de la persistence unit utilizada
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("camaronPU");
//        Cache cache = emf.getCache();
//        cache.evictAll();
        // Creamos una em(bd) para realizar operaciones con la bd
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        //Publicacion p = em.find(Publicacion.class, )
        em.close();
    }

}
