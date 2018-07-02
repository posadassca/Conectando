package backend.DAOs;

import backend.domainModel.Banda;
import backend.domainModel.Musico;
import backend.interfaces.interfaceMusicoDAO;

public class MusicoDAO extends DAOJPA<Musico> implements interfaceMusicoDAO {

	@Override
	public String ideologiaMusico() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addBanda(Musico musico, Banda banda) {
		// TODO Auto-generated method stub
//		if (!musico.getBandas().contains(banda))
//			musico.getBandas().add(banda);
//		if (!banda.getMusicos().contains(musico))
//			banda.getMusicos().add(musico);
	}

}
