package prog2Final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPacNom;
	private JTextField textPacEdad;
	private JTextField textPacPeso;
	private JTextField textPacSexo;
	private JTextField textPacEsp;
	private JTextField textPacIdTutor;
	private JTextField textPacIdHClin;
	private JTextField textPacId;
	private JTextField textTutId;
	private JTextField textTutNom;
	private JTextField textTutTel;
	private JTextField textTutCodPost;
	private JTextField textTutCorElec;
	private JTextField textTutPat;
	private JTextField textTutMat;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_5;
	private JTextField textField_12;
	private JTextField textField_17;
	private JTextField textField_13;

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
		setBounds(100, 100, 918, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 46, 273, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(98, 11, 64, 17);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 71, 64, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edad:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 96, 64, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Peso:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(10, 121, 64, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sexo:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1.setBounds(10, 146, 64, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Especie:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1.setBounds(10, 171, 64, 14);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Id del Tutor:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 196, 83, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Id de Hoja Clínica:");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 222, 106, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textPacNom = new JTextField();
		textPacNom.setBounds(67, 69, 140, 20);
		panel.add(textPacNom);
		textPacNom.setColumns(10);
		
		textPacEdad = new JTextField();
		textPacEdad.setColumns(10);
		textPacEdad.setBounds(49, 94, 64, 20);
		panel.add(textPacEdad);
		
		textPacPeso = new JTextField();
		textPacPeso.setColumns(10);
		textPacPeso.setBounds(49, 121, 64, 20);
		panel.add(textPacPeso);
		
		textPacSexo = new JTextField();
		textPacSexo.setColumns(10);
		textPacSexo.setBounds(49, 146, 83, 20);
		panel.add(textPacSexo);
		
		textPacEsp = new JTextField();
		textPacEsp.setColumns(10);
		textPacEsp.setBounds(67, 171, 86, 20);
		panel.add(textPacEsp);
		
		textPacIdTutor = new JTextField();
		textPacIdTutor.setColumns(10);
		textPacIdTutor.setBounds(89, 194, 64, 20);
		panel.add(textPacIdTutor);
		
		textPacIdHClin = new JTextField();
		textPacIdHClin.setColumns(10);
		textPacIdHClin.setBounds(121, 220, 64, 20);
		panel.add(textPacIdHClin);
		
		JLabel lblNewLabel_1_3 = new JLabel("Id:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(10, 46, 35, 14);
		panel.add(lblNewLabel_1_3);
		
		textPacId = new JTextField();
		textPacId.setColumns(10);
		textPacId.setBounds(34, 44, 64, 20);
		panel.add(textPacId);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Estado:");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(10, 247, 55, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(67, 247, 86, 20);
		panel.add(textField_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(40, 329, 273, 212);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTutor = new JLabel("Tutor");
		lblTutor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTutor.setBounds(98, 11, 64, 17);
		panel_1.add(lblTutor);
		
		JLabel lblNewLabel_1_2 = new JLabel("Id:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(10, 34, 64, 14);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Nombre:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1.setBounds(10, 59, 64, 14);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Teléfono");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_2.setBounds(10, 133, 64, 14);
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Código Postal:");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_3.setBounds(10, 158, 82, 14);
		panel_1.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Correo Electrónico:");
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_4.setBounds(10, 183, 114, 14);
		panel_1.add(lblNewLabel_1_2_4);
		
		textTutId = new JTextField();
		textTutId.setColumns(10);
		textTutId.setBounds(34, 32, 64, 20);
		panel_1.add(textTutId);
		
		textTutNom = new JTextField();
		textTutNom.setColumns(10);
		textTutNom.setBounds(68, 57, 140, 20);
		panel_1.add(textTutNom);
		
		textTutTel = new JTextField();
		textTutTel.setColumns(10);
		textTutTel.setBounds(68, 131, 140, 20);
		panel_1.add(textTutTel);
		
		textTutCodPost = new JTextField();
		textTutCodPost.setColumns(10);
		textTutCodPost.setBounds(98, 156, 86, 20);
		panel_1.add(textTutCodPost);
		
		textTutCorElec = new JTextField();
		textTutCorElec.setColumns(10);
		textTutCorElec.setBounds(121, 181, 140, 20);
		panel_1.add(textTutCorElec);
		
		JLabel as = new JLabel("Ape Paterno:");
		as.setFont(new Font("Tahoma", Font.PLAIN, 13));
		as.setBounds(10, 84, 82, 14);
		panel_1.add(as);
		
		JLabel lblApeMaterno = new JLabel("Ape Materno:");
		lblApeMaterno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApeMaterno.setBounds(10, 108, 82, 14);
		panel_1.add(lblApeMaterno);
		
		textTutPat = new JTextField();
		textTutPat.setColumns(10);
		textTutPat.setBounds(98, 82, 140, 20);
		panel_1.add(textTutPat);
		
		textTutMat = new JTextField();
		textTutMat.setColumns(10);
		textTutMat.setBounds(98, 106, 140, 20);
		panel_1.add(textTutMat);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(323, 46, 273, 203);
		contentPane.add(panel_2);
		
		JLabel lblHojaClnica = new JLabel("Hoja Clínica");
		lblHojaClnica.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblHojaClnica.setBounds(95, 11, 83, 17);
		panel_2.add(lblHojaClnica);
		
		JLabel lblNewLabel_1_4 = new JLabel("Razón:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_4.setBounds(10, 71, 64, 14);
		panel_2.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Temperatura:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_2.setBounds(10, 96, 83, 14);
		panel_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Fecha:");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_2.setBounds(10, 121, 64, 14);
		panel_2.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Sexo:");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_2.setBounds(10, 146, 64, 14);
		panel_2.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Total a pagar:");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1_2.setBounds(10, 171, 86, 14);
		panel_2.add(lblNewLabel_1_1_1_1_1_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(67, 69, 140, 20);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(95, 94, 64, 20);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(52, 119, 64, 20);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(49, 146, 83, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(95, 169, 86, 20);
		panel_2.add(textField_4);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Id:");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_1.setBounds(10, 46, 35, 14);
		panel_2.add(lblNewLabel_1_3_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(34, 44, 64, 20);
		panel_2.add(textField_7);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(323, 260, 273, 203);
		contentPane.add(panel_2_1);
		
		JLabel lblMedicamentosPorHoja = new JLabel("Medicamentos por Hoja Clínica");
		lblMedicamentosPorHoja.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMedicamentosPorHoja.setBounds(26, 11, 220, 17);
		panel_2_1.add(lblMedicamentosPorHoja);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Id Medicamento:");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_4_1.setBounds(10, 71, 106, 14);
		panel_2_1.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Temperatura:");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_2_1.setBounds(10, 96, 83, 14);
		panel_2_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Fecha:");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_2_1.setBounds(10, 121, 64, 14);
		panel_2_1.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Sexo:");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_2_1.setBounds(10, 146, 64, 14);
		panel_2_1.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2_1 = new JLabel("Total a pagar:");
		lblNewLabel_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1_2_1.setBounds(10, 171, 86, 14);
		panel_2_1.add(lblNewLabel_1_1_1_1_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(95, 94, 64, 20);
		panel_2_1.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(52, 119, 64, 20);
		panel_2_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(49, 146, 83, 20);
		panel_2_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(95, 169, 86, 20);
		panel_2_1.add(textField_10);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Id H Clínica:");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_1_1.setBounds(10, 46, 83, 14);
		panel_2_1.add(lblNewLabel_1_3_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(95, 44, 64, 20);
		panel_2_1.add(textField_11);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(117, 69, 64, 20);
		panel_2_1.add(textField_5);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(606, 46, 273, 203);
		contentPane.add(panel_2_2);
		
		JLabel lblMedicamento = new JLabel("Medicamento");
		lblMedicamento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMedicamento.setBounds(88, 11, 97, 17);
		panel_2_2.add(lblMedicamento);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Nombre:");
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_4_2.setBounds(10, 71, 64, 14);
		panel_2_2.add(lblNewLabel_1_4_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(67, 69, 140, 20);
		panel_2_2.add(textField_12);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Id:");
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_1_2.setBounds(10, 46, 35, 14);
		panel_2_2.add(lblNewLabel_1_3_1_2);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(34, 44, 64, 20);
		panel_2_2.add(textField_17);
	}
}
