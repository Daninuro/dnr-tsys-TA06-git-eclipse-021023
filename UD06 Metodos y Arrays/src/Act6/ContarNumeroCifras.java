package Act6;

import javax.swing.JOptionPane;

public class ContarNumeroCifras 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		
		String numero_texto=JOptionPane.showInputDialog("Escriba un número ");
		int numero = Integer.parseInt(numero_texto);
		
		double result= ContarnumCifrasPositivo(numero);
		
	}
	
	
	public static int ContarnumCifrasPositivo(int numero) 
	{
		
		int iCantidad = 0;
		int iTemp = numero;
		    
		
		if (numero>0)
		{
			while (iTemp>0)
			{
			  iTemp = iTemp/10;
			  iCantidad++;
			}
			JOptionPane.showMessageDialog(null,numero + " tiene " + iCantidad + " dígitos");
		}
		else
		{    
		JOptionPane.showMessageDialog(null,"Error, el número tiene que tenr un valor positivo");
		}
		
		return numero;
	}

}
