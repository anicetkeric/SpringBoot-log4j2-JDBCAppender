package com.logging.aek.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
public class Logs {

	   
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(columnDefinition = "serial")
	  private Long eventId;
	
	
	private String level;
	 @Temporal(TemporalType.TIMESTAMP)
	private Date eventDate; 

	 @Column(columnDefinition = "TEXT")
	 private String throwable; 
	 

	 @Column(columnDefinition = "TEXT")
	 private String message; 

	 @Column(columnDefinition = "TEXT")
	 private String logger;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getThrowable() {
		return throwable;
	}

	public void setThrowable(String throwable) {
		this.throwable = throwable;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLogger() {
		return logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	} 
	 
	
}
