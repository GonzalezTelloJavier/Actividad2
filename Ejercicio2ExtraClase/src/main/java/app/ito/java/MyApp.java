package app.ito.java;
import clases.ito.poo.Clinica;
import java.time.LocalDate;
public class MyApp {
	static void run() {
		Clinica c= new Clinica("Similares", "ROPE020221H",LocalDate.of(2002, 02, 21));
		System.out.println(c+"\n");
		c.agregarConsulta(LocalDate.of(2021, 3, 12), "Dolor de cabeza", 34, 72, 1.70f);
		System.out.println(c+"\n");
		System.out.println(c.receta("Paracetamol", "Mantener reposo, tomar pastilla cada 8 horas\n"));
	
		System.out.println("Tu edad es de: "+c.obtenEdad(2002));
	}
	

	
	public static void main(String []args) {
		run();
	}

}
