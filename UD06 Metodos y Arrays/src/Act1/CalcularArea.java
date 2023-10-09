package Act1;

import javax.swing.JOptionPane;

public class CalcularArea 
{

	public static void main(String[] args) 
	{
				
		String ElijeArea_texto=JOptionPane.showInputDialog("--Introduzca que área quiere calcular-- \n    Circulo     Triangulo    Cuadrado");
		
		
		switch(ElijeArea_texto)
		
		{
			
		case "Circulo":
								
			calculo_Circulo();			
			break;
			
		case "Triangulo":
			
			calculo_Triangulo();
			break;
		case "Cuadrado":
			
			calculo_Cuadrado();
			break;
			
		}
		
	}
	
	
	public static void calculo_Circulo() 
	{
			
		String num_radio_texto=JOptionPane.showInputDialog("--Introduzca el valor del radio--");

		float radio_num=Float.parseFloat(num_radio_texto);
		
	    float result_Area=(float) ((float) (Math.pow(radio_num, 2))*Math.PI);
	    
		JOptionPane.showMessageDialog(null, "El area del circulo es de: "+Math.round(result_Area*100.0)/100.0);		
	
	}
	
	public static void calculo_Triangulo() 
	{
		
		String num_base_texto=JOptionPane.showInputDialog("--Introduzca el valor de la base--");
		String num_altura_texto=JOptionPane.showInputDialog("--Introduzca el valor de la altura--");

		float base_num=Float.parseFloat(num_base_texto);
		float altura_num=Float.parseFloat(num_altura_texto);
		
	    float result_Area=(base_num*altura_num)/2;
	    
		JOptionPane.showMessageDialog(null, "El area del Triangulo es de: "+Math.round(result_Area*100.0)/100.0);		

	}
	
	public static void calculo_Cuadrado() 
	{
		
		String num_lado_texto=JOptionPane.showInputDialog("--Introduzca el valor del lado--");
		
		float lado_num=Float.parseFloat(num_lado_texto);
		
	    float result_Area=lado_num*lado_num;
	    
		JOptionPane.showMessageDialog(null, "El area del Triangulo es de: "+Math.round(result_Area*100.0)/100.0);		

	}
	
	
	
	
	

}
