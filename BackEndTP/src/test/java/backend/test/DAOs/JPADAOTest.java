package backend.test.DAOs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import backend.DAOs.MusicoDAO;
import backend.domainModel.Musico;

public class JPADAOTest {

	@Test
	public void crearMusicoTest() {
		
		MusicoDAO musicodao = new MusicoDAO();
		Musico brandon = new Musico("Brandon", "Boyd");
		musicodao.crear(brandon);
		
		System.out.println(brandon.toString()); 
		System.out.println(musicodao.porId(brandon.getId()).toString());
		assertEquals(brandon.getId(), musicodao.porId(brandon.getId()).getId());
	}
	
	@Test
	public void crearBandaTest() {
		
	}
	
	@Test
	public void agregarBandaTest() {
		
	}
	
	@Test
	public void eliminarBandaTest() {
		
	}
	
	@Test
	public void eliminarMusicoTest() {
		
		
	}
	
	@Test
	public void actualizarMusicoTest() {
		
	}
	
}

