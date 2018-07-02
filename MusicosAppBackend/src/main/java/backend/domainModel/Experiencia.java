package backend.domainModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Experiencia {

	
	private Long Id_Experiencia;
	private Integer anios;
	
	Experiencia(){
		
	}

	public Experiencia(Long id, Integer anios) {
		super();
		Id_Experiencia = id;
		this.anios = anios;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return Id_Experiencia;
	}

	public void setId(Long id) {
		Id_Experiencia = id;
	}

	public Integer getAnios() {
		return anios;
	}

	public void setAnios(Integer anios) {
		this.anios = anios;
	}
	
}
