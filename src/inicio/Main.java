package inicio;
import launch.*;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

	public Main(){
		// Pregunta al usuario si alguna vez ha programado.
		int seleccion = JOptionPane.showConfirmDialog(null, "Has programado alguna vez?");
		
		// En caso de que el usuario responda "Si" se abrira una ventana
		if(seleccion == JOptionPane.YES_OPTION){
			programarSi ventana = new programarSi();
			ventana.setVisible(true);
		}
		else if(seleccion == JOptionPane.NO_OPTION){
			programarNo ventana2 = new programarNo();
			ventana2.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
