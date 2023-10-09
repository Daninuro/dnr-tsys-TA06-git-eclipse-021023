package Act10;

import javax.swing.JOptionPane;

public class NumAleatPrimos 
{

	public static void main(String[] args) 
	{
		
        String texto=JOptionPane.showInputDialog("--Introduce el tamaño del array--");
        int num[]=new int[Integer.parseInt(texto)];
        
   
        rellenarNumPrimosAleatorioArray(num, 1, 100);
        mostrarArray(num);
        
        
        int primoMayor=numMayorPrimo(num);
        System.out.println("El primo más grande es el "+primoMayor);
        
    }
   

	
    public static void rellenarNumPrimosAleatorioArray(int lista[], int valorMinimo, int valorMaximo)
    {
   
        int i=0;
   
        while(i<lista.length)
        {           
            int num=((int)Math.floor(Math.random()*(valorMinimo-valorMaximo)+valorMaximo));           
            if (esPrimo(num))
            {              
                lista[i]=num;               
                i++;            
            }       
        }   
    }   
    
    
    private static boolean esPrimo (int numero)
   	{       
   	     
   		 // El 0, 1 y 4 no son primos
   		  if (numero <= 0 || numero == 1 || numero == 4) 
   		  {
   		    return false;
   		  }
   		  for (int i = 2; i < numero / 2; i++) 
   		  {
   		    // Si es divisible por cualquiera de estos números, no es primo
   		    if (numero % i == 0)
   		      return false;
   		  }
   		  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
   		  return true;
   		  
   	}
   
   
    public static void mostrarArray(int lista[])
    {
    	
        for(int i=0;i<lista.length;i++)
        {
        	
            System.out.println("En la posicion - "+i+" - esta el valor: "+lista[i]);

        }
    }
    
  
     
    public static int numMayorPrimo(int lista[])
    {
        int num_mayor=0;
        for(int i=0;i<lista.length;i++)
        {
            if(lista[i]>num_mayor)
            {
            	num_mayor=lista[i];
            }
        }
         
        return num_mayor;
    }
		
}


