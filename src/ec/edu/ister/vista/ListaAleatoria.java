
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Lista;
import java.util.Random;

public class ListaAleatoria {
   public static void main(String [] a)
{
    Random r;
    int x;
    Lista lista;
    int l;
    r = new Random();
    lista = new Lista(); 
    l= Math.abs(r.nextInt()% 99); 

    for (; l> 0; l-- )
    {
      x= r.nextInt() % 99 ;
      lista.insertarCabezaLista(x);
 }

  System.out.println("ELEMEMTOS DE LA LISTA AL AZAR ");
   lista.visualizar();
} 
}
