package Act9;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class SumNumsArray 
{

	public static void main(String[] args) 
	{
		
        String num_texto=JOptionPane.showInputDialog("--Que tamaño quieres que tenga el Array?--");
        int num[]=new int[Integer.parseInt(num_texto)];
 
        rellenarNumsAleatoriosArray(num, 0, 9);
 
        mostrarArrayySuma(num);
    }
 
    public static void rellenarNumsAleatoriosArray(int lista[], int valorMinimo, int valorMaximo)
    {
    	
        for(int i=0;i<lista.length;i++)
        {
        	
            lista[i]=((int)Math.floor(Math.random()*(valorMaximo-valorMinimo)+valorMinimo));
            
        }
        
    }
 
    public static void mostrarArrayySuma(int lista[])
    {
    	
    	   for(int i=0;i<lista.length;i++)
           {
           	
               System.out.println("En la posicion - "+i+" - esta el valor: "+lista[i]);

           }
        
        int sum = Arrays.stream(lista).sum();
        System.out.println("La suma de los valores del array es = "+sum);
        
    }
    
}




