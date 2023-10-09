package Act7;

import javax.swing.JOptionPane;

public class CambioMoneda 
{

	public static void main(String[] args)
	{
		
		String numero_texto=JOptionPane.showInputDialog("Escriba la cantidad de '€' que quiere cambiar ");
		int numero = Integer.parseInt(numero_texto);
		
		String escoje_divisa_texto=JOptionPane.showInputDialog("A que divisa quiere hacer el cambio? \n Libras \n Dolares \n Yenes");

		
		switch (escoje_divisa_texto) 
		{
			
		case "Libras":
			
			double libras = CambioMonedaLibra(numero);
			JOptionPane.showMessageDialog(null,numero+"€ son "+Math.round(libras*100.0)/100.0+" Libras");
	
			break;
			
		case "Dolares":
			double dolares = CambioMonedaDolar(numero);
			JOptionPane.showMessageDialog(null,numero+"€ son "+Math.round(dolares*100.0)/100.0+" Dolares");
			
			break;
			
		case "Yenes":
			double yenes = CambioMonedaYen(numero);
			JOptionPane.showMessageDialog(null,numero+"€ son "+Math.round(yenes*100.0)/100.0+" Yenes");
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "DIVISA INCORRECTA");	
		
		
		}

		
	}
	
	public static double CambioMonedaLibra(double euros) 
	{
		double cambio =0.0;
		
		cambio = euros * 0.86;
		
		return cambio;
	}
	public static double CambioMonedaDolar(double euros) 
	{
		double cambio =0.0;
		
		cambio = euros * 1.28611;
		
		return cambio;
	}
	public static double CambioMonedaYen(double euros) 
	{
		double cambio =0.0;
		
		cambio = euros * 129.852;
		
		return cambio;
	}
}
