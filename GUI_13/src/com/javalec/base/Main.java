package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jagalec.function.Bmi;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfHeight;
	private JTextField tfWeight;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JButton btnOK;
	private JLabel lbLast;
	private JLabel lbImage;

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
		setTitle("BMI계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfHeight());
		contentPane.add(getTfWeight());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1());
		contentPane.add(getBtnOK());
		contentPane.add(getLbLast());
		contentPane.add(getLbImage());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("키(신장):");
			lblNewLabel.setBounds(66, 43, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("몸무게:");
			lblNewLabel_1.setBounds(66, 89, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfHeight() {
		if (tfHeight == null) {
			tfHeight = new JTextField();
			tfHeight.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					
				}
			});
			tfHeight.setHorizontalAlignment(SwingConstants.TRAILING);
			tfHeight.setBounds(194, 38, 130, 26);
			tfHeight.setColumns(10);
		}
		return tfHeight;
	}
	private JTextField getTfWeight() {
		if (tfWeight == null) {
			tfWeight = new JTextField();
			tfWeight.setHorizontalAlignment(SwingConstants.TRAILING);
			tfWeight.setColumns(10);
			tfWeight.setBounds(194, 84, 130, 26);
		}
		return tfWeight;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("cm");
			lblNewLabel_2.setBounds(336, 43, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("kg");
			lblNewLabel_2_1.setBounds(336, 89, 61, 16);
		}
		return lblNewLabel_2_1;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("ok");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					bmiCalc();
				}
			});
			btnOK.setBounds(154, 139, 117, 29);
		}
		return btnOK;
	}
	private JLabel getLbLast() {
		if (lbLast == null) {
			lbLast = new JLabel("");
			lbLast.setHorizontalAlignment(SwingConstants.CENTER);
			lbLast.setBounds(36, 210, 360, 16);
		}
		return lbLast;
	}
	public JLabel getLbImage() {
		if (lbImage == null) {
			lbImage = new JLabel("");
			lbImage.setBounds(441, 6, 131, 339);
		}
		return lbImage;
	}

//  --Function
	
	private void bmiCalc() {
		
		int height = Integer.parseInt(tfHeight.getText()); 
		int weight = Integer.parseInt(tfWeight.getText()); 
		
		Bmi bmi = new Bmi(height, weight);
		
		lbLast.setText(bmi.clac());

}
	
	
}