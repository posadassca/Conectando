package backend.domainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class GeneroMusical {

	@Id
	@GeneratedValue
	private Long Id_GeneroMusical;
	private String nombre;

	@ManyToMany(mappedBy = "generos_musicales")
	private List<Ofrecimiento> ofrecimientos = new ArrayList<Ofrecimiento>();
	
	@ManyToMany(mappedBy = "generos_musicales")
	private List<Aviso> avisos = new ArrayList<Aviso>();
	
	GeneroMusical(){
		
	}

	public GeneroMusical(String nombre) {
		this.nombre = nombre;
	}
	
	public Long getId() {
		return Id_GeneroMusical;
	}

	public void setId(Long id) {
		Id_GeneroMusical = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Ofrecimiento> getOfrecimientos(){
		return ofrecimientos;
	}
	
	public List<Aviso> getAvisos() {
		return avisos;
	}
}
