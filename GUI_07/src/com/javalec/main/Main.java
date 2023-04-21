package com.javalec.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField tfFirst;
	private JTextField tfSecond;
	private JTextField tfResult;
	private JComboBox cBox;
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
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTfFirst());
		contentPane.add(getTfSecond());
		contentPane.add(getTfResult());
		contentPane.add(getCBox());
		contentPane.add(getBtnNewButton());
	}

	private JTextField getTfFirst() {
		if (tfFirst == null) {
			tfFirst = new JTextField();
			tfFirst.setHorizontalAlignment(SwingConstants.TRAILING);
			tfFirst.setBounds(16, 82, 130, 26);
			tfFirst.setColumns(10);
		}
		return tfFirst;
	}
	private JTextField getTfSecond() {
		if (tfSecond == null) {
			tfSecond = new JTextField();
			tfSecond.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSecond.setBounds(248, 82, 130, 26);
			tfSecond.setColumns(10);
		}
		return tfSecond;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setEditable(false);
			tfResult.setColumns(10);
			tfResult.setBounds(460, 82, 130, 26);
		}
		return tfResult;
	}
	private JComboBox getCBox() {
		if (cBox == null) {
			cBox = new JComboBox();
			cBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cboxAct();
					
				}
			});
			cBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
			cBox.setBounds(158, 83, 85, 27);
		}
		return cBox;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("=");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			btnNewButton.setBounds(377, 82, 71, 29);
		}
		return btnNewButton;
	}
	
	
	
	// function
	
	private void result() {
		int num1 = Integer.parseInt(tfFirst.getText());
		int num2 = Integer.parseInt(tfSecond.getText());
		String result;
		
		Calc calc = new Calc(num1, num2);
		String strCbox = cBox.getSelectedItem().toString();
		
		
		if(strCbox.equals("+")) {					
			result = Integer.toString(calc.add());
		}else if(strCbox.equals("-")) {
			result = Integer.toString(calc.sub());
		}else if(strCbox.equals("*")) {
			result = Integer.toString(calc.mul());
		}else {
			try {
			result = String.format("%.2f",(double)calc.div());		
			}catch (Exception e) {
			result = "사용자가많음ㅋ";}
		}
		
		tfResult.setText(result);
	}
	
	private void cboxAct() {
		int num1 = Integer.parseInt(tfFirst.getText());
		int num2 = Integer.parseInt(tfSecond.getText());
		String result;
		
		
		Calc calc = new Calc(num1, num2);
		String strCbox = cBox.getSelectedItem().toString();
		
		
		if(strCbox.equals("+")) {					// 문자비교라 equals
			result = Integer.toString(calc.add());
		}else if(strCbox.equals("-")) {
			result = Integer.toString(calc.sub());
		}else if(strCbox.equals("*")) {
			result = Integer.toString(calc.mul());
		}else {
			result = String.format("%.2f",(double)calc.div());		// 더블값을 String.format으로 변경해서 다시 toString 할 필요없다
			}
		
		tfResult.setText(result);
		
		
	
	}
	
	
	
}
