package com.br.java.locadora.locadoraLivrosApi.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "locations")
public class Location {

	@Id
    @SequenceGenerator(name = "user_id_generator", sequenceName = "user_id_seq")
    @GeneratedValue(generator = "user_id_generator")
	private Long id;
	
	@Column(nullable = false)
    private long id_user;
	
	@Column(nullable = false)
    private long id_book;
	
	@Column(nullable = false)
    private Date date_location;
	
	@Column(nullable = false)
    private Date date_removal;
	
	@Column(nullable = false)
    private Date date_devolution;
	
	@Column(nullable = false)
    private Date date_returned;
	
	@Column(nullable = false)
    private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getId_user() {
		return id_user;
	}

	public void setId_user(long id_user) {
		this.id_user = id_user;
	}

	public long getId_book() {
		return id_book;
	}

	public void setId_book(long id_book) {
		this.id_book = id_book;
	}

	public Date getDate_location() {
		return date_location;
	}

	public void setDate_location(Date date_location) {
		this.date_location = date_location;
	}

	public Date getDate_removal() {
		return date_removal;
	}

	public void setDate_removal(Date date_removal) {
		this.date_removal = date_removal;
	}

	public Date getDate_devolution() {
		return date_devolution;
	}

	public void setDate_devolution(Date date_devolution) {
		this.date_devolution = date_devolution;
	}

	public Date getDate_returned() {
		return date_returned;
	}

	public void setDate_returned(Date date_returned) {
		this.date_returned = date_returned;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
