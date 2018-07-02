package backend.domainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Musico {

	@Id
	@GeneratedValue
	private Integer Id_Musico;
	
	private String nombre;
	private String descripcion;

	@ManyToMany(cascade=CascadeType.ALL)
	private List<Banda> bandas = new ArrayList<Banda>();
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Ofrecimiento> ofrecimientos = new ArrayList<Ofrecimiento>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();

	public Musico(){
		
	}

	public Musico(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

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
	
	public List<Banda> getBandas(){
		return bandas;
	}
	
	public void agregarBanda(Banda banda){
		
		if (!bandas.contains(banda)){					
			this.bandas.add(banda);
			banda.agregarMusico(this);
		}
	}
	
	public void eliminarBanda(Banda banda){
		
		if (bandas.contains(banda)){
			this.bandas.remove(banda);
		}
	
	}
	
	public List<Ofrecimiento> getOfrecimientos() {
		return ofrecimientos;
	}
	
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}
	
}
