package clases.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)
import java.util.ArrayList;

public class Clinica {
	public Clinica(String nombre, String rfc, LocalDate fechaNacimiento) {
		super();
		Nombre = nombre;
		this.rfc = rfc;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String Nombre = "";
	public String rfc = "";
	public LocalDate fechaNacimiento = null;
	public java.time.LocalDate fechaConsulta = null;

	public Clinica() {

		super();

	}

	private ArrayList<LocalDate>fecha=new ArrayList<LocalDate>();
	private ArrayList<String>Sintomas=new ArrayList<String>();
	private ArrayList<Integer>temperatura=new ArrayList<Integer>();
	private ArrayList<Float>peso=new ArrayList<Float>();
	private ArrayList<Float>estatura=new ArrayList<Float>();
	
	public void agregarConsulta(java.time.LocalDate fecha, String sintomas, int temperatura, float peso,
			float estatura) {
	
		this.fecha.add(fecha);
		this.Sintomas.add(sintomas);
		this.temperatura.add(temperatura);
		this.peso.add(peso);
		this.estatura.add(estatura);

	}

	public String receta(String medicamentos, String recomendaciones) {
		String receta = "Sin nada que mostrar";
		if(medicamentos!=null  ||recomendaciones!=null){
			receta="Medicamentos: "+ medicamentos+" "+" Recomendaciones: "+ recomendaciones;
		}
		return receta;

	}

	public int obtenEdad(int anios) {

	int obtenEdad=0;
		if(anios>0) {
		obtenEdad=(2021-anios);
			
		}
		return obtenEdad;

	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String newRfc) {
		this.rfc = newRfc;
	}

	public java.time.LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(java.time.LocalDate newFechaNacimiento) {
		this.fechaNacimiento = newFechaNacimiento;
	}

	public java.time.LocalDate getFechaConsulta() {
		return this.fechaConsulta;
	}

	public void setFechaConsulta(java.time.LocalDate newFechaConsulta) {
		this.fechaConsulta = newFechaConsulta;
	}

	public String toString() {
		return "Clinica [Nombre=" + Nombre + ", rfc=" + rfc + ", fechaNacimiento=" + fechaNacimiento
				+ ", fechaConsulta=" + fechaConsulta +",Consulta= Fecha de consulta"+fecha +"\n,Sintomas= "+Sintomas+" ,Temperatura="+temperatura 
				+", Peso= "+peso+", Estatura="+estatura+"]";
	}

}
