package backend.domainModel;

import java.sql.Date;

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
	private Date fecha;
	private String descripcion;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Aviso aviso;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Ofrecimiento ofrecimiento;
	
	Notificacion(){
	}

	public Notificacion(Date fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
	}

	public Long getId_Notificacion() {
		return Id_Notificacion;
	}

	public void setId_Notificacion(Long id_Notificacion) {
		Id_Notificacion = id_Notificacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Aviso getAviso() {
		return aviso;
	}

	public void setAviso(Aviso aviso) {
		this.aviso = aviso;
	}

	public Ofrecimiento getOfrecimiento() {
		return ofrecimiento;
	}

	public void setOfrecimiento(Ofrecimiento ofrecimiento) {
		this.ofrecimiento = ofrecimiento;
	}
	
	
}

	