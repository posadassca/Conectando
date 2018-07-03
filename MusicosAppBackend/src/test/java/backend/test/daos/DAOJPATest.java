package backend.test.daos;

import backend.DAOs.MusicoDAO;
import backend.domainModel.Banda;
import backend.domainModel.Musico;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class DAOJPATest {
	@Test
	public void crearMusicoTest() {
		//El musico se persiste correctamente.
		MusicoDAO musicodao = new MusicoDAO();
		Musico brandon = new Musico("Brandon", "Boyd", "bboyd@incubus.org", "alternativo");
		musicodao.crear(brandon);
		
		assertEquals(brandon.getId_Musico(), musicodao.porId(brandon.getId_Musico()).getId_Musico());
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
