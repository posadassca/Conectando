package backend.domainModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Notificacion {
	@Id
	@GeneratedValue	
	private Long Id_Notificacion;
	private String descripcion;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Match match;

	
	Notificacion(){
		
	}

	public Notificacion(Long id, String descripcion) {
		super();
		Id_Notificacion = id;
		this.descripcion = descripcion;
	}
	
	
	public Long getId() {
		return Id_Notificacion;
	}

	public void setId(Long id) {
		Id_Notificacion = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
//	public void setMatch(Match match) {
//		this.match = match;
//	}
//	
//	public Match getMatch() {
//		return match;
//	}
}