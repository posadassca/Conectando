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
	private Long Id_Musico;
	
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

	public Long getId() {
		return Id_Musico;
	}

	public void setId(Long id) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id_Musico == null) ? 0 : Id_Musico.hashCode());
		result = prime * result + ((bandas == null) ? 0 : bandas.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((instrumentos == null) ? 0 : instrumentos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((ofrecimientos == null) ? 0 : ofrecimientos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musico other = (Musico) obj;
		if (Id_Musico == null) {
			if (other.Id_Musico != null)
				return false;
		} else if (!Id_Musico.equals(other.Id_Musico))
			return false;
		if (bandas == null) {
			if (other.bandas != null)
				return false;
		} else if (!bandas.equals(other.bandas))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (instrumentos == null) {
			if (other.instrumentos != null)
				return false;
		} else if (!instrumentos.equals(other.instrumentos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (ofrecimientos == null) {
			if (other.ofrecimientos != null)
				return false;
		} else if (!ofrecimientos.equals(other.ofrecimientos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Musico [Id_Musico=" + Id_Musico + ", nombre=" + nombre + ", descripcion=" + descripcion + ", bandas="
				+ bandas + ", ofrecimientos=" + ofrecimientos + ", instrumentos=" + instrumentos + "]";
	}
	
}
