package distancecalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Distanceop {

	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Distanceop window = new Distanceop();
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
	public Distanceop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DISTANCE CALCULATOR");
		lblNewLabel.setBounds(107, 34, 174, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel A = new JLabel("SOURCE LOCATION");
		A.setBounds(35, 82, 147, 14);
		frame.getContentPane().add(A);
		
		JLabel B = new JLabel("DESTINATION LOCATION");
		B.setBounds(35, 128, 147, 14);
		frame.getContentPane().add(B);
		
		text1 = new JTextField();
		text1.setBounds(260, 79, 86, 20);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(260, 125, 86, 20);
		frame.getContentPane().add(text2);
		text2.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE DISTANCE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String A=(text1.getText());
				String B=(text2.getText());
				double dis= 2.3;
				int stop=57;
				double net = (stop*dis);
				text3.setText(String.valueOf(net));
			}
		});
		btnNewButton.setBounds(85, 167, 196, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel C = new JLabel("DISTANCE COVERED");
		C.setBounds(35, 213, 157, 14);
		frame.getContentPane().add(C);
		
		text3 = new JTextField();
		text3.setBounds(260, 210, 86, 20);
		frame.getContentPane().add(text3);
		text3.setColumns(10);
	}
}
