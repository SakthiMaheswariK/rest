package com.database.newtable.sql;

public class newtable {
	private int S_no;
	private Long emp_code;
	private String  emp_name;
	private String father_name;
	private String  gender;
	private  int borndate;
	private int joining_date;

	public int getS_no() {
		return S_no;
	}
	public void setS_no(int s_no) {
		S_no = s_no;
	}
	public Long getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(Long emp_code) {
		this.emp_code = emp_code;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getBorndate() {
		return borndate;
	}
	public void setBorndate(int borndate) {
		this.borndate = borndate;
	}
	public int getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(int joining_date) {
		this.joining_date = joining_date;
	}
}



