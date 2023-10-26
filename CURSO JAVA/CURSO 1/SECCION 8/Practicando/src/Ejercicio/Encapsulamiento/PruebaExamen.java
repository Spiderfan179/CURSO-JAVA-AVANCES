package Ejercicio.Encapsulamiento;

class Examen {
	private float calificacion;
	private int numeroPreguntas;
	private boolean activo;
	
	public void setCalificacion(float calificacion) 
	{
	      this.calificacion = calificacion;
	}
	
	public float getCalificacion() 
	{
		return calificacion;
	}

	public float getNumeroPreguntas() {
		return numeroPreguntas;
	}

	public void setNumeroPreguntas(int numeroPreguntas) {
		this.numeroPreguntas = numeroPreguntas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}


public class PruebaExamen {
	public static void main(String[] args) {
          Examen e = new Examen();
          e.setCalificacion(10.0f);
	}
}
