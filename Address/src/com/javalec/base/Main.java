package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javalec.dao.Dao;
import com.javalec.dto.Dto;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JRadioButton rbInsert;
	private JRadioButton rbUpdate;
	private JRadioButton rbDelete;
	private JRadioButton rbQuery;
	private JComboBox cbSelcetion;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfSelcetion;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable innerTable;
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
	private JTextField tfRelation;
	private JLabel lblNewLabel_4_1;
	private JButton btnOk;
	private JLabel lblCount;
	private JTextField tfCount;
	
	// Table
	private final DefaultTableModel outerTable = new DefaultTableModel();
	
	String message = "";
	
	
	
	
	
	
	

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
				tableInit();	// 첫화면 초기화
				serchActeion(); // 데이터 불러오기
				screenPartition();
			}
		});
		setTitle("주소록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getRbInsert());
		contentPane.add(getRbUpdate());
		contentPane.add(getRbDelete());
		contentPane.add(getRbQuery());
		contentPane.add(getCbSelcetion());
		contentPane.add(getTfSelcetion());
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
		contentPane.add(getTfRelation());
		contentPane.add(getLblNewLabel_4_1());
		contentPane.add(getBtnOk());
		contentPane.add(getLblCount());
		contentPane.add(getTfCount());
	}
	private JRadioButton getRbInsert() {
		if (rbInsert == null) {
			rbInsert = new JRadioButton("입력");
			rbInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			buttonGroup.add(rbInsert);
			rbInsert.setBounds(36, 22, 54, 23);
		}
		return rbInsert;
	}
	private JRadioButton getRbUpdate() {
		if (rbUpdate == null) {
			rbUpdate = new JRadioButton("수정");
			rbUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			buttonGroup.add(rbUpdate);
			rbUpdate.setBounds(94, 22, 54, 23);
		}
		return rbUpdate;
	}
	private JRadioButton getRbDelete() {
		if (rbDelete == null) {
			rbDelete = new JRadioButton("삭제");
			rbDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
					
				}
			});
			buttonGroup.add(rbDelete);
			rbDelete.setBounds(152, 22, 54, 23);
		}
		return rbDelete;
	}
	private JRadioButton getRbQuery() {
		if (rbQuery == null) {
			rbQuery = new JRadioButton("검색");
			rbQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			rbQuery.setSelected(true);
			buttonGroup.add(rbQuery);
			rbQuery.setBounds(210, 22, 54, 23);
		}
		return rbQuery;
	}
	private JComboBox getCbSelcetion() {
		if (cbSelcetion == null) {
			cbSelcetion = new JComboBox();
			cbSelcetion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
				}
			});
			cbSelcetion.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelcetion.setBounds(36, 62, 91, 29);
		}
		return cbSelcetion;
	}
	private JTextField getTfSelcetion() {
		if (tfSelcetion == null) {
			tfSelcetion = new JTextField();
			tfSelcetion.setBounds(134, 62, 255, 29);
			tfSelcetion.setColumns(10);
		}
		return tfSelcetion;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQueryAction();
				
				}
			});
			btnQuery.setBounds(401, 62, 74, 29);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(36, 109, 439, 142);
			scrollPane.setViewportView(getInnerTable());
		}
		return scrollPane;
	}
	private JTable getInnerTable() {
		if (innerTable == null) {
			innerTable = new JTable();
			innerTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();
				}
			});
			// singletable 정의
			innerTable.setModel(outerTable);
		}
		return innerTable;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("seq No :");
			lblNewLabel.setBounds(36, 261, 54, 23);
		}
		return lblNewLabel;
	}
	private JTextField getTfSeqNo() {
		if (tfSeqNo == null) {
			tfSeqNo = new JTextField();
			tfSeqNo.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSeqNo.setEditable(false);
			tfSeqNo.setBounds(110, 262, 48, 21);
			tfSeqNo.setColumns(10);
		}
		return tfSeqNo;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 :");
			lblNewLabel_1.setBounds(36, 294, 54, 23);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(110, 295, 125, 21);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 :");
			lblNewLabel_2.setBounds(36, 327, 62, 23);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setColumns(10);
			tfTelno.setBounds(110, 328, 202, 21);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 :");
			lblNewLabel_3.setBounds(36, 360, 54, 23);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(110, 361, 298, 21);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 :");
			lblNewLabel_4.setBounds(36, 393, 62, 23);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(110, 394, 298, 21);
		}
		return tfEmail;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(110, 427, 298, 21);
		}
		return tfRelation;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("관계 :");
			lblNewLabel_4_1.setBounds(36, 426, 54, 23);
		}
		return lblNewLabel_4_1;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPartition();
					
				}
			});
			btnOk.setEnabled(false);
			btnOk.setBounds(401, 461, 74, 27);
		}
		return btnOk;
	}
	private JLabel getLblCount() {
		if (lblCount == null) {
			lblCount = new JLabel("Count :");
			lblCount.setBounds(361, 261, 54, 23);
		}
		return lblCount;
	}
	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setHorizontalAlignment(SwingConstants.TRAILING);
			tfCount.setEditable(false);
			tfCount.setColumns(10);
			tfCount.setBounds(427, 262, 48, 21);
		}
		return tfCount;
	}
	// ------- Function ---------
	
	// 화면의 Table 정리
	private void tableInit() {
		outerTable.addColumn("순서");
		outerTable.addColumn("이름");
		outerTable.addColumn("전화번호");
		outerTable.addColumn("관계");
		outerTable.setColumnCount(4);

		int i = outerTable.getRowCount();
		for (int j = 0; j < i; j++) {
			outerTable.removeRow(0); // 0을 쓰는이유는 지울때마다 데이터가 올라와서 0번자리를 차지한다.
		}

		innerTable.setAutoResizeMode(innerTable.AUTO_RESIZE_OFF);

		int vColIndex = 0; // 버티컬컬럼인덱스
		TableColumn col = innerTable.getColumnModel().getColumn(vColIndex);
		int width = 30; // 폭 설정
		col.setPreferredWidth(width);

		vColIndex = 1; // 버티컬컬럼인덱스
		col = innerTable.getColumnModel().getColumn(vColIndex);
		width = 80; // 폭 설정
		col.setPreferredWidth(width);

		vColIndex = 2; // 버티컬컬럼인덱스
		col = innerTable.getColumnModel().getColumn(vColIndex);
		width = 150; // 폭 설정
		col.setPreferredWidth(width);

		vColIndex = 3; // 버티컬컬럼인덱스
		col = innerTable.getColumnModel().getColumn(vColIndex);
		width = 150; // 폭 설정
		col.setPreferredWidth(width);
	}
	
	// DB의 Table에서 화면의 Table에 들어갈 정보 가져오기
	private void serchActeion() {
		Dao dao = new Dao();
		ArrayList<Dto> dtoList = dao.selectList();
		int listCount = dtoList.size();
		
		for(int i = 0; i < listCount; i++) {
			String temp = Integer.toString(dtoList.get(i).getSeqno());		// 2차원이라.두개로 빼오기
			String[] qTxt = {temp, dtoList.get(i).getName(), dtoList.get(i).getTelno(), 
					dtoList.get(i).getRelation()};
			outerTable.addRow(qTxt); 	// 테이블에 값 넣기
		
		
		}
		tfCount.setText(Integer.toString(listCount));
	}
	// 테이블 클릭
	private void tableClick() {
		
		int i = innerTable.getSelectedRow();			// 줄수 알려주기
		String wkSequence = (String) innerTable.getValueAt(i, 0);
		int wkSeqno = Integer.parseInt(wkSequence);  // 다우에 스퀀스넘버 보내기
		
		Dao dao = new Dao(wkSeqno);
		Dto dto = dao.tableClick();
		
		tfSeqNo.setText(Integer.toString(dto.getSeqno()));
		tfName.setText(dto.getName());
		tfTelno.setText(dto.getTelno());
		tfAddress.setText(dto.getAddress());
		tfEmail.setText(dto.getEmail());
		tfRelation.setText(dto.getRelation());
		
		if(rbUpdate.isSelected()){
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);
			btnOk.setVisible(true);	
			btnOk.setEnabled(true);
		}
		
		if(rbDelete.isSelected()) {
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
			btnOk.setVisible(true);	
			btnOk.setEnabled(true);
		}
		
		
		}
		
	
	// screenPartition
	
	private void screenPartition() {
		// 검색의 경우
		if(rbQuery.isSelected()) {
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
			btnOk.setVisible(false);
		}
		
		// 입력의 경우
		if(rbInsert.isSelected()) {
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);
			btnOk.setVisible(true);	
			btnOk.setEnabled(true);
		}
		// 수정이나삭제인경
			if(rbUpdate.isSelected() || rbDelete.isSelected() ) {
				tfName.setEditable(false);
				tfTelno.setEditable(false);
				tfAddress.setEditable(false);
				tfEmail.setEditable(false);
				tfRelation.setEditable(false);
				btnOk.setVisible(true);	
				btnOk.setEnabled(false);
			}
				
	}
	
	// ok버튼
	private void actionPartition() {
		// 입력인 경우
		if(rbInsert.isSelected()) {
			insertFieldCheck();
			int i_chk = insertFieldCheck();
			if(i_chk == 0) {
				insertAction();
				tableInit();
				serchActeion();
				clearColumn();
				
			}else {
				JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + message + "확인하세요!");
			}
		}
		// 수정인 경우
			if(rbUpdate.isSelected()) {
				insertFieldCheck();
				int i_cnk = insertFieldCheck();
				if(i_cnk == 0) {
					updateAction();
					tableInit();
					serchActeion();
					clearColumn();
				}
				else {
					JOptionPane.showMessageDialog(this, "주소록 정보 수정!\n" + message + "확인하세요!");
				}
			}
		// 삭제인 경우
			if(rbDelete.isSelected()) {
				insertFieldCheck();
				int i_cnk = insertFieldCheck();
				if(i_cnk == 0) {
					deleteAction();
					tableInit();
					serchActeion();
					clearColumn();
				}
				else {
					JOptionPane.showMessageDialog(this, "주소록 정보 삭제!\n" + message + "확인하세요!");
			}
			}
	}
		
	private int insertFieldCheck() {
		int i = 0;
		
		if(tfName.getText().trim().length() == 0) {			 // 공백없애기 위해 trim 필수
			i++;
			message = "이름을 ";
			tfName.requestFocus();
		}
		if(tfTelno.getText().trim().length() == 0) {
			i++;
			message = "전화번호를 ";
			tfTelno.requestFocus();
		}
		if(tfAddress.getText().trim().length() == 0) {
			i++;
			message = "주소를 ";
			tfAddress.requestFocus();
		}
		if(tfEmail.getText().trim().length() == 0) {
			i++;
			message = "전자우편을 ";
			tfEmail.requestFocus();
		}
		if(tfRelation.getText().trim().length() == 0) {
			i++;
			message = "관계를 ";
			tfRelation.requestFocus();
		}
		
		
		
		return i;
	}

	private void clearColumn() {
		tfSeqNo.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
	}	
	
	
	private void insertAction() {
		String name = tfName.getText();
		String telno = tfTelno.getText();
		String address = tfAddress.getText();
		String email = tfEmail.getText();
		String relation = tfRelation.getText();
		
		Dao dao = new Dao(name, telno, address, email, relation);
		boolean result = dao.insertAction();
		
		if(result) {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + tfName.getText() + "님의 정보가 입력 되었습니다.","주소록 정보", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + "입력중 문제가 발생했습니다. \n관리자에게 문의하세요!", "주소록 정보", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	// 수정
	private void updateAction() {
		String name = tfName.getText();
		String telno = tfTelno.getText();
		String address = tfAddress.getText();
		String email = tfEmail.getText();
		String relation = tfRelation.getText();
		String wkequence = tfSeqNo.getText();
		int wkSeqno = Integer.parseInt(wkequence);
		
		Dao dao = new Dao(wkSeqno, name, telno, address, email, relation);
		boolean result = dao.updateAction();
		
		if(result) {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + tfName.getText() + "님의 정보가 변경 되었습니다.","주소록 정보", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + "입력중 문제가 발생했습니다. \n관리자에게 문의하세요!", "주소록 정보", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void deleteAction() {
		
		String wkequence = tfSeqNo.getText();
		int wkSeqno = Integer.parseInt(wkequence);
		
		Dao dao = new Dao(wkSeqno);
		boolean result = dao.deleteAction();
		
		if(result) {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + tfName.getText() + "님의 정보가 삭제 되었습니다.","주소록 정보", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + "입력중 문제가 발생했습니다. \n관리자에게 문의하세요!", "주소록 정보", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void conditionQuery() {
		int i = cbSelcetion.getSelectedIndex();
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

	private void conditionQueryAction(String conditionQueryColumn) {
		Dao dao = new Dao(conditionQueryColumn, tfSelcetion.getText());
		ArrayList<Dto> dtoList = dao.conditionList();
		int listCount = dtoList.size();
		
		for(int i = 0; i < listCount; i++) {
			String temp = Integer.toString(dtoList.get(i).getSeqno());		// 2차원이라.두개로 빼오기
			String[] qTxt = {temp, dtoList.get(i).getName(), dtoList.get(i).getTelno(), 
					dtoList.get(i).getRelation()};
			outerTable.addRow(qTxt); 	// 테이블에 값 넣기
		
	}
	}
}