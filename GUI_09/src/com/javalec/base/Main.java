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
	private JTextField tfTotalNum;
	private JRadioButton rbTotal;
	private JRadioButton rbEven;
	private JRadioButton rbOdd;
	private JButton btCalc;
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
		contentPane.add(getTfTotalNum());
		contentPane.add(getRbTotal());
		contentPane.add(getRbEven());
		contentPane.add(getRbOdd());
		contentPane.add(getBtCalc());
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
	private JTextField getTfTotalNum() {
		if (tfTotalNum == null) {
			tfTotalNum = new JTextField();
			tfTotalNum.setEditable(false);
			tfTotalNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfTotalNum.setColumns(10);
			tfTotalNum.setBounds(115, 133, 130, 26);
		}
		return tfTotalNum;
	}
	private JRadioButton getRbTotal() {
		if (rbTotal == null) {
			rbTotal = new JRadioButton("전체");
			buttonGroup.add(rbTotal);
			rbTotal.setBounds(273, 31, 61, 23);
		}
		return rbTotal;
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
	private JButton getBtCalc() {
		if (btCalc == null) {
			btCalc = new JButton("계산하기");
			btCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcPush();
					
				}
			});
			btCalc.setBounds(266, 86, 117, 29);
		}
		return btCalc;
	}
	
	
	// -- Function
	
	
	private void calcPush() {
		
		int num1 = Integer.parseInt(tfStartNum.getText());
		int num2 = Integer.parseInt(tfEndNum.getText());
		String select;
		
		if (rbOdd.isSelected()) {
			select = "홀수";
		}else if(rbEven.isSelected()) {
			select = "짝수";
		}else if(rbTotal.isSelected()) {
			select = "전체";
		}else {
			select = "선택";
		}
		
		
		Calc calc = new Calc(num1, num2, select);
		
		tfTotalNum.setText(Integer.toString(calc.sum()));
		
	}
	
	
	
	
	
}
