package Act3;

import javax.swing.JOptionPane;

public class NumeroPrimo 
{

	public static void main(String[] args) 
	{
		
		String numero_texto=JOptionPane.showInputDialog("Escriba un número ");
		int numero = Integer.parseInt(numero_texto);

		
		boolean r = ValidarNumeroPrimo(numero);
		
		JOptionPane.showMessageDialog(null, r);		

		
	}
	
	public static boolean ValidarNumeroPrimo(int x) 
	
	{
	
		boolean primo = true; 
		
	    for(int contador = 2; contador < x; contador++) 
	    {
	        if (x % contador == 0) 
	        {
	            primo = false;
	            break;  
	        }
	    }
	    if (primo) 
	    {
			JOptionPane.showMessageDialog(null, "El numero SI es primo");		
	    }
	    else 
	    {
			JOptionPane.showMessageDialog(null, "El numero NO es primo");		
	    }
		return primo;

	}
}
