package Act12;

import javax.swing.JOptionPane;

public class MostrarAcabarDigito 
{

	public static void main(String[] args) {
		 
        String tamaño_texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int tamaño[]=new int[Integer.parseInt(tamaño_texto)];
 
        int ultimoDigito;
      
        
        tamaño_texto=JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
        ultimoDigito=Integer.parseInt(tamaño_texto);
        
 
        numAleatorio(tamaño, 1, 300);
 

        int terminadosEn[]=numTerminadosEn(tamaño, ultimoDigito);
 
        
      //  System.out.println(" --- Numeros generados aleatoriamente --- ");
      //  muestraTerminadosEn(tamaño);
        
        System.out.println("--- Los numeros generados terminados en "+ultimoDigito+" son --- \n"); 
        muestraTerminadosEn(terminadosEn);
 
    }
	
    public static void numAleatorio(int lista[], int valorMinimo, int valorMaximo)
    {
        for(int i=0;i<lista.length;i++)
        {
            lista[i]=((int)Math.floor(Math.random()*(valorMinimo-valorMaximo)+valorMaximo));
        }
    }
    
    
 
    public static void muestraTerminadosEn(int lista[])
    {
        for(int i=0;i<lista.length;i++)
        {
        	
            if(lista[i]!=0)
            {
                System.out.println("El numero "+lista[i]+" acaba en el numero escrito anteriormente");
            }
        }
    }
 
    public static int[] numTerminadosEn (int num[], int ultimo_numero)
    {
 
        int terminadosEn[]=new int[num.length];
 
        int numeroFinal=0;
 
        for (int i=0;i<terminadosEn.length;i++)
        {
 
            
          // Se le resta el numero por el mismo numero pero sin las unidades (272 - 270 = 2)
        
        	
            numeroFinal=num[i]-(num[i]/10*10);
 
            if (numeroFinal==ultimo_numero)
            {
                terminadosEn[i]=num[i];
            }
        }
 
        return terminadosEn;
    }
 
}
		
	


