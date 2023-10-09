package Act2;

import java.util.Scanner;


public class NumAleatorios 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.print("Introduzca cuantos números aleatorios quiere generar: ");
		String Cantidad_texto = scanner.nextLine();	
		
		int Cantidad = Integer.parseInt(Cantidad_texto);	
		
		System.out.println("--Introduzca entre que dos números quiere generar--");	
		
		System.out.print("Introduce el primer numero: ");
		String num1_texto = scanner.nextLine();
		System.out.print("Introduce el segundo numero: ");
		String num2_texto = scanner.nextLine();
			
		int numeroMinimo = Integer.parseInt(num1_texto);
		int numeroMaximo = Integer.parseInt(num2_texto);
		
		
		int result = Operacion(Cantidad, numeroMaximo, numeroMinimo);
		
		System.out.print(result);	
		 
	}
	
	public static int Operacion(int Cont, int Max, int min)
	{
		
		int numRandom = 1;
		
		
		for (int contador=2; contador<=Cont; contador++) 
		{
			
			numRandom = (int) (Math.random() * (Max - min)) + min;
			 
				System.out.print(numRandom+", ");	
				
		}
		
		return numRandom;
	}
	
	
}
	
	
				
	

	
	
	
