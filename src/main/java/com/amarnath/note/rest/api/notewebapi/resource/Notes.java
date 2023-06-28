package com.amarnath.note.rest.api.notewebapi.resource;

import java.util.Date;

public class Notes {
	
	private long id;
	private String username;
	private String tital;
	private String description;
	private Date date;
	
	public Notes() {
		
	}
	
	public Notes(long id, String username, String tital, String description, Date date) {
		super();
		this.id = id;
		this.username = username;
		this.tital = tital;
		this.description = description;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTital() {
		return tital;
	}

	public void setTital(String tital) {
		this.tital = tital;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", username=" + username + ", tital=" + tital + ", description=" + description
				+ ", date=" + date + "]";
	}
	
	
	
}
