package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPasswordField pfPassword;
	private JButton btnOK;
	private JTextField tfResult;
	private JPasswordField pfSecondPassword;
	private JLabel lblNewLabel_1;

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
		setTitle("password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getPfPassword());
		contentPane.add(getBtnOK());
		contentPane.add(getTfResult());
		contentPane.add(getPfSecondPassword());
		contentPane.add(getLblNewLabel_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(29, 11, 61, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(102, 6, 123, 26);
		}
		return pfPassword;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnOK.setBounds(143, 71, 117, 29);
		}
		return btnOK;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(29, 101, 328, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}

	private JPasswordField getPfSecondPassword() {
		if (pfSecondPassword == null) {
			pfSecondPassword = new JPasswordField();
			pfSecondPassword.setBounds(102, 39, 123, 26);
		}
		return pfSecondPassword;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setBounds(29, 44, 61, 16);
		}
		return lblNewLabel_1;
	}
	
	// --- Functions
	
	private void checkPassword() {
		
		char[] pass = pfPassword.getPassword();							// Char 패스워드는 하나씩 받아 바꿈
		char[] passSecond = pfSecondPassword.getPassword();
		
		String passString = new String(pass);	// char배열을 String으로 바꿔서 passString에 넣음
		String passSecndString = new String(passSecond);
		
		if (passString.equals(passSecndString)) tfResult.setText("Password가 일치합니다.");			// 패스워드비교
		else tfResult.setText("Password가 일치하지 않습니다.");
	}



}
