package backend.domainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Musico {

	private Integer Id_Musico;
	private String nombre;
	private String descripcion;
	private Banda banda;
	
	
	public Musico(){
		
	}

	public Musico(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue
	public Integer getId() {
		return Id_Musico;
	}

	public void setId(Integer id) {
		Id_Musico = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	
	
	
	@ManyToOne(cascade= CascadeType.ALL)
	public Banda getBanda() {
		return banda;
	}
	
//	@ManyToMany(mappedBy = "musicos")
//	private List<Banda> bandas = new ArrayList<Banda>();
//	
//	public List<Banda> getBandas(){
//		return bandas;
//	}
	
	
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	private ArrayList<Ofrecimiento> ofrecimientos = new ArrayList<Ofrecimiento>();
//	public List<Ofrecimiento> getOfrecimientos() {
//		return ofrecimientos;
//	}
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
//	public List<Instrumento> getInstrumentos() {
//		return instrumentos;
//	}
	
}
