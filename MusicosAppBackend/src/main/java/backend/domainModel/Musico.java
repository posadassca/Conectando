package backend.domainModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Musico {

	@Id
	@GeneratedValue
	private Long Id_Musico;
	private String nombre;
	private String apellido;
	private String mail;
	private String onda;
	
	@OneToMany(mappedBy = "musico")
	private List<Ofrecimiento> ofrecimientos = new ArrayList<Ofrecimiento>();
	
	@OneToMany(mappedBy = "musico")
	private List<MusicoBanda> expBandas = new ArrayList<MusicoBanda>();

	public Musico(){
	}

	public Musico(String nombre, String apellido, String mail, String onda) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.onda = onda;
	}

	public Long getId_Musico() {
		return Id_Musico;
	}

	public void setId_Musico(Long id_Musico) {
		Id_Musico = id_Musico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getOnda() {
		return onda;
	}

	public void setOnda(String onda) {
		this.onda = onda;
	}

	public List<Ofrecimiento> getOfrecimientos() {
		return ofrecimientos;
	}

	public List<MusicoBanda> getExpBandas() {
		return expBandas;
	}
	
	
//	public void agregarExpBanda(Banda banda) {
//		//Agrega una nueva experiencia en banda con la banda que recibe
//		List<Banda> bandas = expBandas.stream().map(MusicoBanda::getBanda).collect(Collectors.toCollection(ArrayList::new));
//		if (!bandas.contains(banda)) {
//			MusicoBanda nuevaExp = new MusicoBanda(null, null, true, false);
//			nuevaExp.setMusico(this);
//			nuevaExp.setBanda(banda);
//			expBandas.add(nuevaExp);
//		}
//	}
	
}
