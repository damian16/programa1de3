
package ec.edu.ister.modelo;

import ec.edu.ister.controlador.Nodo;

public class Lista {
    protected Nodo primero;
 public Lista(){
    primero = null;
}
 public Lista insertarCabezaLista(int entrada){
    Nodo nuevo ;
    nuevo = new Nodo(entrada);
    nuevo.getEnlace = primero;
    primero = nuevo;
    return this;
}
  public void visualizar()
{
    Nodo n;
    int x = 0;
    n = primero;
    while (n != null)
{
    System.out.print(n.getDato() + " ");
     n = n.getEnlace;
     x++;
   System.out.print( (x%15 != 0 ?" " : "\n"));
} 
}
}
    

