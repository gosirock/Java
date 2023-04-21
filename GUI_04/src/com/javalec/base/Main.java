package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Sum;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel output;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Sum of digits");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getOutput());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("단단위 입력 숫자 (0~9)");
			lblNewLabel.setBounds(34, 37, 126, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.TRAILING);
			textField.setBounds(172, 32, 181, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getOutput() {
		if (output == null) {
			output = new JLabel("");
			output.setBounds(123, 99, 278, 16);
		}
		return output;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sum();
				}
			});
			btnNewButton.setBounds(357, 32, 87, 29);
		}
		return btnNewButton;
	}
	
	
	// Method
	
	private void sum() {
		
		int num = Integer.parseInt(textField.getText());
		
		Sum sum = new Sum(num);
		
		
		output.setText(Integer.toString(sum.addsum()));
		
		
//		String total = getName();
//		Sum sum = new Sum(total);
//		
//		
//		output.setText(sum.sum());
//	}
	
	
	}
}
