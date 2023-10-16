package clases;

public class EjemploPersonas {
	public static void main(String[] args) {
		Estudiante e = new Estudiante(101415,"Alex","19/08/1988");
		//e.nombre = "Alex";
		//e.fechaNacimiento = "19/08/1988";
		//e.numeroDeCuenta = 101415;
		e.dormir();
		e.aprobar();
		e.reprobar();
	}

}
