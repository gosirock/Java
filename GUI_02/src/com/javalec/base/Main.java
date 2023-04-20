package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfFirstNum;
	private JTextField tfSecondNum;
	private JTextField tfResult;
	private JLabel lblNew;
	private JLabel lblNewLabel_2_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnX;
	private JButton btnNewButton_1_1;

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
		setTitle("두개의 숫자 가감승제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum1());
		contentPane.add(getTfNum2());
		contentPane.add(getTfFirstNum());
		contentPane.add(getTfSecondNum());
		contentPane.add(getTfResult());
		contentPane.add(getLblNew());
		contentPane.add(getLblNewLabel_2_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnX());
		contentPane.add(getBtnNewButton_1_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자1:");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBounds(28, 32, 34, 30);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자2:");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(28, 87, 34, 30);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TextField에 숫자외의 문자가 입력되면 지우기
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
						
					}else {
						JOptionPane.showMessageDialog(null, "숫자만입력하세요","경고",JOptionPane.ERROR_MESSAGE);
						tfNum1.setText("");
					}
				}
			});
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(84, 34, 130, 28);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(84, 89, 130, 28);
		}
		return tfNum2;
	}
	private JTextField getTfFirstNum() {
		if (tfFirstNum == null) {
			tfFirstNum = new JTextField();
			tfFirstNum.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			tfFirstNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfFirstNum.setEditable(false);
			tfFirstNum.setColumns(10);
			tfFirstNum.setBounds(44, 145, 96, 28);
		}
		return tfFirstNum;
	}
	private JTextField getTfSecondNum() {
		if (tfSecondNum == null) {
			tfSecondNum = new JTextField();
			tfSecondNum.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			tfSecondNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSecondNum.setEditable(false);
			tfSecondNum.setColumns(10);
			tfSecondNum.setBounds(183, 145, 96, 28);
		}
		return tfSecondNum;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setEditable(false);
			tfResult.setColumns(10);
			tfResult.setBounds(328, 146, 96, 28);
		}
		return tfResult;
	}
	private JLabel getLblNew() {
		if (lblNew == null) {
			lblNew = new JLabel("+");
			lblNew.setForeground(new Color(255, 255, 255));
			lblNew.setBounds(156, 151, 15, 16);
		}
		return lblNew;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("=");
			lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_2_1.setBounds(291, 151, 15, 16);
		}
		return lblNewLabel_2_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("+");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("add");
				}
			});
			btnNewButton.setForeground(Color.RED);
			btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			btnNewButton.setBounds(283, 33, 54, 29);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("-");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("sub");
				}
			});
			btnNewButton_1.setForeground(Color.RED);
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			btnNewButton_1.setBounds(349, 34, 54, 29);
		}
		return btnNewButton_1;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("mul");
				}
			});
			btnX.setForeground(Color.BLUE);
			btnX.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			btnX.setBounds(283, 87, 54, 29);
		}
		return btnX;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("/");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("div");
				}
			});
			btnNewButton_1_1.setForeground(Color.BLUE);
			btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			btnNewButton_1_1.setBounds(349, 88, 54, 29);
		}
		return btnNewButton_1_1;
	}
	
	// Method
	
	private void calc(String part) {				// String part 글자구
		int num1 = Integer.parseInt(tfNum1.getText());
		int num2 = Integer.parseInt(tfNum2.getText());
		String result = "";
		
		Calc calc = new Calc(num1, num2);
		
		if(part.equals("add")) {					// 문자비교라 equals
			result = Integer.toString(calc.add());
			lblNew.setText("+");
		}else if(part.equals("sub")) {
			result = Integer.toString(calc.sub());
			lblNew.setText("-");
		}else if(part.equals("mul")) {
			result = Integer.toString(calc.mul());
			lblNew.setText("X");
		}else {
			try {
				lblNew.setText("/");
			result = String.format("%.2f",(double)calc.div());		// 더블값을 String.format으로 변경해서 다시 toString 할 필요없다
			}catch (Exception e) {
			result = "사용자가많음ㅋ";}
		}
		tfResult.setText(result);
		tfFirstNum.setText(tfNum1.getText());
		tfSecondNum.setText(tfNum2.getText());
	}
	
	
	
	
	
	
	
}	
