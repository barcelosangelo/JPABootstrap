package org.academiadecodigo.bootcamp;

import javax.persistence.EntityManager;

public class EntityMapping {

    public static void main(String[] args) {


            public User findById(Integer id){
            EntityManager em = emf.createEntityManager();

            try {

                return em.find(User.class, 1);
            }finally {
                if (em != null){
                em.close();
                }
            }

        }

    }

}