package backend.domainModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "musico_instrumento")
public class MusicoInstrumento {
	
	@Id
	@GeneratedValue
	private Long Id_Experiencia;
	private int anios;
	private String descripcion;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "instrumento_id")
	private Instrumento instrumento;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "musico_id")
	private Musico musico;
	
	public MusicoInstrumento () {
	}

	public MusicoInstrumento(int anios, String descripcion) {
		this.anios = anios;
		this.descripcion = descripcion;
	}

	public Long getId_Experiencia() {
		return Id_Experiencia;
	}

	public void setId_Experiencia(Long id_Experiencia) {
		Id_Experiencia = id_Experiencia;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public Musico getMusico() {
		return musico;
	}

	public void setMusico(Musico musico) {
		this.musico = musico;
	}
	
	
}
