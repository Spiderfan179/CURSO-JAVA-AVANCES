package Lista.Ligada;

  class HotList<T> 
  {
    private Nodo<T> cabeza;
    private int tamaño;
    

    public HotList() {
        cabeza = null;
        tamaño = 0;
    }

    // el nodo
    @SuppressWarnings("hiding")
	private class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T data) {
            this.dato = data;
            this.siguiente = null;
        }
    }

    // Agrega un dato al final de la lista
    public void hotAdd(T dato)
    {
        Nodo<T> NuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = NuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = NuevoNodo;
        }
        tamaño++;
    }

    // buscar un elemento en la lista , devuelve el dato dentro de la lista
    public T hotFind(T dato) {
        Nodo<T> current = cabeza;
        while (current != null) {
            if (current.dato.equals(dato)) {
                return current.dato;
            }
            current = current.siguiente;
        }
        return null;
    }public T find(T dato) {
        Nodo<T> current = cabeza;
        while (current != null) {
            if (current.dato.equals(dato)) {
                return current.dato;
            }
            current = current.siguiente;
        }
        return null;
    }
    
    
    //busca la posicion de un dato en la lista devuelve el numero en la posicion y si no lo encuentra devuelve -1
    public int hotFindPos(T dato) {
        Nodo<T> actual = cabeza;
        int indice = 0;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return indice;
            }
            actual = actual.siguiente;
            indice++;
        }
        return -1;
    }


    // Eliminar un elemento de la lista
    public void hotDelete(T dato) {
        if (cabeza == null) {
            return; // La lista está vacía
        }
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            tamaño--;
            return;
        }
        Nodo<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(dato)) {
                actual.siguiente = actual.siguiente.siguiente;
                tamaño--;
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Obtener el tamaño de la lista
    public int hotSize() {
        return tamaño;
    }

    // Imprimir la lista
    public void hotPrint() {
        Nodo<T> current = cabeza;
        while (current != null) {
            System.out.print(current.dato + " -> ");
            current = current.siguiente;
        }
        System.out.println("null");
    }
  }

public class ListaLinkedPropiaImplementacion 
{
	
	public static void main(String[] args) 
	{
         HotList<String> MiPropiaLista = new HotList<>();
         
         MiPropiaLista.hotAdd("Daniel");
         MiPropiaLista.hotAdd("Rocio");
         MiPropiaLista.hotAdd("Raquel");
         
        
         MiPropiaLista.hotPrint();
         
         System.out.println("datos encontrados!!");
         System.out.println(MiPropiaLista.hotFind("Daniel") + " en la posicion ->" + MiPropiaLista.hotFindPos("Daniel"));
         System.out.println(MiPropiaLista.hotFind("Rocio") + " en la posicion ->"+ MiPropiaLista.hotFindPos("Rocio"));
         System.out.println(MiPropiaLista.hotFind("Raquel") + " en la posicion ->"+ MiPropiaLista.hotFindPos("Raquel"));
        
         MiPropiaLista.hotDelete("Daniel");
         
         MiPropiaLista.hotPrint();
	}

}
  
