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

	@Id
	@GeneratedValue
	private Long Id_Match;
	private Date fecha;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Aviso aviso;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Ofrecimiento ofrecimiento;
	
	@OneToMany(mappedBy="match", cascade = CascadeType.ALL)
	private List<Notificacion> notificaciones = new ArrayList<Notificacion>();
	
	Match(){
		
	}
	
	public Match(Date fecha) {
		this.fecha = fecha;
	}

	
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
	
	public void setAviso(Aviso aviso) {
		this.aviso = aviso;
	}
	
	public void setOfrecimiento(Ofrecimiento ofrecimiento) {
		this.ofrecimiento = ofrecimiento;
	}
	
	public Aviso getAvisos() {
		return aviso;
	}
	
	public Ofrecimiento getOfrecimientos() {
		return ofrecimiento;
	}

	public List<Notificacion> getNotificaciones() {
		return notificaciones;
	}
}
