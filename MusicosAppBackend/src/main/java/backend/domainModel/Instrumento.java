package backend.domainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Instrumento {

	private Long Id_Instrumento;
	private String nombre;
	
	Instrumento(){
		
	}

	public Instrumento(Long id, String nombre) {
		super();
		Id_Instrumento = id;
		this.nombre = nombre;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return Id_Instrumento;
	}

	public void setId(Long id) {
		Id_Instrumento = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
//	@ManyToMany(mappedBy = "instrumentos")
//	private ArrayList<Aviso> avisos = new ArrayList<Aviso>();
//	public List<Aviso> getAvisos(){
//		return avisos;
//	}
//	
//	@ManyToMany(mappedBy = "instrumentos")
//	private ArrayList<Ofrecimiento> ofrecimientos = new ArrayList<Ofrecimiento>();
//	public List<Ofrecimiento> getOfrecimientos(){
//		return ofrecimientos;
//	}
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private ArrayList<Musico> musicos = new ArrayList<Musico>();
//	public List<Musico> getMusicos() {
//		return musicos;
//	}
	
}
