package ar.edu.unq.sarmiento.modelo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cursada extends Persistible {
	
	@OneToOne
	public Materia materia;
	public EstadoCursada estado;
	public int notaFinal;
	public int anio;
	public int getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anioEnQueSeCursoLaMateria) {
		this.anio = anioEnQueSeCursoLaMateria;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public EstadoCursada getEstado() {
		return estado;
	}

	public void setEstado(EstadoCursada estado) {
		this.estado = estado;
	}
	
	public boolean estadoRegularizadoOAprobado(){
		return (this.getEstado().equals(EstadoCursada.REGULARIZADA) || 
				this.getEstado().equals(EstadoCursada.APROBADA_FINAL) ||
				this.getEstado().equals(EstadoCursada.APROBADA_PROMOCION));
	}
}
	