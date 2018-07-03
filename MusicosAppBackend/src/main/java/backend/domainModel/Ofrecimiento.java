package backend.domainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ofrecimiento {

	@Id
	@GeneratedValue
	private Integer Id_Ofrecimiento;
	private String titulo;
	private String descripcion;
	private String onda;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Musico musico;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	Ofrecimiento(){
	}

	public Ofrecimiento(String titulo, String descripcion, String onda) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.onda = onda;
	}

	public Integer getId_Ofrecimiento() {
		return Id_Ofrecimiento;
	}

	public void setId_Ofrecimiento(Integer id_Ofrecimiento) {
		Id_Ofrecimiento = id_Ofrecimiento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getOnda() {
		return onda;
	}

	public void setOnda(String onda) {
		this.onda = onda;
	}

	public Musico getMusico() {
		return musico;
	}

	public void setMusico(Musico musico) {
		this.musico = musico;
	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	
}
