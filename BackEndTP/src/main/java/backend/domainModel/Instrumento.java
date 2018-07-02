package backend.domainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Instrumento {

	@Id
	@GeneratedValue
	private Long Id_Instrumento;
	private String nombre;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Aviso> avisos = new ArrayList<Aviso>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Ofrecimiento> ofrecimientos = new ArrayList<Ofrecimiento>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Musico> musicos = new ArrayList<Musico>();
	
	Instrumento(){
		
	}

	public Instrumento(String nombre) {
		this.nombre = nombre;
	}
	
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
	
	public List<Aviso> getAvisos(){
		return avisos;
	}
	
	public List<Ofrecimiento> getOfrecimientos(){
		return ofrecimientos;
	}
	
	public List<Musico> getMusicos() {
		return musicos;
	}
	
}