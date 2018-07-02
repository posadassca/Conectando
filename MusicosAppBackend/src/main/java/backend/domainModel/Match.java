package backend.domainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Match {

	private Long Id_Match;
	private Date fecha;
	
	Match(){
		
	}
	
	public Match(Long id, Date fecha) {
		super();
		this.Id_Match = id;
		this.fecha = fecha;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return Id_Match;
	}

	public void setId(Long id) {
		this.Id_Match = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
//	public void setAviso(Aviso aviso) {
//		this.aviso = aviso;
//	}
//	
//	public void setOfrecimiento(Ofrecimiento ofrecimiento) {
//		this.ofrecimiento = ofrecimiento;
//	}
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Aviso aviso;
//	public Aviso getAvisos() {
//		return aviso;
//	}
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Ofrecimiento ofrecimiento;
//	public Ofrecimiento getOfrecimientos() {
//		return ofrecimiento;
//	}
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	private ArrayList<Notificacion> notificaciones = new ArrayList<Notificacion>();
//	public List<Notificacion> getNotificaciones() {
//		return notificaciones;
//	}
}
