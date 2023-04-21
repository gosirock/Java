package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.crypto.Data;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Input extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfID;
	private JTextField tfPassword;
	private JTextField tfName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Input dialog = new Input();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Input() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("User Id :");
			lblNewLabel.setBounds(93, 56, 61, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setBounds(93, 106, 61, 16);
			contentPanel.add(lblPassword);
		}
		{
			JLabel lblName = new JLabel("Name");
			lblName.setBounds(93, 149, 61, 16);
			contentPanel.add(lblName);
		}
		{
			tfID = new JTextField();
			tfID.setBounds(198, 51, 187, 26);
			contentPanel.add(tfID);
			tfID.setColumns(10);
		}
		{
			tfPassword = new JTextField();
			tfPassword.setColumns(10);
			tfPassword.setBounds(198, 101, 187, 26);
			contentPanel.add(tfPassword);
		}
		{
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(198, 144, 187, 26);
			contentPanel.add(tfName);
		}
		{
			JButton btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					maincall();
				}
			});
			btnOK.setBounds(166, 199, 117, 29);
			contentPanel.add(btnOK);
		}
	}

	
	
	// Function
	
	
	private void maincall() {
		
		
		DataIn.dataIn = ("ID: "+tfID.getText()+"\tPassword :"+tfPassword.getText()+"\tName :"+tfName.getText());
		
		Main main = new Main();
		main.setVisible(true);
		dispose();
		
	}
	
	
}
