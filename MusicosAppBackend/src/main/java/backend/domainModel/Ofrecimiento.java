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
import javax.persistence.OneToOne;

@Entity
public class Ofrecimiento {

	@Id
	@GeneratedValue
	private Integer Id_Ofrecimiento;
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Musico musico;
	
	@OneToMany(mappedBy = "ofrecimiento", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Match> matches;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<GeneroMusical> generos_musicales = new ArrayList<GeneroMusical>();
	
	Ofrecimiento(){
		
	}

	public Ofrecimiento(Integer id, String descripcion) {
		super();
		Id_Ofrecimiento = id;
		this.descripcion = descripcion;
	}

	
	public Integer getId() {
		return Id_Ofrecimiento;
	}

	private void setId(Integer id) {
		Id_Ofrecimiento = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Musico getMusico() {
		return musico;
	}
	
	public List<Match> getMatches(){
		return matches;
	}
	
	public List<Instrumento> getInstrumentos(){
		return instrumentos;
	}
	
	public List<GeneroMusical> getGenerosMusicales(){
		return generos_musicales;
	}
	
	
	
	
}
