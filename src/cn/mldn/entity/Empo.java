package cn.mldn.entity;

import java.io.Serializable;
import java.util.Date;

public class Empo implements Serializable {

	private Integer empo;
	private String ename;
	private String job;
	private Date hiredate;
	private Double sal;
	private Double comm;
	public Integer getEmpo() {
		return empo;
	}
	public void setEmpo(Integer empo) {
		this.empo = empo;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	
}
