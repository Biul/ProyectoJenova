package cursos;
import java.awt.*;
import javax.swing.*;

public class Java extends JFrame{

	String [] elementos = {"Introducción","Variables","Condicionales","Bucles", "Break y Continue", 
			"Switch y Case", "Arrays y Matrices", "Métodos, clases y objetos", 
			"Herencia y polimorfismo", "Tratamiento de cadenas de texto", "Entorno gráfico 1: a, b, c", };
	JList list = new JList(elementos);
	
	public Java(){
		super("Java");
		setSize(1024,768);
		setDefaultCloseOperation(3);
		getContentPane().setLayout(null);
		
		list.setBounds(12, 12, 187, 570);
		getContentPane().add(list);
		
		JLabel lblProgramacionJava = new JLabel("Programación Java");
		lblProgramacionJava.setBounds(215, -16, 522, 72);
		getContentPane().add(lblProgramacionJava);
		setVisible(true);
	}
}
