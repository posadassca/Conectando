package backend.domainModel;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "musico_banda")
public class MusicoBanda {

	@Id
	@GeneratedValue
	private Long Id_Experiencia;
	private Date desde;
	private Date hasta;
	private boolean actualidad;
	private boolean contacto;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "musico_id")
	private Musico musico;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "banda_id")
	private Banda banda;

	public MusicoBanda() {
	}
	
	public MusicoBanda(Date desde, Date hasta, boolean actualidad, boolean contacto) {
		this.desde = desde;
		this.hasta = hasta;
		this.actualidad = actualidad;
		this.contacto = contacto;
	}

	public Long getId_Experiencia() {
		return Id_Experiencia;
	}

	public void setId_Experiencia(Long id_Experiencia) {
		Id_Experiencia = id_Experiencia;
	}

	public Date getDesde() {
		return desde;
	}

	public void setDesde(Date desde) {
		this.desde = desde;
	}

	public Date getHasta() {
		return hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}

	public boolean isActualidad() {
		return actualidad;
	}

	public void setActualidad(boolean actualidad) {
		this.actualidad = actualidad;
	}

	public boolean isContacto() {
		return contacto;
	}

	public void setContacto(boolean contacto) {
		this.contacto = contacto;
	}

	public Musico getMusico() {
		return musico;
	}

	public void setMusico(Musico musico) {
		this.musico = musico;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	
	
	
}
