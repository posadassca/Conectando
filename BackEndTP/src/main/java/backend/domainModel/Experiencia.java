package backend.domainModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Experiencia {

	@Id
	@GeneratedValue
	private Long Id_Experiencia;
	private Integer anios;
	
	Experiencia(){
		
	}

	public Experiencia(Integer anios) {
		this.anios = anios;
	}

	
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