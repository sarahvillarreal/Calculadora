package calculadoraSE;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Label;
import javax.swing.SwingConstants;

public class SistemadeEcuaciones {

	private JFrame frame;
	private JTextField InputA1;
	private JTextField InputB1;
	private JTextField InputTI2;
	private JTextField InputTI1;
	private JTextField InputA2;
	private JTextField InputB2;
	private JLabel lblA;
	private JLabel lblB_1;
	private JLabel lblB_2;
	private JLabel lblB_3;
	private JLabel lblB_5;
	private JLabel lblB_6;
	private JButton btnNewButton;
	private JLabel lblB_5_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemadeEcuaciones window = new SistemadeEcuaciones();
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
	public SistemadeEcuaciones() {
		initialize();
	}
	
	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemadeEcuaciones window = new SistemadeEcuaciones();
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
		frame.getContentPane().setLayout(null);
		
		InputA1 = new JTextField();
		InputA1.setHorizontalAlignment(SwingConstants.CENTER);
		InputA1.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputA1.setBounds(52, 112, 103, 62);
		frame.getContentPane().add(InputA1);
		InputA1.setColumns(10);
		
		InputB1 = new JTextField();
		InputB1.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputB1.setHorizontalAlignment(SwingConstants.CENTER);
		InputB1.setBounds(217, 112, 103, 62);
		frame.getContentPane().add(InputB1);
		InputB1.setColumns(10);
		
		InputTI2 = new JTextField();
		InputTI2.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputTI2.setHorizontalAlignment(SwingConstants.CENTER);
		InputTI2.setBounds(372, 264, 196, 62);
		frame.getContentPane().add(InputTI2);
		InputTI2.setColumns(10);
		
		InputTI1 = new JTextField();
		InputTI1.setHorizontalAlignment(SwingConstants.CENTER);
		InputTI1.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputTI1.setBounds(372, 112, 196, 62);
		frame.getContentPane().add(InputTI1);
		InputTI1.setColumns(10);
		
		InputA2 = new JTextField();
		InputA2.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputA2.setHorizontalAlignment(SwingConstants.CENTER);
		InputA2.setColumns(10);
		InputA2.setBounds(52, 264, 103, 62);
		frame.getContentPane().add(InputA2);
		
		InputB2 = new JTextField();
		InputB2.setFont(new Font("Ebrima", Font.PLAIN, 16));
		InputB2.setHorizontalAlignment(SwingConstants.CENTER);
		InputB2.setColumns(10);
		InputB2.setBounds(217, 264, 103, 62);
		frame.getContentPane().add(InputB2);
		
		JLabel LabelA1 = new JLabel("X1");
		LabelA1.setFont(new Font("Ebrima", Font.BOLD, 15));
		LabelA1.setForeground(new Color(0, 0, 0));
		LabelA1.setBounds(92, 73, 46, 14);
		frame.getContentPane().add(LabelA1);
		frame.setBounds(191, 69, 640, 590);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		
		lblA = new JLabel("X2");
		lblA.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblA.setForeground(new Color(0, 0, 0));
		lblA.setBounds(92, 222, 46, 14);
		frame.getContentPane().add(lblA);
		
		lblB_1 = new JLabel("+");
		lblB_1.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_1.setForeground(new Color(0, 0, 0));
		lblB_1.setBounds(183, 288, 39, 14);
		frame.getContentPane().add(lblB_1);
		
		lblB_2 = new JLabel("Y2");
		lblB_2.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_2.setForeground(new Color(0, 0, 0));
		lblB_2.setBounds(261, 220, 46, 14);
		frame.getContentPane().add(lblB_2);
		
		lblB_3 = new JLabel("Y1");
		lblB_3.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_3.setForeground(new Color(0, 0, 0));
		lblB_3.setBounds(261, 73, 46, 14);
		frame.getContentPane().add(lblB_3);
		
		lblB_5 = new JLabel("Termino Independiente 1");
		lblB_5.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_5.setForeground(new Color(0, 0, 0));
		lblB_5.setBounds(383, 66, 196, 29);
		frame.getContentPane().add(lblB_5);
		
		lblB_6 = new JLabel("Termino Independiente 2");
		lblB_6.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblB_6.setForeground(new Color(0, 0, 0));
		lblB_6.setBounds(383, 212, 196, 29);
		frame.getContentPane().add(lblB_6);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(150, 201, 242));
		panel.setBounds(217, 420, 351, 74);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Resultado = new JLabel("");
		Resultado.setBounds(10, 11, 331, 52);
		Resultado.setFont(new Font("Ebrima", Font.PLAIN, 15));
		panel.add(Resultado);
		
		btnNewButton = new JButton("Resolver");
		btnNewButton.setFont(new Font("Ebrima", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(InputA1.getText().length()==0||InputB1.getText().length()==0||InputA2.getText().length()==0||
						InputB2.getText().length()==0) {
					
				}
				
		        double a1 = Double.parseDouble(InputA1.getText());
		        
		        double b1 = Double.parseDouble(InputB1.getText());
		        
		        char operador1 = '+';
		        
		        double c1 = Double.parseDouble(InputTI1.getText());

		        double a2 = Double.parseDouble(InputA2.getText());
		        
		        double b2 = Double.parseDouble(InputB2.getText());
		        
		        char operador2 = '+';
		        double c2 = Double.parseDouble(InputTI2.getText());

		        
		        double[][] A = { {a1, b1}, {a2, b2} };
		        double[] B = { c1, c2 };

		        
		        double[] solucion = resolverSistema(A, B);
		        if (solucion != null) {
		            Resultado.setText("x = " + String.format("%.2f", solucion[0]));
		            Resultado.setText(Resultado.getText() + "    y = " + String.format("%.2f", solucion[1]));
		        } else {
		        	Resultado.setText("El sistema de ecuaciones tiene infinitas soluciones.");
		        } 
			}
		});
		btnNewButton.setBackground(new Color(156, 201, 242));
		btnNewButton.setBounds(52, 420, 103, 74);
		btnNewButton.setRolloverIcon(new ImageIcon("src\\imagenes\\btnnnn1.png"));
		btnNewButton.setIcon(new ImageIcon("src\\imagenes\\btnnnn.png"));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setForeground(new Color(30, 30, 30));
		btnNewButton.setBorder(null);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblB_5_1 = new JLabel("=");
		lblB_5_1.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_5_1.setForeground(new Color(0, 0, 0));
		lblB_5_1.setBounds(340, 129, 19, 29);
		frame.getContentPane().add(lblB_5_1);
		
		JLabel lblB_1_1 = new JLabel("+");
		lblB_1_1.setForeground(Color.BLACK);
		lblB_1_1.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_1_1.setBounds(183, 136, 39, 14);
		frame.getContentPane().add(lblB_1_1);
		
		lblB_5_2 = new JLabel("=");
		lblB_5_2.setForeground(Color.BLACK);
		lblB_5_2.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblB_5_2.setBounds(340, 278, 19, 29);
		frame.getContentPane().add(lblB_5_2);
		
	
	}

    public static double[] resolverSistema(double[][] A, double[] B) {
        double a1 = A[0][0], b1 = A[0][1], c1 = B[0];
        double a2 = A[1][0], b2 = A[1][1], c2 = B[1];

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            return null;
        }

        double x = (c1 * b2 - c2 * b1) / determinant;
        double y = (a1 * c2 - a2 * c1) / determinant;

        return new double[] { x, y };
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}