package tareaGit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui extends JFrame {
	GitEnlace enlace = new GitEnlace("tilin");


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAaltura;
	private JTextField txtBase;
	private JTextField txtResultado;
	private JTextField txtRadio;

	

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
		setBounds(100, 100, 315, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAaltura = new JTextField();
		txtAaltura.setColumns(10);
		txtAaltura.setBounds(75, 76, 177, 20);
		contentPane.add(txtAaltura);
		
		txtBase = new JTextField();
		txtBase.setColumns(10);
		txtBase.setBounds(75, 45, 177, 20);
		contentPane.add(txtBase);
		
		JLabel lblNewLabel = new JLabel("Base");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(19, 39, 46, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAltura.setBounds(19, 68, 46, 28);
		contentPane.add(lblAltura);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(123, 147, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(46, 141, 78, 28);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("Área círculo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int radio = Integer.parseInt(txtRadio.getText());			
				int calculo = enlace.calculo("circulo",radio,0,0);
				String resultadoCalculo = String.valueOf(calculo);
				txtResultado.setText(resultadoCalculo);
			}
		});
		btnNewButton.setBounds(120, 178, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnreaCuadrado = new JButton("Área cuadrado");
		btnreaCuadrado.setBounds(109, 207, 103, 23);
		contentPane.add(btnreaCuadrado);
		
		JButton btnreaTringulo = new JButton("Área triángulo");
		btnreaTringulo.setBounds(109, 241, 103, 23);
		contentPane.add(btnreaTringulo);
		
		JLabel lblRadio = new JLabel("Radio");
		lblRadio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRadio.setBounds(19, 102, 46, 28);
		contentPane.add(lblRadio);
		
		txtRadio = new JTextField();
		txtRadio.setColumns(10);
		txtRadio.setBounds(75, 107, 177, 20);
		contentPane.add(txtRadio);
	}
}
