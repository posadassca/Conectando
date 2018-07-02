package backend.test.daos;


import backend.DAOs.BandaDAO;
import backend.DAOs.MusicoDAO;
import backend.domainModel.Musico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MusicoDaoTest {
	private static EntityManagerFactory entityManagerFactory;

	@BeforeClass
	public static void setUp() throws Exception {
			entityManagerFactory = Persistence.createEntityManagerFactory( "persistencia" );
	}

	@AfterClass
	public static void tearDown() throws Exception {
		entityManagerFactory.close();
	}

	@Test
	public void test() {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Musico brandon = new Musico("Brandon", "Boyd");
		
		entityManager.persist(brandon);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}