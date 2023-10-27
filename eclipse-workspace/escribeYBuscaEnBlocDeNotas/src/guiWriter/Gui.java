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
				try {
					BufferedWriter out = new BufferedWriter(new FileWriter("src/guiWriter/texto3/texto.txt", true));
					String cadena =textNom.getText()+","+textTel.getText()+","+textCor.getText()+"\n";
						out.write(cadena);						
						out.close();
						textNom.setText("");textTel.setText("");textCor.setText("");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
					e1.printStackTrace();						
				}
				
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
		        try {
		            String renglon;
		            BufferedReader in = new BufferedReader(new FileReader("src/guiWriter/texto3/texto.txt"));
		            while ((renglon = in.readLine()) != null) {
		                String[] datos = renglon.split(",");
		                if (datos.length >= 3) {
		                    // Concatenar los datos y agregarlos al modelo
		                    String infoContacto = "Nombre: " + datos[0] + ", Teléfono: " + datos[1] + ", Correo: " + datos[2];
		                    Modelo.addElement(infoContacto);
		                }
		            }
		            in.close();
		        } catch (IOException e1) {
		            System.out.println(e1.getMessage());
		        }
		    }
		});

		btnMostrarTodo.setBounds(84, 413, 199, 34);
		contentPane.add(btnMostrarTodo);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre para obtener los datos del usuario");
		        try {
		            String renglon;
		            BufferedReader in = new BufferedReader(new FileReader("src/guiWriter/texto3/texto.txt"));
		            while ((renglon = in.readLine()) != null) {
		                String[] datos = renglon.split(",");
		                if (datos.length >= 1 && datos[0].equals(nombreBuscar)) {
		                    if (datos.length >= 3) {
		                        textNom.setText(datos[0]);
		                        textTel.setText(datos[1]);
		                        textCor.setText(datos[2]);
		                        break; 
		                    }
		                }
		            }
		            in.close();
		        } catch (IOException e1) {
		            System.out.println(e1.getMessage());
		        }
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
