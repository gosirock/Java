package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfFirstNum;
	private JTextField tfSecondNum;
	private JLabel lblNewLabel_1;
	private JButton btnAddition;
	private JTextField tfResult;
	private JLabel lblNewLabel_1_1;
	private JButton btnSub;
	private JButton btnSubtraction;

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
		setTitle("덧셈과 뺄셈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfFirstNum());
		contentPane.add(getTfSecondNum());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnAddition());
		contentPane.add(getTfResult());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getBtnSubtraction());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자 1 :");
			lblNewLabel.setBounds(34, 37, 42, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfFirstNum() {
		if (tfFirstNum == null) {
			tfFirstNum = new JTextField();
			tfFirstNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfFirstNum.setBounds(87, 32, 98, 26);
			tfFirstNum.setColumns(10);
		}
		return tfFirstNum;
	}
	private JTextField getTfSecondNum() {
		if (tfSecondNum == null) {
			tfSecondNum = new JTextField();
			tfSecondNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSecondNum.setColumns(10);
			tfSecondNum.setBounds(87, 75, 98, 26);
		}
		return tfSecondNum;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자 2 :");
			lblNewLabel_1.setBounds(34, 80, 42, 16);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnAddition() {
		if (btnAddition == null) {
			btnAddition = new JButton("Addition");
			btnAddition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("add");
				}
			});
			btnAddition.setBounds(197, 32, 103, 29);
		}
		return btnAddition;
	}
	private JButton getBtnSubtraction() {
		if (btnSubtraction == null) {
			btnSubtraction = new JButton("Subtration");
			btnSubtraction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("sub");
				}
			});
			btnSubtraction.setBounds(197, 73, 103, 29);
		}
		return btnSubtraction;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setColumns(10);
			tfResult.setBounds(87, 119, 194, 26);
		}
		return tfResult;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("결과 :");
			lblNewLabel_1_1.setBounds(34, 124, 42, 16);
		}
		return lblNewLabel_1_1;
	}
		
	// --- Functions -----
		
	
	
	
	
//		private void addition() {
//			int num1 = Integer.parseInt(tfFirstNum.getText());
//			int num2 = Integer.parseInt(tfSecondNum.getText());
//			
//			Calc calc = new Calc(num1, num2);
//			String result = Integer.toString(calc.add());
//			tfResult.setText(result);
//			}
//		
//		private void subtration() {
//			int num1 = Integer.parseInt(tfFirstNum.getText());
//			int num2 = Integer.parseInt(tfSecondNum.getText());
//			
//			Calc calc = new Calc(num1, num2);
//			String result = Integer.toString(calc.sub());
//			tfResult.setText(result); 
//		}
		
		private void calc(String part) {				// String part 글자구
			int num1 = Integer.parseInt(tfFirstNum.getText());
			int num2 = Integer.parseInt(tfSecondNum.getText());
			String result = "";
			Calc calc = new Calc(num1, num2);
			
			if(part.equals("add")) {					// 문자비교라 equals
				result = Integer.toString(calc.add());
			}else {
				result = Integer.toString(calc.sub());
			}
			tfResult.setText(result);
		}
		
	
}
