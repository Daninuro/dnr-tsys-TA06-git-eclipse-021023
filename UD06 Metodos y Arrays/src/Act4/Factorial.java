package Act4;

import javax.swing.JOptionPane;

public class Factorial 
{

	public static void main(String[] args) 
	{

		String numero_texto=JOptionPane.showInputDialog("Escriba un número ");
		int numero = Integer.parseInt(numero_texto);
		
		
		float resultado = OperacionFactorial(numero);
		
		JOptionPane.showMessageDialog(null,"El resultado és: " +Math.round(resultado*100)/100);		
	
	}
	
	
	public static long OperacionFactorial(int n) 
	{
		
		long fact = 1;
		
		
	    for (int i = 2; i <= n; i++) 
	    {
	 
	        fact = fact * i;
	        
	    }
	    
	    return fact;
		
		
		
	}

}
