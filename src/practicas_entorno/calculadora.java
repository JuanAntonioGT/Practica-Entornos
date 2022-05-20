package practicas_entorno;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class calculadora {

	private JFrame frame;
	private JTextField textField;
	private JButton btnClear, btnDivision, btnMultiplicacion, btnResta, btnSuma, btnResultado, btnComa;
	private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	private JLabel lblNewLabel;
	
	private float primerNumero, segundoNumero, resultado;
	private String operador;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
		calcular();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 264, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnDivision = new JButton("/");
		btnDivision.setBounds(78, 62, 50, 50);
		frame.getContentPane().add(btnDivision);
		
		btnClear = new JButton("C");
		btnClear.setBounds(10, 62, 50, 50);
		frame.getContentPane().add(btnClear);
		
		btnMultiplicacion = new JButton("*");
		btnMultiplicacion.setBounds(154, 62, 50, 50);
		frame.getContentPane().add(btnMultiplicacion);
		
		btnResta = new JButton("-");
		btnResta.setBounds(224, 62, 50, 50);
		frame.getContentPane().add(btnResta);
		
		btnSuma = new JButton("+");
		btnSuma.setBounds(224, 123, 50, 100);
		frame.getContentPane().add(btnSuma);
		
		btnResultado = new JButton("=");
		btnResultado.setBounds(224, 234, 50, 100);
		frame.getContentPane().add(btnResultado);
		
		btn7 = new JButton("7");
		btn7.setBounds(10, 123, 50, 50);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(78, 123, 50, 50);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(154, 123, 50, 50);
		frame.getContentPane().add(btn9);
		
		btn4 = new JButton("4");
		btn4.setBounds(10, 184, 50, 50);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(78, 184, 50, 50);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(154, 184, 50, 50);
		frame.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.setBounds(10, 245, 50, 50);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(78, 245, 50, 50);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(154, 245, 50, 50);
		frame.getContentPane().add(btn3);
		
		btn0 = new JButton("0");
		btn0.setBounds(10, 306, 118, 50);
		frame.getContentPane().add(btn0);
				
		btnComa = new JButton(",");
		btnComa.setBounds(154, 306, 50, 50);
		frame.getContentPane().add(btnComa);
		
		lblNewLabel = new JLabel("Calculadora By Juan Antonio Developer");
		lblNewLabel.setBounds(10, 386, 264, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
	
	private void calcular() {
		
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
			
		});
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		
		btnSuma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				primerNumero = Float.parseFloat(textField.getText());
				operador = "+";
				textField.setText("");
			}
		});
		
		btnResta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				primerNumero = Float.parseFloat(textField.getText());
				operador = "-";
				textField.setText("");
			}
		});
		
		btnMultiplicacion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				primerNumero = Float.parseFloat(textField.getText());
				operador = "*";
				textField.setText("");
			}
		});
		
		btnDivision.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				primerNumero = Float.parseFloat(textField.getText());
				operador = "/";
				textField.setText("");
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				primerNumero = 0;
				segundoNumero = 0;
				operador = null;
				textField.setText("");
			}
		});
		
		btnComa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		
		btnResultado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				segundoNumero = Float.parseFloat(textField.getText());
				
				if (primerNumero != 0){
					switch(operador){
						case "+": resultado = primerNumero + segundoNumero;
					break;
						case "-": resultado = primerNumero - segundoNumero;
					break;
						case "*": resultado = primerNumero * segundoNumero;
					break;
						case "/": resultado = primerNumero / segundoNumero;
					break;
					}
					textField.setText(String.valueOf(resultado));
				}		
			}
		});
	}		
}