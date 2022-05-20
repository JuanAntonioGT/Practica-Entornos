package practicas_entorno;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class PracticaUno {

	private JFrame frmPrimeraPrctica;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticaUno window = new PracticaUno();
					window.frmPrimeraPrctica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PracticaUno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimeraPrctica = new JFrame();
		frmPrimeraPrctica.setTitle("Primera Pr\u00E1ctica");
		frmPrimeraPrctica.setBounds(100, 100, 450, 300);
		frmPrimeraPrctica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrimeraPrctica.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 414, 239);
		frmPrimeraPrctica.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(10, 205, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enviar Datos");
		btnNewButton_1.setBounds(109, 205, 111, 23);
		panel.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(134, 42, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Apellidos");
		lblNewLabel.setBounds(10, 45, 114, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 17, 114, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 14, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Direccion");
		lblNewLabel_2.setBounds(10, 76, 114, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(134, 73, 86, 20);
		panel.add(textField_2);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBounds(315, 205, 89, 23);
		panel.add(btnNewButton_2);
		
		// Salir
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// Guardar
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				JOptionPane.showMessageDialog(null, "Datos correctamente guardados");
			}
		});
		
		// Limpiar
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		
	}
}
