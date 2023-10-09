package Act8;

import java.util.Scanner;

public class Array 
{ 
	
	public static void main(String[] args) 
	{
		 
       
		int tamaño_array=10;
		
        int num[]=new int[tamaño_array];
        
		System.out.println("--Introduce 10 valores para rellenar el Array--");

        rellenarArray(num);
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[])
    {
    	
    	Scanner scanner= new Scanner(System.in);
    	
        for(int i=0;i<lista.length;i++)
        {
    			
    		System.out.print("Posicion - "+i+" - Introduce el numero: ");
    		String num_texto = scanner.nextLine();
    		
    		 lista[i] = Integer.parseInt(num_texto); 
            
        }
        
        scanner.close();  
     
    }
 
    public static void mostrarArray(int lista[])
    {
    	
        for(int i=0;i<lista.length;i++)
        {
        	
            System.out.println("En la posicion - "+i+" - esta el valor: "+lista[i]);

        }
    }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		



