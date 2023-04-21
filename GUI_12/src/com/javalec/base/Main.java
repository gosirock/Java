package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JButton btnInput;
	private JLabel lbData;

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				checkStatus();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnInput());
		contentPane.add(getLbData());
	}

	private JButton getBtnInput() {
		if (btnInput == null) {
			btnInput = new JButton("사용자 등록");
			btnInput.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input();
				}
			});
			btnInput.setBounds(153, 99, 117, 29);
		}
		return btnInput;
	}
	
	private JLabel getLbData() {
		if (lbData == null) {
			lbData = new JLabel("");
			lbData.setBounds(44, 195, 350, 16);
		}
		return lbData;

	
	}


		// --Function

	private void input() {
		
		Input input = new Input();
		input.setVisible(true);
		dispose();
		
	}

	private void checkStatus() {							// 창이 떳을때 액션
		if (!DataIn.dataIn.equals(""));{					// 스태틱 데이터가 빈게 아니면
			lbData.setText(DataIn.dataIn);					// 라벨에 출력
			DataIn.dataIn = "";								// 다시갈경우 대비 지우기					
		}
		
		
	}


}
