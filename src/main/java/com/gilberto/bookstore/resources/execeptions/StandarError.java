package com.gilberto.bookstore.resources.execeptions;

public class StandarError {

	private Long timetamp;
	private Integer status;
	private String error;
	
	
	public StandarError() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StandarError(Long timetamp, Integer status, String error) {
		super();
		this.timetamp = timetamp;
		this.status = status;
		this.error = error;
	}


	public Long getTimetamp() {
		return timetamp;
	}


	public void setTimetamp(Long timetamp) {
		this.timetamp = timetamp;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}
	
	

}
