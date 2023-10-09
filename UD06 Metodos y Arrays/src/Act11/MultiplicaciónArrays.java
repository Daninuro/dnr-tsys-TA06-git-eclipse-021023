package Act11;

import java.util.Scanner;
// import javax.swing.JOptionPane;

public class MultiplicaciónArrays 
{

	public static void main(String[] args) 
	{
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("\n ---Introduce un tamaño de array --- \n");
		String tamaño_texto = scanner.nextLine();	
		int tamaño = Integer.parseInt(tamaño_texto);	
		
     //   String tamaño_texto=JOptionPane.showInputDialog("\n ---Introduce un tamaño de array --- \n");
    //    int tamaño=Integer.parseInt(tamaño_texto);
 
        int array1[]=new int [tamaño];
        int array2[];
 
        rellenarNumAleatorioArray(array1, 0, 100);
 
        array2=array1;
 
        array1=new int[tamaño];
 
        rellenarNumAleatorioArray(array1, 0, 100);
 
        int array_resultante[]=multiplicador(array1, array2);
 

        
        System.out.println("\n --- Array1 --- \n");
        mostrarArray(array1);
 
        System.out.println("\n --- Array2 --- \n");
        mostrarArray(array2);
 
        System.out.println("\n --- Array resultante de multiplicar 'Array 1' y 'Array 2' ---\n");
        mostrarArray(array_resultante);
        
        scanner.close();
 
           
    }
	
	
	
    public static void rellenarNumAleatorioArray(int lista[], int valorMinimo, int valorMaximo)
    {
        for(int i=0;i<lista.length;i++)
        {
        	
            lista[i]=((int)Math.floor(Math.random()*(valorMinimo-valorMaximo)+valorMaximo));
            
        }
    }
 
    public static void mostrarArray(int lista[])
    {
        for(int i=0;i<lista.length;i++)
        {
            System.out.println("En la posicion - "+i+" - esta el valor: "+lista[i]);
        }
    }
 
    public static int[] multiplicador(int array1[], int array2[])
    {
        int array_resultante[]=new int[array1.length];
        for(int i=0;i<array1.length;i++)
        {
        	array_resultante[i]=array1[i]*array2[i];
        }
        return array_resultante;
    }
		
	

}
