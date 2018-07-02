package backend.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerService {
		
		private EntityManagerFactory entityManagerFactory;
		
		public EntityManagerService() {
			entityManagerFactory = Persistence.createEntityManagerFactory("persistencia");
		}
		
		public EntityManager createEntityManager() {
		
			return entityManagerFactory.createEntityManager();
		}
	
}
