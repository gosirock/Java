package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Sum;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField tfStart;
	private JTextField tfEnd;
	private JTextField tfSum;
	private JButton btnSum;

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
		setTitle("범위의 숫자 합계 구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTfStart());
		contentPane.add(getTfEnd());
		contentPane.add(getTfSum());
		contentPane.add(getBtnSum());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			lblNewLabel.setBounds(43, 37, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(43, 89, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("합계");
			lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			lblNewLabel_1_1.setBounds(243, 90, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfStart() {
		if (tfStart == null) {
			tfStart = new JTextField();
			tfStart.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
						if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
						
					}else {
						JOptionPane.showMessageDialog(null, "숫자만입력하세요","경고",JOptionPane.ERROR_MESSAGE);
						tfStart.setText("");
					}
				}
			});
			tfStart.setHorizontalAlignment(SwingConstants.TRAILING);
			tfStart.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			tfStart.setBounds(116, 33, 109, 26);
			tfStart.setColumns(10);
		}
		return tfStart;
	}
	private JTextField getTfEnd() {
		if (tfEnd == null) {
			tfEnd = new JTextField();
			tfEnd.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
						if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
						
					}else {
						JOptionPane.showMessageDialog(null, "숫자만입력하세요","경고",JOptionPane.ERROR_MESSAGE);
						tfEnd.setText("");
					}
				}
			});
			tfEnd.setHorizontalAlignment(SwingConstants.TRAILING);
			tfEnd.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			tfEnd.setColumns(10);
			tfEnd.setBounds(116, 85, 109, 26);
		}
		return tfEnd;
	}
	private JTextField getTfSum() {
		if (tfSum == null) {
			tfSum = new JTextField();
			tfSum.setEditable(false);
			tfSum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSum.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			tfSum.setColumns(10);
			tfSum.setBounds(316, 85, 109, 26);
		}
		return tfSum;
	}
	private JButton getBtnSum() {
		if (btnSum == null) {
			btnSum = new JButton("합계 구하기");
			btnSum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sum();
				}
			});
			btnSum.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			btnSum.setBounds(243, 33, 141, 29);
		}
		return btnSum;
	}
	
	
	// 
	
	private void sum() {
		
		int num1 = Integer.parseInt(tfStart.getText()); 
		int num2 = Integer.parseInt(tfEnd.getText()); 
		
//		String num1 = tfStart.getText();
//		String num2 = tfEnd.getText();
		
		Sum sum = new Sum(num1, num2);
		String result = "";
		
		result = Integer.toString(sum.sum());
		tfSum.setText(result);
		
	}
	
	
	
}
