package clases.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;

public class ClasificacionComposicion {

	private String titulo = "";
	private float duracion = 0F;
	private HashSet<String> interpretequeSolicita = new HashSet<String>();
	private String genero = "";
	private LocalDate fechaRegistro = null;
	private LocalDate fechaEstreno = null;

	public ClasificacionComposicion(String titulo, float duracion, HashSet<String> interpretequeSolicita, String Genero,
			LocalDate fechaRegistro, LocalDate fechaEstreno) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.interpretequeSolicita = interpretequeSolicita;
		this.genero = genero;
		this.fechaRegistro = fechaRegistro;
		this.fechaEstreno = fechaEstreno;
	}

	public ClasificacionComposicion() {

		super();

	}

	public void actualizaCompositor(String ) {

	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String newTitulo) {
		this.titulo = newTitulo;
	}

	public float getDuracion() {
		return this.duracion;
	}

	public void setDuracion(float newDuracion) {
		this.duracion = newDuracion;
	}

	public HashSet<String> getInterpretequeSolicita() {
		return this.interpretequeSolicita;
	}

	public String getGenero() {
		return this.Genero;
	}

	public void setGenero(String newGenero) {
		this.Genero = newGenero;
	}

	public LocalDate getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(LocalDate newFechaRegistro) {
		this.fechaRegistro = newFechaRegistro;
	}

	public LocalDate getFechaEstreno() {
		return this.fechaEstreno;
	}

	public void setFechaEstreno(LocalDate newFechaEstreno) {
		this.fechaEstreno = newFechaEstreno;
	}

	public String toString() {
		return "ClasificacionComposicion [titulo=" + titulo + ", duracion=" + duracion + ", interpretequeSolicita="
				+ interpretequeSolicita + ", genero=" + genero + ", fechaRegistro=" + fechaRegistro + ", fechaEstreno="
				+ fechaEstreno + "]";
	}

}
