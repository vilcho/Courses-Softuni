import entities.Color;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory footballBettingFactory = Persistence.createEntityManagerFactory("football_betting");

        EntityManager em = footballBettingFactory.createEntityManager();



    }
}
