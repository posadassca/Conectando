package backend.interfaces;

import java.util.ArrayList;

import backend.domainModel.Match;

public interface interfaceMatchDAO extends interfaceDAO<Match>{
	
	/* Ejemplo */
	public ArrayList<Match> allMatchs(); 

}
