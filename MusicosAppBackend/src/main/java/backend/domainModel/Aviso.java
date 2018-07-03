package backend.domainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Aviso {

	@Id
	@GeneratedValue
	private Long Id_Aviso;
	private Date fecha_vencimiento;
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Banda banda;
	
	@OneToMany(mappedBy = "aviso")
	private List<AvisoRol> avisoRoles = new ArrayList<AvisoRol>();
	
	public Aviso(){
	}

	public Aviso(Date fecha_vencimiento, String descripcion) {
		this.fecha_vencimiento = fecha_vencimiento;
		this.descripcion = descripcion;
	}

	public Long getId_Aviso() {
		return Id_Aviso;
	}

	public void setId_Aviso(Long id_Aviso) {
		Id_Aviso = id_Aviso;
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

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public List<AvisoRol> getAvisoRoles() {
		return avisoRoles;
	}

	
	
	
}
