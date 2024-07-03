package calculadoraSE;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SistemadeEcuaciones3 {

	private JFrame frame;
	private JTextField InputA3;
	private JTextField InputB3;
	private JTextField InputTI3;
	private JTextField InputC1;
	private JTextField InputC3;
	private JTextField InputC2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemadeEcuaciones3 window = new SistemadeEcuaciones3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SistemadeEcuaciones3() {
		initialize();
	}

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemadeEcuaciones3 window = new SistemadeEcuaciones3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(191, 69, 640, 590);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);

		JTextField InputA1 = new JTextField();
		InputA1.setHorizontalAlignment(SwingConstants.CENTER);
		InputA1.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputA1.setBounds(46, 62, 59, 49);
		frame.getContentPane().add(InputA1);
		InputA1.setColumns(10);

		JTextField InputB1 = new JTextField();
		InputB1.setHorizontalAlignment(SwingConstants.CENTER);
		InputB1.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputB1.setBounds(160, 62, 59, 49);
		frame.getContentPane().add(InputB1);
		InputB1.setColumns(10);

		JTextField InputTI2 = new JTextField();
		InputTI2.setHorizontalAlignment(SwingConstants.CENTER);
		InputTI2.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputTI2.setBounds(409, 197, 179, 49);
		frame.getContentPane().add(InputTI2);
		InputTI2.setColumns(10);

		JTextField InputTI1 = new JTextField();
		InputTI1.setHorizontalAlignment(SwingConstants.CENTER);
		InputTI1.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputTI1.setBounds(416, 62, 179, 49);
		frame.getContentPane().add(InputTI1);
		InputTI1.setColumns(10);

		JTextField InputA2 = new JTextField();
		InputA2.setHorizontalAlignment(SwingConstants.CENTER);
		InputA2.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputA2.setColumns(10);
		InputA2.setBounds(46, 196, 59, 49);
		frame.getContentPane().add(InputA2);

		JTextField InputB2 = new JTextField();
		InputB2.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputB2.setHorizontalAlignment(SwingConstants.CENTER);
		InputB2.setColumns(10);
		InputB2.setBounds(153, 197, 59, 49);
		frame.getContentPane().add(InputB2);

		JLabel lblB_5 = new JLabel("Termino Independiente 1");
		lblB_5.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_5.setForeground(new Color(0, 0, 0));
		lblB_5.setBounds(409, 27, 179, 20);
		frame.getContentPane().add(lblB_5);

		Panel panel = new Panel();
		panel.setBackground(new Color(150, 201, 242));
		panel.setBounds(238, 453, 350, 66);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel Resultado = new JLabel("");
		Resultado.setBounds(10, 11, 385, 44);
		Resultado.setFont(new Font("Ebrima", Font.PLAIN, 13));
		panel.add(Resultado);

		InputA3 = new JTextField();
		InputA3.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputA3.setHorizontalAlignment(SwingConstants.CENTER);
		InputA3.setColumns(10);
		InputA3.setBounds(39, 340, 59, 49);
		frame.getContentPane().add(InputA3);

		InputB3 = new JTextField();
		InputB3.setHorizontalAlignment(SwingConstants.CENTER);
		InputB3.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputB3.setColumns(10);
		InputB3.setBounds(153, 340, 59, 49);
		frame.getContentPane().add(InputB3);

		JLabel lblB_6_1 = new JLabel("Termino Independiente 3");
		lblB_6_1.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_6_1.setForeground(new Color(0, 0, 0));
		lblB_6_1.setBounds(409, 300, 179, 21);
		frame.getContentPane().add(lblB_6_1);

		InputTI3 = new JTextField();
		InputTI3.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputTI3.setHorizontalAlignment(SwingConstants.CENTER);
		InputTI3.setColumns(10);
		InputTI3.setBounds(409, 340, 179, 49);
		frame.getContentPane().add(InputTI3);

		JButton Calcular = new JButton("Resolver");
		Calcular.setFont(new Font("Ebrima", Font.BOLD, 15));
		Calcular.setBounds(39, 453, 103, 74);
		Calcular.setRolloverIcon(new ImageIcon("src\\imagenes\\btnnnn1.png"));
		Calcular.setIcon(new ImageIcon("src\\imagenes\\btnnnn.png"));
		Calcular.setHorizontalTextPosition(SwingConstants.CENTER);
		Calcular.setForeground(new Color(30, 30, 30));
		Calcular.setBorder(null);
		frame.getContentPane().add(Calcular);

		JLabel lblB_1_2 = new JLabel("+");
		lblB_1_2.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_1_2.setForeground(new Color(0, 0, 0));
		lblB_1_2.setBounds(238, 77, 46, 14);
		frame.getContentPane().add(lblB_1_2);

		JLabel lblB_1_1_2 = new JLabel("+");
		lblB_1_1_2.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_1_1_2.setForeground(new Color(0, 0, 0));
		lblB_1_1_2.setBounds(238, 355, 21, 14);
		frame.getContentPane().add(lblB_1_1_2);

		JLabel lblB_4_2 = new JLabel("Z3");
		lblB_4_2.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2.setForeground(new Color(0, 0, 0));
		lblB_4_2.setBounds(296, 305, 21, 14);
		frame.getContentPane().add(lblB_4_2);

		InputC1 = new JTextField();
		InputC1.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputC1.setHorizontalAlignment(SwingConstants.CENTER);
		InputC1.setColumns(10);
		InputC1.setBounds(280, 62, 59, 49);
		frame.getContentPane().add(InputC1);

		InputC3 = new JTextField();
		InputC3.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputC3.setHorizontalAlignment(SwingConstants.CENTER);
		InputC3.setColumns(10);
		InputC3.setBounds(273, 341, 59, 48);
		frame.getContentPane().add(InputC3);

		InputC2 = new JTextField();
		InputC2.setHorizontalAlignment(SwingConstants.CENTER);
		InputC2.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputC2.setColumns(10);
		InputC2.setBounds(273, 197, 59, 49);
		frame.getContentPane().add(InputC2);
		
		JLabel lblB_9 = new JLabel("=");
		lblB_9.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_9.setForeground(new Color(0, 0, 0));
		lblB_9.setBounds(361, 358, 46, 14);
		frame.getContentPane().add(lblB_9);
		
		JLabel lblB_9_1 = new JLabel("=");
		lblB_9_1.setForeground(Color.BLACK);
		lblB_9_1.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_9_1.setBounds(361, 219, 46, 14);
		frame.getContentPane().add(lblB_9_1);
		
		JLabel lblB_1_1_2_1 = new JLabel("+");
		lblB_1_1_2_1.setForeground(Color.BLACK);
		lblB_1_1_2_1.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_1_1_2_1.setBounds(238, 216, 21, 14);
		frame.getContentPane().add(lblB_1_1_2_1);
		
		JLabel lblB_1_1_2_2 = new JLabel("+");
		lblB_1_1_2_2.setForeground(Color.BLACK);
		lblB_1_1_2_2.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_1_1_2_2.setBounds(122, 355, 21, 14);
		frame.getContentPane().add(lblB_1_1_2_2);
		
		JLabel lblB_9_1_1 = new JLabel("=");
		lblB_9_1_1.setForeground(Color.BLACK);
		lblB_9_1_1.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_9_1_1.setBounds(361, 77, 46, 14);
		frame.getContentPane().add(lblB_9_1_1);
		
		JLabel lblB_6_1_1 = new JLabel("Termino Independiente 2");
		lblB_6_1_1.setForeground(Color.BLACK);
		lblB_6_1_1.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_6_1_1.setBounds(409, 164, 179, 21);
		frame.getContentPane().add(lblB_6_1_1);
		
		JLabel lblB_1_1_2_3 = new JLabel("+");
		lblB_1_1_2_3.setForeground(Color.BLACK);
		lblB_1_1_2_3.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_1_1_2_3.setBounds(122, 219, 21, 14);
		frame.getContentPane().add(lblB_1_1_2_3);
		
		JLabel lblB_4_2_1 = new JLabel("Z2");
		lblB_4_2_1.setForeground(Color.BLACK);
		lblB_4_2_1.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2_1.setBounds(296, 169, 21, 14);
		frame.getContentPane().add(lblB_4_2_1);
		
		JLabel lblB_4_2_2 = new JLabel("Z1");
		lblB_4_2_2.setForeground(Color.BLACK);
		lblB_4_2_2.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2_2.setBounds(296, 32, 21, 14);
		frame.getContentPane().add(lblB_4_2_2);
		
		JLabel lblB_1_1_2_3_1 = new JLabel("+");
		lblB_1_1_2_3_1.setForeground(Color.BLACK);
		lblB_1_1_2_3_1.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_1_1_2_3_1.setBounds(122, 80, 21, 14);
		frame.getContentPane().add(lblB_1_1_2_3_1);
		
		JLabel lblB_4_2_2_1 = new JLabel("Y1");
		lblB_4_2_2_1.setForeground(Color.BLACK);
		lblB_4_2_2_1.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2_2_1.setBounds(172, 32, 21, 14);
		frame.getContentPane().add(lblB_4_2_2_1);
		
		JLabel lblB_4_2_2_2 = new JLabel("X1");
		lblB_4_2_2_2.setForeground(Color.BLACK);
		lblB_4_2_2_2.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2_2_2.setBounds(58, 30, 21, 14);
		frame.getContentPane().add(lblB_4_2_2_2);
		
		JLabel lblB_4_2_1_1 = new JLabel("Y2");
		lblB_4_2_1_1.setForeground(Color.BLACK);
		lblB_4_2_1_1.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2_1_1.setBounds(172, 171, 21, 14);
		frame.getContentPane().add(lblB_4_2_1_1);
		
		JLabel lblB_4_2_1_2 = new JLabel("X2");
		lblB_4_2_1_2.setForeground(Color.BLACK);
		lblB_4_2_1_2.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2_1_2.setBounds(58, 172, 21, 14);
		frame.getContentPane().add(lblB_4_2_1_2);
		
		JLabel lblB_4_2_3 = new JLabel("Y3");
		lblB_4_2_3.setForeground(Color.BLACK);
		lblB_4_2_3.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2_3.setBounds(172, 307, 21, 14);
		frame.getContentPane().add(lblB_4_2_3);
		
		JLabel lblB_4_2_4 = new JLabel("X3");
		lblB_4_2_4.setForeground(Color.BLACK);
		lblB_4_2_4.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_4_2_4.setBounds(58, 307, 21, 14);
		frame.getContentPane().add(lblB_4_2_4);

		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a1 = Double.parseDouble(InputA1.getText());
					double a2 = Double.parseDouble(InputA2.getText());
					double a3 = Double.parseDouble(InputA3.getText());
					double b1 = Double.parseDouble(InputB1.getText());
					double b2 = Double.parseDouble(InputB2.getText());
					double b3 = Double.parseDouble(InputB3.getText());
					double c1 = Double.parseDouble(InputC1.getText());
					double c2 = Double.parseDouble(InputC2.getText());
					double c3 = Double.parseDouble(InputC3.getText());
					double TI1 = Double.parseDouble(InputTI1.getText());
					double TI2 = Double.parseDouble(InputTI2.getText());
					double TI3 = Double.parseDouble(InputTI3.getText());

					double determinante = a1 * (b2 * c3 - c2 * b3) - b1 * (a2 * c3 - c2 * a3) + c1 * (a2 * b3 - b2 * a3);

					if (determinante != 0) {
						double determinanteX = TI1 * (b2 * c3 - c2 * b3) - b1 * (TI2 * c3 - c2 * TI3) + c1 * (TI2 * b3 - b2 * TI3);
						double determinanteY = a1 * (TI2 * c3 - c2 * TI3) - TI1 * (a2 * c3 - c2 * a3) + c1 * (a2 * TI3 - TI2 * a3);
						double determinanteZ = a1 * (b2 * TI3 - TI2 * b3) - b1 * (a2 * TI3 - TI2 * a3) + TI1 * (a2 * b3 - b2 * a3);

						double resultadoX = determinanteX / determinante;
						double resultadoY = determinanteY / determinante;
						double resultadoZ = determinanteZ / determinante;

						Resultado.setText(String.format("X = %.2f    Y = %.2f    Z = %.2f", resultadoX, resultadoY, resultadoZ));
					} else {
						Resultado.setText("El sistema de ecuaciones tiene infinitas soluciones.");
					}
				} catch (NumberFormatException ex) {
					Resultado.setText("Solo numeros!!!");
				} catch (Exception ex) {
					Resultado.setText("Faltan numeros.");
				}
			}
		});
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}