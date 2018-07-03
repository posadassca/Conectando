package backend.domainModel;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class Rol {
	
	@Id
	@GeneratedValue
	private Long Id_Rol;
	private String nombre;
	
	@OneToMany(mappedBy = "rol")
	private List<AvisoRol> avisoRoles = new ArrayList<AvisoRol>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<MusicoBanda> experiencias = new ArrayList<MusicoBanda>();
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Instrumento instrumento;
	
	public Rol() {
	}

	public Rol(String nombre) {
		this.nombre = nombre;
	}

	public Long getId_Rol() {
		return Id_Rol;
	}

	public void setId_Rol(Long id_Rol) {
		Id_Rol = id_Rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public List<AvisoRol> getAvisoRoles() {
		return avisoRoles;
	}

	public List<MusicoBanda> getExpBandas() {
		return experiencias;
	}
	
	
}
