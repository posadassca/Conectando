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

	
	private Long Id_GeneroMusical;
	private String nombre;

	GeneroMusical(){
		
	}

	public GeneroMusical(Long id, String nombre) {
		super();
		Id_GeneroMusical = id;
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue
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
	
//	@ManyToMany(mappedBy = "generos_musicales")
//	private ArrayList<Ofrecimiento> ofrecimientos = new ArrayList<Ofrecimiento>();
//	public List<Ofrecimiento> getOfrecimientos(){
//		return ofrecimientos;
//	}
//	
//	@ManyToMany(mappedBy = "generos_musicales")
//	private ArrayList<Aviso> avisos = new ArrayList<Aviso>();
//	public List<Aviso> getAvisos() {
//		return avisos;
//	}
}
