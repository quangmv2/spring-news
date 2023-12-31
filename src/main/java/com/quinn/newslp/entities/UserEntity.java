package com.quinn.newslp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.quinn.newslp.constants.TableName;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

	@Column(name = "full_name")
	private String fullName;

	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String email;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
