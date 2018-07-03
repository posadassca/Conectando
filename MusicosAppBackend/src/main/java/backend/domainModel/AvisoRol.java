package backend.domainModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aviso_rol")
public class AvisoRol {
	
	@Id
	@GeneratedValue
	private Long Id_AvisoRol;
	private int aniosExp;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "aviso_id")
	private Aviso aviso;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "rol_id")
	private Rol rol;
	
	public AvisoRol () {
	}

	public AvisoRol(int aniosExp) {
		this.aniosExp = aniosExp;
	}

	public Long getId_AvisoRol() {
		return Id_AvisoRol;
	}

	public void setId_AvisoRol(Long id_AvisoRol) {
		Id_AvisoRol = id_AvisoRol;
	}

	public int getAniosExp() {
		return aniosExp;
	}

	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}

	public Aviso getAviso() {
		return aviso;
	}

	public void setAviso(Aviso aviso) {
		this.aviso = aviso;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	

}
