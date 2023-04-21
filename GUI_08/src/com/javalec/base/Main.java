package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Main extends JFrame {

	private JPanel contentPane;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbApple;
	private JCheckBox cbBanana;
	private JButton btnFruit;
	private JTextField tfFruit;

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
		setTitle("CheckBox / RadioButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getRbKBS());
		contentPane.add(getRbMBC());
		contentPane.add(getBtnBroad());
		contentPane.add(getTfBroad());
		contentPane.add(getCbApple());
		contentPane.add(getCbBanana());
		contentPane.add(getBtnFruit());
		contentPane.add(getTfFruit());
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setSelected(true);
			rbKBS.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			rbKBS.setBounds(247, 37, 72, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			rbMBC.setBounds(247, 76, 72, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(225, 128, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(218, 174, 130, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	
	

	
	
	
	
	private JCheckBox getCbApple() {
		if (cbApple == null) {
			cbApple = new JCheckBox("Apple");
			cbApple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			cbApple.setBounds(54, 37, 128, 23);
		}
		return cbApple;
	}
	private JCheckBox getCbBanana() {
		if (cbBanana == null) {
			cbBanana = new JCheckBox("Banana");
			cbBanana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			cbBanana.setBounds(54, 76, 128, 23);
		}
		return cbBanana;
	}
	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			btnFruit.setBounds(44, 128, 117, 29);
		}
		return btnFruit;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setColumns(10);
			tfFruit.setBounds(39, 174, 130, 26);
		}
		return tfFruit;
	}
	// --- Function
	// .isSelected
	
	private void broadCheck() {
		// is로 시작하는건 bool이다 true 아니면 false
		if(rbKBS.isSelected()) {
			tfBroad.setText("KBS");
		}
		if(rbMBC.isSelected()) {
			tfBroad.setText("MBC");
		}
	}
	
	private void fruitCheck() {
		
		tfFruit.setText("Nothing");										// 아무것도 체크안할때 순서중요
		
		if(cbApple.isSelected()) {										// apple 체크
			tfFruit.setText("Apple");
		}
		if(cbBanana.isSelected()) {										// banana 체크
			tfFruit.setText("Banana");
		}
		if(cbApple.isSelected() && cbBanana.isSelected()) {				// apple banana 둘다체
			tfFruit.setText("Apple & Banana");
		}
		
		
	}
	
	
	
	
	
	
}
