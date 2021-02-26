import javax.swing.JOptionPane;
public class Modul1Fase3App {

	public static void main(String[] args) {
		
		final int ANY=1948;
		int contador=0;
		boolean comprobacio=false;
		String correcte="El teu any de naixement  és de traspàs";
		String incorrecte="El teu any de naixement no és de traspàs";
		
		String naixement=JOptionPane.showInputDialog("Introdueix el teu any de naixement");
		int anyNaixement = Integer.parseInt(naixement);
		for(int i=ANY;i<=anyNaixement;i++){
			if((i % 4 == 0)&&(i % 100 != 100)|| (i % 400 == 0))
			{
			System.out.println("any " + i);
			contador++;	
			if(i == anyNaixement){
				comprobacio = true;	
				
			}
		}
		}
			System.out.println("El total d'anys de traspàs entre  " + ANY + " i " + anyNaixement + ""
			+ " són: " + contador);
			if (comprobacio == true){
				JOptionPane.showMessageDialog(null,correcte);
			}
			else{
				JOptionPane.showMessageDialog(null,incorrecte);
				
			}
	
	}
	}