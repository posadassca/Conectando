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

	
	private Long Id_Aviso;
	private Date fecha_vencimiento;
	private String descripcion;
	
	Aviso(){
		
	}

	public Aviso(Long id, Date fecha_vencimiento, String descripcion) {
		super();
		Id_Aviso = id;
		this.fecha_vencimiento = fecha_vencimiento;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue
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
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Banda banda;
//	public Banda getBanda() {
//		return banda;
//	}
//	
//	@OneToMany(mappedBy = "aviso", cascade = CascadeType.ALL, orphanRemoval = true)
//	private ArrayList<Match> matches;
//	public List<Match> getMatches(){
//		return matches;
//	}
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private ArrayList<Instrumento> instrumentos;
//	public List<Instrumento> getInstrumentos() {
//		return instrumentos;
//	}
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private ArrayList<GeneroMusical> generos_musicales = new ArrayList<>();
//	public List<GeneroMusical> getGenerosMusicales() {
//		return generos_musicales;
//	}
	
	
	
}
