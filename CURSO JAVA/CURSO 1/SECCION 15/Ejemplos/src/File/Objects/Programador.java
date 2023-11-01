package File.Objects;

import java.io.Serializable;

public class Programador implements Serializable
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String nombre;
private String lenguajeFavorito;

public Programador(String nombre, String lenguajeFavorito) {
	super();
	this.nombre = nombre;
	this.lenguajeFavorito = lenguajeFavorito;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getLenguajeFavorito() {
	return lenguajeFavorito;
}

public void setLenguajeFavorito(String lenguajeFavorito) {
	this.lenguajeFavorito = lenguajeFavorito;
}




	

}
