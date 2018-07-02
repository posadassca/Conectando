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

	
	private Integer Id_Ofrecimiento;
	private String descripcion;
	
	Ofrecimiento(){
		
	}

	public Ofrecimiento(Integer id, String descripcion) {
		super();
		Id_Ofrecimiento = id;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue
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

//	public void agregarMusico(Musico music) {
//		// TODO Auto-generated method stub
//		this.musico = music;
//	}
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Musico musico;
//	public Musico getMusico() {
//		return musico;
//	}
//	
//	@OneToMany(mappedBy = "ofrecimiento", cascade = CascadeType.ALL, orphanRemoval = true)
//	private ArrayList<Match> matches;
//	public List<Match> getMatches(){
//		return matches;
//	}
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
//	public List<Instrumento> getInstrumentos(){
//		return instrumentos;
//	}
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private ArrayList<GeneroMusical> generos_musicales = new ArrayList<GeneroMusical>();
//	public List<GeneroMusical> getGenerosMusicales(){
//		return generos_musicales;
//	}
	
	
	
	
}
