package com.src;

public class Student {

	private int stdid;
	private String stdname;
	private long stdmobileno;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdid, String stdname, long stdmobileno) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmobileno = stdmobileno;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public long getStdmobileno() {
		return stdmobileno;
	}
	public void setStdmobileno(long stdmobileno) {
		this.stdmobileno = stdmobileno;
	}
	
	
}
