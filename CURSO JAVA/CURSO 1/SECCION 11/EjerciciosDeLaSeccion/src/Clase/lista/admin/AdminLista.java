package Clase.lista.admin;

import java.util.ArrayList;
import java.util.List;

interface Arreglo<T>
{ 
	private void buscar(T dato) {};
	private void eliminar(T dato) {};
    private	void Insertar(T dato) {};
	void Mostrar();
	boolean Buscar(T dato);
	boolean Agregar(T dato);
	boolean Eliminar(T dato);
}


class AdminList<T> implements Arreglo<T>
{
	private List<T> lista = new ArrayList<>();
	
	      

	
	private void buscar(T dato) {
		if (lista.contains(dato)) 
		{
		       System.out.println("El dato encontrado fue " + lista.get(lista.indexOf(dato)));	
		}else 
		{
			System.out.println("No se encontro el dato en la lista");
		}
		
	}

	
	private void eliminar(T dato) 
	{   
		int index=0;
		if (lista.contains(dato)) 
		{
			index=  lista.indexOf(dato);
			
			System.out.println("Dato Eliminado = " + lista.get(index));
			lista.remove(index);
			Mostrar();
		}else 
		{
		   System.out.println("No habia ningun dato con tal indice");	
		}
		
	}

	
	public void Insertar(T dato) 
	{
	
			if (!lista.contains(dato)) 
			{
				lista.add(dato);
			}
			
		
		
	}

	@Override
	public boolean Buscar(T dato) {
		// TODO Auto-generated method stub
		buscar(dato);
		return false;
	}

	@Override
	public boolean Agregar(T dato) {
		// TODO Auto-generated method stub
		Insertar(dato);
		return false;
	}

	@Override
	public boolean Eliminar(T dato) {
		// TODO Auto-generated method stub
		eliminar(dato);
		return false;
	}

	@Override
	 public  void Mostrar() 
	{
		for (T t : lista) 
		{
		    System.out.println(t);	
		}
		
	}
}


public class AdminLista 
{
   
	public static void main(String[] args) 
	{
	AdminList<String> list = new AdminList<>();
	
	System.out.println("Como se puede ver no permite ingresar algun dato duplicado!!");
		list.Agregar("Mula");
		list.Agregar("Mula");
		list.Agregar("Daniel");
		list.Agregar("Daniel");
		list.Agregar("Rocio");
	    list.Mostrar();
	    
	    System.out.println();
	    list.Eliminar("Daniel");
	    System.out.println();
	    System.out.println("no se puede eliminar un dato que no existe!!");
	    list.Eliminar("Daniel");
	    
	    System.out.println();
	    list.Buscar("Rocio");
	    System.out.println();
	    System.out.println("el dato no es encontrado si no existe");
	    list.Buscar("Daniel");
	    
	  

	}

}
