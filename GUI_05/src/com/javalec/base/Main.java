package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JComboBox cbFruits;
	private JTextField tfFruit;
	private JTextField tfAppend;
	private JButton btnAppend;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCbFruits());
		contentPane.add(getTfFruit());
		contentPane.add(getTfAppend());
		contentPane.add(getBtnAppend());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboAction();
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cbFruits.setBounds(49, 35, 129, 27);
		}
		return cbFruits;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setEditable(false);
			tfFruit.setBounds(220, 34, 156, 26);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}






	private JTextField getTfAppend() {
		if (tfAppend == null) {
			tfAppend = new JTextField();
			tfAppend.setBounds(49, 101, 130, 26);
			tfAppend.setColumns(10);
		}
		return tfAppend;
	}
	private JButton getBtnAppend() {
		if (btnAppend == null) {
			btnAppend = new JButton("Add");
			btnAppend.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					appendAction();
				}
			});
			btnAppend.setBounds(191, 101, 57, 29);
		}
		return btnAppend;
	}
// -- Function
	
	private void comboAction() {
		String strFruit = cbFruits.getSelectedItem().toString();					// 배열글자가져와서 스트링으로 변경
		tfFruit.setText(strFruit);				//텍스트박스에 넣는다
		
	}
	private void appendAction() {
		String str = tfAppend.getText();
		cbFruits.addItem(str);
	}
		
}

