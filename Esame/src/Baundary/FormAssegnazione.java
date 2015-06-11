package Baundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class FormAssegnazione {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAssegnazione window = new FormAssegnazione();
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
	public FormAssegnazione() {
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
		
		JLabel lblBenvenutoNellFast = new JLabel("<html>Benvenuto nell FAST FOOD \r\ninserisci numero di posti che vuoi occupare");
		lblBenvenutoNellFast.setHorizontalAlignment(SwingConstants.CENTER);
		lblBenvenutoNellFast.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 17));
		lblBenvenutoNellFast.setBounds(75, 19, 297, 86);
		frame.getContentPane().add(lblBenvenutoNellFast);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"1 ", "2", "3", "4 ", "5", "6 "}));
		comboBox.setBounds(103, 116, 223, 38);
		frame.getContentPane().add(comboBox);
		
		JButton btnConferma = new JButton("Conferma");
		btnConferma.setBounds(103, 174, 223, 38);
		frame.getContentPane().add(btnConferma);
	}
}
