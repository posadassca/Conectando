package backend.domainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Aviso {

	@Id
	@GeneratedValue
	private Long Id_Aviso;
	private Date fecha_vencimiento;
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Banda banda;
	
//	@OneToMany(mappedBy = "aviso", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Match> matches = new ArrayList<Match>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<GeneroMusical> generos_musicales = new ArrayList<GeneroMusical>();
	
	Aviso(){
		
	}

	public Aviso(Date fecha_vencimiento, String descripcion) {
		this.fecha_vencimiento = fecha_vencimiento;
		this.descripcion = descripcion;
	}

	
	public Long getId() {
		return Id_Aviso;
	}

	private void setId(Long id) {
		Id_Aviso = id;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Banda getBanda() {
		return banda;
	}
	
//	public List<Match> getMatches(){
//		return matches;
//	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}
	
	public List<GeneroMusical> getGenerosMusicales() {
		return generos_musicales;
	}
	
	
	
}
