package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tfStartNum;
	private JTextField tfEndNum;
	private JTextField tfSum;
	private JRadioButton rbAll;
	private JRadioButton rbEven;
	private JRadioButton rbOdd;
	private JButton btnCalc;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setTitle("합계구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfStartNum());
		contentPane.add(getTfEndNum());
		contentPane.add(getTfSum());
		contentPane.add(getRbAll());
		contentPane.add(getRbEven());
		contentPane.add(getRbOdd());
		contentPane.add(getBtnCalc());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setBounds(44, 35, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setBounds(44, 91, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("합계");
			lblNewLabel_2.setBounds(44, 138, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfStartNum() {
		if (tfStartNum == null) {
			tfStartNum = new JTextField();
			tfStartNum.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					}else {JOptionPane.showMessageDialog(null, "숫자만입력하세요","경고",JOptionPane.ERROR_MESSAGE);
					tfStartNum.setText("");
				}
					
					
				}
			});
			tfStartNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfStartNum.setBounds(105, 30, 130, 26);
			tfStartNum.setColumns(10);
		}
		return tfStartNum;
	}
	private JTextField getTfEndNum() {
		if (tfEndNum == null) {
			tfEndNum = new JTextField();
			tfEndNum.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					}else {JOptionPane.showMessageDialog(null, "숫자만입력하세요","경고",JOptionPane.ERROR_MESSAGE);
					tfEndNum.setText("");
				}
				}
			});
			tfEndNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfEndNum.setColumns(10);
			tfEndNum.setBounds(105, 86, 130, 26);
		}
		return tfEndNum; 
	}
	private JTextField getTfSum() {
		if (tfSum == null) {
			tfSum = new JTextField();
			tfSum.setEditable(false);
			tfSum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSum.setColumns(10);
			tfSum.setBounds(115, 133, 130, 26);
		}
		return tfSum;
	}
	private JRadioButton getRbAll() {
		if (rbAll == null) {
			rbAll = new JRadioButton("전체");
			buttonGroup.add(rbAll);
			rbAll.setBounds(273, 31, 61, 23);
		}
		return rbAll;
	}
	private JRadioButton getRbEven() {
		if (rbEven == null) {
			rbEven = new JRadioButton("짝수");
			buttonGroup.add(rbEven);
			rbEven.setBounds(373, 31, 61, 23);
		}
		return rbEven;
	}
	private JRadioButton getRbOdd() {
		if (rbOdd == null) {
			rbOdd = new JRadioButton("홀수");
			buttonGroup.add(rbOdd);
			rbOdd.setBounds(468, 31, 61, 23);
		}
		return rbOdd;
	}
	private JButton getBtnCalc() {
		if (btnCalc == null) {
			btnCalc = new JButton("계산하기");
			btnCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Boolean check = checkField();				// 텍스트필드에 입력값 없을때 분류 및 오류출력
					if(check) {
						calculation();
					}else {JOptionPane.showMessageDialog(null, "숫자만입력하세요","경고",JOptionPane.ERROR_MESSAGE);
					tfEndNum.setText("");
					}
					
				}
			});
			btnCalc.setBounds(266, 86, 117, 29);
		}
		return btnCalc;
	}
	
	
	// -- Function
	
	private boolean checkField() {					// 버튼 눌렀을때 텍스트필드에 입력값이 있는지 체크
		boolean check;
		if(tfStartNum.getText().equals("") || tfEndNum.getText().equals("")) {
			check = false;
			
		}else {
			check = true;
		}
		return check;
	}
	
	private void calculation() {
		
		int num1 = Integer.parseInt(tfStartNum.getText());
		int num2 = Integer.parseInt(tfEndNum.getText());
		String select;
		
		
		if (rbOdd.isSelected()) select = "Odd";						// for나 if에서 한줄이면{} 안해도됨
		else if(rbEven.isSelected()) select = "Even";
		else if(rbAll.isSelected()) select = "All";
		else select = "";
		
		Calc calc;													// 입력값 1, 2 의 큰숫자를 뒤로가게 설정
		
		if(num1>num2) {
			calc = new Calc(num1, num2, select);
		}else {
			calc = new Calc(num2, num1, select);
		}
		
		
		tfSum.setText(Integer.toString(calc.action()));
		
	}
	
	
	
	
	
	
}
