package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	private JLabel lblNewLabel;
	private JTextField tfSeqNo;
	private JLabel lblNewLabel_1;
	private JTextField tfName;
	private JLabel lblNewLabel_2;
	private JTextField tfTelno;
	private JLabel lblNewLabel_3;
	private JTextField tfAddress;
	private JLabel lblNewLabel_4;
	private JTextField tfEmail;
	private JLabel lblNewLabel_5;
	private JTextField tfRelation;

	// Database & Table 환경 정의
		private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";	// 127.0.0.1 은 내 로컬 주소 
		private final String id_mysql = "root";
		private final String pw_mysql = "qwer1234";
		private final DefaultTableModel Outer_Table = new DefaultTableModel();	// 테이블은 아웃터와 이너가 합쳐야한다 
		private JButton btnUpdate;
		private JButton btnDelete;
		private JButton btnInsert;
	
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
			public void windowOpened(WindowEvent e) {
				tableInit();	// 테이블 디자인만들구
				searchAction();// 데이터 가져오
				
			}
		});
		setTitle("주소록 수정 및 삭제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCbSelection());
		contentPane.add(getTfSelection());
		contentPane.add(getBtnQuery());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfSeqNo());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfName());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfTelno());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTfAddress());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getTfEmail());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTfRelation());
		contentPane.add(getBtnUpdate());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnInsert());
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(22, 6, 95, 27);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(129, 5, 221, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					conditionQuery();
				}
			});
			btnQuery.setBounds(362, 5, 117, 29);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(32, 56, 429, 183);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnUpdate.setEnabled(true);
					btnDelete.setEnabled(true);
					tableClick();
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table.setModel(Outer_Table);   // <<<<<<<<<<<<< 아웃터테이블과 이너테이블 연결
		}
		return Inner_Table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("equence No");
			lblNewLabel.setBounds(33, 264, 74, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfSeqNo() {
		if (tfSeqNo == null) {
			tfSeqNo = new JTextField();
			tfSeqNo.setEditable(false);
			tfSeqNo.setBounds(138, 259, 55, 26);
			tfSeqNo.setColumns(10);
		}
		return tfSeqNo;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름");
			lblNewLabel_1.setBounds(33, 306, 74, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(138, 301, 130, 26);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호");
			lblNewLabel_2.setBounds(33, 344, 74, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setColumns(10);
			tfTelno.setBounds(138, 339, 165, 26);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소");
			lblNewLabel_3.setBounds(33, 382, 74, 16);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(138, 377, 323, 26);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편");
			lblNewLabel_4.setBounds(33, 415, 74, 16);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(138, 410, 230, 26);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계");
			lblNewLabel_5.setBounds(33, 448, 74, 16);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(138, 443, 324, 26);
		}
		return tfRelation;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정");
			btnUpdate.setEnabled(false);
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					updateAction();
					btnUpdate.setEnabled(false);
					btnDelete.setEnabled(false);
				
				}
			});
			btnUpdate.setBounds(186, 481, 117, 29);
		}
		return btnUpdate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.setEnabled(false);
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					deleteAction();
					btnUpdate.setEnabled(false);
					btnDelete.setEnabled(false);
				}
			});
			btnDelete.setForeground(new Color(235, 21, 25));
			btnDelete.setBackground(new Color(255, 81, 38));
			btnDelete.setBounds(340, 481, 117, 29);
		}
		return btnDelete;
	}
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton("입력");
			btnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					insertAction();
				}
			});
			btnInsert.setBounds(43, 481, 117, 29);
		}
		return btnInsert;
	}
	// --- Functions
	
	private void tableInit() {		// 화면의 Table 정리
		Outer_Table.addColumn("순서");
		Outer_Table.addColumn("이름");
		Outer_Table.addColumn("전화번호");
		Outer_Table.addColumn("관계");
		Outer_Table.setColumnCount(4);
		
		int i = Outer_Table.getRowCount();
		for(int j=0; j<i; j++) {
			Outer_Table.removeRow(0);  	// 0을 쓰는이유는 지울때마다 데이터가 올라와서 0번자리를 차지한다.
		}
		
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
		
		int vColIndex = 0;	// 버티컬컬럼인덱스	
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 30;	// 폭 설정
		col.setPreferredWidth(width);
		
		vColIndex = 1;	// 버티컬컬럼인덱스	
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;	// 폭 설정
		col.setPreferredWidth(width);
		
		vColIndex = 2;	// 버티컬컬럼인덱스	
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 150;	// 폭 설정
		col.setPreferredWidth(width);
		
		vColIndex = 3;	// 버티컬컬럼인덱스	
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200;	// 폭 설정
		col.setPreferredWidth(width);
	}
	
	// DB의 Table에서 화면의 Table에 들어갈 정보 가져오기
	private void searchAction() {
		String whereDefault = "select seqno, name, telno, relation from userinfo";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 데이터 연결 정의
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault);
			
			while(rs.next()) {	// 읽을데이터가 없으면 빠진다
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)}; //하나의 로우 한번에 넣어야되서 배열필
				Outer_Table.addRow(qTxt);
			}
			
			conn_mysql.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	private void tableClick() {
		int i = Inner_Table.getSelectedRow();			// 줄수 알려주기
//		System.out.println("Row ==>" + i );			// 줄수확인
		String wkSequence = (String) Inner_Table.getValueAt(i, 0);
//		System.out.println("Seq no =>" + wkSequence);
		String whereDefault = "select seqno, name, telno, address, email, relation from userinfo";
		String whereDefault1 = " where seqno = ";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 데이터 연결 정의
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault + whereDefault1 + wkSequence);
			
			while(rs.next()) {	// 읽을데이터가 없으면 빠진다
				tfSeqNo.setText(rs.getString(1));
				tfName.setText(rs.getString(2));
				tfTelno.setText(rs.getString(3));
				tfAddress.setText(rs.getString(4));
				tfEmail.setText(rs.getString(5));
				tfRelation.setText(rs.getString(6));
			}
			
			conn_mysql.close();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String conditionQueryColumn = "";
		switch(i) {
		case 0:
			conditionQueryColumn = "name";
			break;
		case 1:
			conditionQueryColumn = "address";
			break;
		case 2:
			conditionQueryColumn = "relation";
			break;
		default:
			break;
		}
		
		tableInit();
		clearColumn();
		conditionQueryAction(conditionQueryColumn);
	}
	
	private void clearColumn() {
		tfSeqNo.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
	}
	
	private void conditionQueryAction(String conditionQueryColumn) {
		String whereDefault = "select seqno, name, telno, relation from userinfo";
		String whereDefault1 = " where " + conditionQueryColumn + " like '%" + tfSelection.getText() + "%'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 데이터 연결 정의
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault + whereDefault1);
			
			while(rs.next()) {	// 읽을데이터가 없으면 빠진다
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)}; //하나의 로우 한번에 넣어야되서 배열필
				Outer_Table.addRow(qTxt);
			}
			
			conn_mysql.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	private void deleteAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 데이터 연결 정의
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "delete from userinfo seqno";	// 입력정의
			String query1 = " where seqno = ?";	// ?를 해결하는게 PreparedStatement 이다
			
//			String query = "delete from userinfo where seqno = ?";   강사님이하신것
			
			ps = conn_mysql.prepareStatement(query + query1);	// 데이터값 넣기
			ps.setInt(1, Integer.parseInt(tfSeqNo.getText().trim()));

			ps.executeUpdate(); 
			conn_mysql.close();
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 삭제 되었습니다.");
			
			clearColumn();
			tableInit();
			searchAction();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	private void updateAction(){
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 데이터 연결 정의
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "update userinfo set name = ?, telno = ?, address = ?,"
					+ " email = ?, relation = ?";	// 입력정의
			String query1 = " where seqno = ?";	// ?를 해결하는게 PreparedStatement 이다
			
			ps = conn_mysql.prepareStatement(query + query1);	// 데이터값 넣기
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelno.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			ps.setInt(6, Integer.parseInt(tfSeqNo.getText().trim()));

	
			ps.executeUpdate();  //실행
			conn_mysql.close();
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 수정 되었습니다.");
			
			clearColumn();
			tableInit();
			searchAction();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void insertAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 데이터 연결 정의
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "insert into userinfo (name, telno, address, email, relation) ";
			String query1 = " values (?, ?, ?, ?, ?)";	// ?를 해결하는게 PreparedStatement 이다
			
			ps = conn_mysql.prepareStatement(query + query1);	// 데이터값 넣기
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelno.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());

	
			ps.executeUpdate();  //실행
			conn_mysql.close();
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입 되었습니다.");
			
			clearColumn();
			tableInit();
			searchAction();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
