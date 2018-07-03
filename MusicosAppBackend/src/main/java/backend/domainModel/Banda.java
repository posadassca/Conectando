package backend.domainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Banda {

	
	@Id
	@GeneratedValue
	private Integer Id_Banda;
	private String nombre;
	private String onda;

	@OneToMany(mappedBy = "banda")
	private List<MusicoBanda> expBandas = new ArrayList<MusicoBanda>();
	
	@OneToMany(mappedBy = "banda")
	private List<Aviso> avisos = new ArrayList<Aviso>();

	public Banda() {
	}
	
	public Banda(String nombre, String onda) {
		this.nombre = nombre;
		this.onda = onda;
	}

	public Integer getId_Banda() {
		return Id_Banda;
	}

	public void setId_Banda(Integer id_Banda) {
		Id_Banda = id_Banda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOnda() {
		return onda;
	}

	public void setOnda(String onda) {
		this.onda = onda;
	}

	public List<MusicoBanda> getExpBandas() {
		return expBandas;
	}

	public List<Aviso> getAvisos() {
		return avisos;
	}
	
	
	
//	public void agregarMusico(Musico musico){
//		
//		if (!musicos.contains(musico)){					
//			this.musicos.add(musico);
//			musico.agregarBanda(this);
//		}
//	}
//	
//	public void eliminarMusico(Musico musico){
//		
//		if (musicos.contains(musico)){
//			this.musicos.remove(musico);
//		}
//	
//	}
	
}
