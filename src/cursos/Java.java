package cursos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Java extends JFrame implements ListSelectionListener{

	// Creamos un array con los valores que va a contener la lista.
	String [] elementos = {"Introducción","Variables","Condicionales","Bucles", "Break y Continue", 
			"Switch y Case", "Arrays y Matrices", "Métodos, clases y objetos", 
			"Herencia y polimorfismo", "Tratamiento de cadenas de texto", "Entorno gráfico 1: a, b, c", };
	
	// Y lo añadimos a la lista para poder seleccionarlos.
	JList list = new JList(elementos);
	
	JPanel contenido = new JPanel();
	JLabel lblPrueba = new JLabel("Hola que tal");
	
	public Java(){
		super("Java");
		setSize(1024,768);
		setDefaultCloseOperation(3);
		getContentPane().setLayout(null);
		
		list.setBounds(12, 12, 187, 570);
		getContentPane().add(list);
		
		contenido.setBounds(209, 12, 803, 716);
		getContentPane().add(contenido);
		setVisible(true);
		
		list.addListSelectionListener(this);
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		if(list.getSelectedIndex() == 0){
			contenido.removeAll();
			contenido.add(lblPrueba);
			contenido.updateUI();
			contenido.repaint();
			repaint();
		}
		else if(list.getSelectedIndex() == 1){
			contenido.removeAll();
			contenido.updateUI();
			contenido.repaint();
			repaint();
		}
	}

}
