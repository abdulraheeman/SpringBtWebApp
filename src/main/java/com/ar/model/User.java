package com.ar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "user")
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	@NotEmpty(message = "please provide name")
	private String name;
	@Column(name = "email")
	@Email(message = "please enter valid email")
	@NotEmpty(message = "please provide email")
	private String email;
	@Column(name = "password")
	@Length(min = 5, message = "please enter password atleast 5 characters")
	@NotEmpty(message = "please provide password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
