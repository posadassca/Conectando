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

	@Id
	@GeneratedValue
	private Long Id_Instrumento;
	private String nombre;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Ofrecimiento> ofrecimientos = new ArrayList<Ofrecimiento>();
	
	@OneToMany(mappedBy="instrumento")
	private List<Rol> roles = new ArrayList<Rol>();
	
	@OneToMany(mappedBy="instrumento")
	private List<MusicoInstrumento> expInstrumentos = new ArrayList<MusicoInstrumento>();
	
	Instrumento(){
	}

	public Instrumento(String nombre) {
		this.nombre = nombre;
	}

	public Long getId_Instrumento() {
		return Id_Instrumento;
	}

	public void setId_Instrumento(Long id_Instrumento) {
		Id_Instrumento = id_Instrumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ofrecimiento> getOfrecimientos() {
		return ofrecimientos;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public List<MusicoInstrumento> getExpInstrumentos() {
		return expInstrumentos;
	}
	
	
	
	
}
