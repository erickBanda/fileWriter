package guiWriter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;

public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNom;
	private JTextField textTel;
	private JTextField textCor;
	private JButton btnBuscar;
	Enlace enlace = new Enlace("");
	DefaultListModel Modelo=new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nombre:");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNom.setBounds(57, 65, 77, 25);
		contentPane.add(lblNom);
		
		JLabel lblTelfono = new JLabel("Teléfono");
		lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelfono.setBounds(57, 103, 77, 25);
		contentPane.add(lblTelfono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCorreo.setBounds(57, 139, 77, 25);
		contentPane.add(lblCorreo);
		
		textNom = new JTextField();
		textNom.setBounds(120, 69, 148, 20);
		contentPane.add(textNom);
		textNom.setColumns(10);
		
		textTel = new JTextField();
		textTel.setColumns(10);
		textTel.setBounds(120, 107, 148, 20);
		contentPane.add(textTel);
		
		textCor = new JTextField();
		textCor.setColumns(10);
		textCor.setBounds(120, 143, 148, 20);
		contentPane.add(textCor);
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					enlace.anadir(textNom.getText(), textTel.getText(), textCor.getText());
			textNom.setText("");
			textTel.setText("");
			textCor.setText("");
				
			}
		});
		btnAnadir.setBounds(26, 379, 89, 23);
		contentPane.add(btnAnadir);
		JList lista = new JList();
		lista.setBounds(10, 175, 325, 193);
		contentPane.add(lista);
		lista.setModel(Modelo);
		
		JButton btnMostrarTodo = new JButton("Mostrar todos los contactos");
		btnMostrarTodo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String resultados = enlace.MuestraTodo();
		        String[] lineas = resultados.split("\n");
		        for (String linea : lineas) {
		            Modelo.addElement(linea);
		        }
		    }  
		});


		btnMostrarTodo.setBounds(84, 413, 199, 34);
		contentPane.add(btnMostrarTodo);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nombre = JOptionPane.showInputDialog("Ingrese el nombre para obtener los datos del usuario");
		        String[] resultados = enlace.buscar(nombre);
		       textNom.setText(resultados[0]);
		       textTel.setText(resultados[1]);
		       textCor.setText(resultados[2]);
		    }
		});


		btnBuscar.setBounds(136, 379, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNom.setText("");
                textTel.setText("");
                textCor.setText("");
			}
		});
		btnLimpiar.setBounds(246, 379, 89, 23);
		contentPane.add(btnLimpiar);				
	}
}
