package launch;
import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.*;
import java.awt.event.*;
import cursos.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class programarSi extends JFrame{

	private final JLabel lblObjetos = new JLabel("Lenguajes orientados a objetos");
	private final JLabel lblJava = new JLabel("Java");
	private final JLabel lblCPlus = new JLabel("C++");
	private final JLabel lblPython = new JLabel("Python");
	private final JLabel lblCSharp = new JLabel("C#");
	private final JLabel lblPhp = new JLabel("PHP");
	private final JLabel lblHtml5 = new JLabel("HTML5");
	private final JLabel lblCss3 = new JLabel("CSS3");
	private final JLabel lblJs = new JLabel("Javascript");
	private final JLabel lblWeb = new JLabel("Lenguajes orientados al desarrollo de páginas web");
	
	private final ImageIcon imgJava = new ImageIcon("logos/java.png");
	private final ImageIcon imgCPlus = new ImageIcon("logos/c++.png");
	private final ImageIcon imgCSharp = new ImageIcon("logos/c#.png");
	private final ImageIcon imgPython = new ImageIcon("logos/python.png");
	private final ImageIcon imgPhp = new ImageIcon("logos/php.png");
	private final ImageIcon imgC = new ImageIcon("logos/c.png");
	private final ImageIcon imgJs = new ImageIcon("logos/js.png");
	private final ImageIcon imgSql = new ImageIcon("logos/mysql.png");
	private final ImageIcon imgHtml = new ImageIcon("logos/html5.png");
	private final ImageIcon imgCss = new ImageIcon("logos/css3.png");

	private final JButton btnJava = new JButton(imgJava);
	private final JButton btnCPlus = new JButton(imgCPlus);
	private final JButton btnCSharp = new JButton(imgCSharp);
	private final JButton btnPython = new JButton(imgPython);
	private final JButton btnPhp = new JButton(imgPhp);
	private final JButton btnHtml = new JButton(imgHtml);
	private final JButton btnCss = new JButton(imgCss);
	private final JButton btnJs = new JButton(imgJs);
	

	public programarSi(){
		super("Project Jenova - Aprende a programar en varios lenguajes");
		setSize(730,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		lblObjetos.setBounds(156, 2, 431, 22);
		
		lblObjetos.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblJava.setBounds(87, 197, 67, 14);
		lblJava.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJava.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblJava.setAlignmentX(Component.RIGHT_ALIGNMENT);
		getContentPane().setLayout(null);
		getContentPane().add(lblObjetos);
		btnCPlus.setBounds(205, 36, 150, 150);
		getContentPane().add(btnCPlus);
		btnCSharp.setBounds(544, 36, 150, 150);
		getContentPane().add(btnCSharp);
		btnPython.setBounds(375, 36, 150, 150);
		getContentPane().add(btnPython);
		btnPhp.setBounds(544, 261, 150, 150);
		getContentPane().add(btnPhp);
		btnJava.setBounds(34, 36, 150, 150);
		getContentPane().add(btnJava);
		getContentPane().add(lblJava);
		
		lblCPlus.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCPlus.setAlignmentY(1.0f);
		lblCPlus.setAlignmentX(1.0f);
		lblCPlus.setBounds(263, 197, 67, 14);
		getContentPane().add(lblCPlus);
		
		lblPython.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPython.setAlignmentY(1.0f);
		lblPython.setAlignmentX(1.0f);
		lblPython.setBounds(429, 198, 67, 14);
		getContentPane().add(lblPython);
		
		lblCSharp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCSharp.setAlignmentY(1.0f);
		lblCSharp.setAlignmentX(1.0f);
		lblCSharp.setBounds(615, 197, 67, 14);
		getContentPane().add(lblCSharp);
		
		lblPhp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPhp.setAlignmentY(1.0f);
		lblPhp.setAlignmentX(1.0f);
		lblPhp.setBounds(601, 423, 67, 14);
		getContentPane().add(lblPhp);
		
		lblWeb.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeb.setBounds(167, 227, 431, 22);
		getContentPane().add(lblWeb);
		
		btnHtml.setBounds(34, 261, 150, 150);
		getContentPane().add(btnHtml);
		
		btnCss.setBounds(205, 261, 150, 150);
		getContentPane().add(btnCss);
		
		btnJs.setBounds(375, 261, 150, 150);
		getContentPane().add(btnJs);
		lblHtml5.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHtml5.setAlignmentY(1.0f);
		lblHtml5.setAlignmentX(1.0f);
		lblHtml5.setBounds(87, 422, 67, 14);
		
		getContentPane().add(lblHtml5);
		lblCss3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCss3.setAlignmentY(1.0f);
		lblCss3.setAlignmentX(1.0f);
		lblCss3.setBounds(263, 422, 67, 14);
		
		getContentPane().add(lblCss3);
		lblJs.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJs.setAlignmentY(1.0f);
		lblJs.setAlignmentX(1.0f);
		lblJs.setBounds(419, 423, 88, 14);
		
		getContentPane().add(lblJs);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblObjetos, btnCPlus, btnCSharp, btnPython, btnPhp, lblJava}));
		
		btnJava.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Java tutJava = new Java();
			}
		});

	}
}
