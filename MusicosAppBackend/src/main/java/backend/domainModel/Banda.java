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
public class Banda {

	
	private Integer Id_Banda;
	private String nombre;
	private String descripcion;

	Banda() {

	}

	public Banda(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue
	public Integer getId() {
		return Id_Banda;
	}

	public void setId(Integer id) {
		Id_Banda = id;
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
	
	@OneToMany(mappedBy = "banda", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Musico> musicos = new ArrayList<Musico>();
	
	public List<Musico> getMusicos() {
		return musicos;
	}
	
//
//	@OneToMany(cascade = CascadeType.ALL)
//	private ArrayList<Aviso> avisos = new ArrayList<Aviso>();
//	public List<Aviso> getAvisos(){
//		return avisos;
//	}
	/*
	public void agregarMusico(Musico musico){
		
		if (!musicos.contains(musico)){					
			this.musicos.add(musico);
			musico.agregarBanda(this);
		}
	}
	
	public void eliminarMusico(Musico musico){
		
		if (musicos.contains(musico)){
			this.musicos.remove(musico);
		}
	
	}
	*/
}
