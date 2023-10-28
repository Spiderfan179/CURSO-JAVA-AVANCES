package Practica;

class Transporte{}
class Coche extends Transporte{}
class Deportivo extends Coche{}

class BeanGenerico<T extends Transporte>
{
	private T valor;
	
	

	public BeanGenerico(T valor) {
		super();
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
}

public class EjemploGenericos {

	public static void main(String[] args) 
	{
		
        @SuppressWarnings("unused")
		BeanGenerico<Transporte> transporte = new BeanGenerico<>(new Deportivo());
	
	}

}
