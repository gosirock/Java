package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Help extends JDialog {
	private JLabel lblNewLabel;
	private JButton btnEnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help dialog = new Help();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Help() {
		setTitle("Help");
		setBounds(100, 100, 312, 175);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getBtnEnd());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("문제가 발생하면 010-1111-****로 연락주세요");
			lblNewLabel.setBounds(21, 29, 344, 16);
		}
		return lblNewLabel;
	}
	private JButton getBtnEnd() {
		if (btnEnd == null) {
			btnEnd = new JButton("종료");
			btnEnd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();								//화면가리기?
				}
			});
			btnEnd.setBounds(85, 74, 117, 29);
		}
		return btnEnd;
	}
}
