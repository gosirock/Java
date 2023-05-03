package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.dto.Dto;
import com.javalec.util.ShareVar;

public class Dao {

	private final String url_mysql = ShareVar.DBName;
	private final String id_mysql = ShareVar.DBUser;
	private final String pw_mysql = ShareVar.DBPass;
	
	int seqno;
	String name;
	String telno;
	String address;
	String email;
	String relation;
	
	public Dao() {
		// TODO Auto-generated constructor stub
	}
	// 우클릭 -> 소스 -> 제너레이트컨스트럭트유저필드
	public Dao(int seqno, String name, String telno, String relation) {
		super();
		this.seqno = seqno;
		this.name = name;
		this.telno = telno;
		this.relation = relation;
	}
	
	// 초기화면 검색 결과를 Table에서 불러오자
	public ArrayList<Dto> selectList(){
		ArrayList<Dto> dtoList = new ArrayList<Dto>();
		
		String whereDefault = "select seqno, name, telno, relation from userinfo";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 데이터 연결 정의
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault);
			
			while(rs.next()) {	// 읽을데이터가 없으면 빠진다
				int wkSeq = rs.getInt(1);
				String wkName = rs.getString(2);
				String wkTelno = rs.getString(3);
				String wkRelation = rs.getString(4);
				
				Dto dto = new Dto(wkSeq, wkName, wkTelno, wkRelation);
				dtoList.add(dto);
			}
			
			conn_mysql.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return dtoList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
