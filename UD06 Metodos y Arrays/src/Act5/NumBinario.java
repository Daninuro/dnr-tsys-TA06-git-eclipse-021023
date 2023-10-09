package Act5;

import javax.swing.JOptionPane;

public class NumBinario 
{

	public static void main(String[] args) 
	{
		
		String numero_texto=JOptionPane.showInputDialog("Escriba un número ");
		int numero = Integer.parseInt(numero_texto);
		
		double result = ConvertirDecimalaBinario(numero);
		
		JOptionPane.showMessageDialog(null,"El resultado és: " +Math.round(result*100)/100);		

		
	}
	
	public static double ConvertirDecimalaBinario(int numero) 
	{
	
		int binario = 0;
		int base = 10;
		int exponente = 0;
		
		
		while(numero>0) 
		{
			
			int digitoBinario = numero %2;
			binario = (digitoBinario*(int)Math.pow(base, exponente))+binario;
			exponente++;
			
			numero = numero/2;
			
		}
	
		return binario;
		
	}

}
