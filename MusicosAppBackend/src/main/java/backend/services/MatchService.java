package backend.services;

import java.util.ArrayList;

import backend.DAOs.AvisoDAO;
import backend.DAOs.OfrecimientoDAO;
import backend.domainModel.Aviso;
import backend.domainModel.Musico;
import backend.domainModel.Ofrecimiento;

public class MatchService {

	public void MatchearTodos() {
		// Obtiene todos los avisos y ofrecimientos de la base, los cruza
		// por cada uno, compara usando el metodo comparar y si da true los matchea con Match
		AvisoDAO avisoDAO = new AvisoDAO();
		ArrayList<Aviso> avisos = (ArrayList<Aviso>) avisoDAO.todos();
		
		OfrecimientoDAO ofreciDAO = new OfrecimientoDAO();
		ArrayList<Ofrecimiento> ofrecimientos = (ArrayList<Ofrecimiento>) ofreciDAO.todos();
		
		for (Aviso a: avisos) {
			for (Ofrecimiento o: ofrecimientos) {
				if (comparar(o, a)) {
					Match(o, a);
				}
			}
		}
	}

	private void Match(Ofrecimiento o, Aviso a) {
		// Crea una notificacion para cada parte avisando que hay matcheo
		ArrayList<Musico> asminsBanda = new ArrayList<>();
//		asminsBanda = a.getBanda().getExpBandas()
		
	}
	
	public boolean comparar(Ofrecimiento o, Aviso a) {
		// compara un ofrecimiento con un aviso para ver si son compatibles. 
		return false;
	}
	
	
}
