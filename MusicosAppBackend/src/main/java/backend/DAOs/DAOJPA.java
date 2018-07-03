package backend.DAOs;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import backend.interfaces.interfaceDAO;
import backend.services.EntityManagerService;


public class DAOJPA<T> implements interfaceDAO<T> {

	private Class<T> entityClass;
	private EntityManagerService enManSer;
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public DAOJPA() {
		enManSer = new EntityManagerService();
		

		 ParameterizedType genericSuperclass = (ParameterizedType) getClass()
	             .getGenericSuperclass();
	        this.entityClass = (Class<T>) genericSuperclass
	             .getActualTypeArguments()[0];
	}
	
	public T crear(T t) {
		abrir();
		entityManager.getTransaction().begin();		
		entityManager.persist(t);
		entityManager.getTransaction().commit();
		cerrar();
		
		return t;
	}
	
	public T actualizar(T t){
		entityManager.getTransaction().begin();		
		T resultado = this.entityManager.merge(t);
		entityManager.getTransaction().commit();
		
		return resultado;
	}
	
	public void eliminar(T t){

		entityManager.getTransaction().begin();

		  t = this.entityManager.merge(t);
	      this.entityManager.remove(t);
		entityManager.getTransaction().commit();	
	}

	public T porId(long id){
		abrir();
		entityManager.getTransaction().begin();

		 T resultado = (T) this.entityManager.find(entityClass, id);
		 
		 entityManager.getTransaction().commit();
		 
		 return resultado;
	}
	
	public List<T> todos(){
		abrir();
		entityManager.getTransaction().begin();
		
		@SuppressWarnings("unchecked")
		List<T> resultados = entityManager.createQuery( "from " + entityClass.getName() ).getResultList();
		
		entityManager.getTransaction().commit();
		
		return resultados;
	}
	
	private void abrir() {
		entityManager = enManSer.createEntityManager(); 
	}
	
	private void cerrar() {
		entityManager.close();
	}
	
}