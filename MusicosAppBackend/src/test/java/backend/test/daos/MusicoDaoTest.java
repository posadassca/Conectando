package backend.test.daos;


import backend.DAOs.MusicoDAO;
import backend.domainModel.Banda;
import backend.domainModel.Musico;

import org.junit.Test;

public class MusicoDaoTest {
	
	@Test
	public void test() {
		
		MusicoDAO musicodao = new MusicoDAO();
		
		Musico brandon = new Musico("Brandon", "Boyd");
		Banda incubus = new Banda("Incubus", "...");
		
		
		brandon.agregarBanda(incubus);
		musicodao.crear(brandon);

	}

}