package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfEmail;
	private JLabel lblNewLabel_1;
	private JTextField tfCom;
	private JComboBox comboBox;
	private JLabel outPutLabel;

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
		setTitle("전자우편 주소 결정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfEmail());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfCom());
		contentPane.add(getComboBox());
		contentPane.add(getOutPutLabel());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Email주소 :");
			lblNewLabel.setBounds(32, 51, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setBounds(105, 46, 130, 26);
			tfEmail.setColumns(10);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("@");
			lblNewLabel_1.setBounds(244, 51, 18, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfCom() {
		if (tfCom == null) {
			tfCom = new JTextField();
			tfCom.setBounds(274, 46, 130, 26);
			tfCom.setColumns(10);
		}
		return tfCom;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboSelect();
				}
			});
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "daum.net", "gmail.com", "icloud.com"}));
			comboBox.setBounds(427, 47, 148, 27);
		}
		return comboBox;
	}
	private JLabel getOutPutLabel() {
		if (outPutLabel == null) {
			outPutLabel = new JLabel("");
			outPutLabel.setBounds(115, 98, 289, 16);
		}
		return outPutLabel;
	}

	
	
	
	private void comboSelect() {
		String strCom = comboBox.getSelectedItem().toString();
		tfCom.setText(strCom);
		String Email = tfEmail.getText();
		getOutPutLabel();
		getOutPutLabel().setText("당신의 이메일 주소는 " + 
		Email+"@"+strCom+"입니다.");
	}
	
	
	
	
	
	
	
}

