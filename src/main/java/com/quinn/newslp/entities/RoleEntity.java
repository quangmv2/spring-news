package com.quinn.newslp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.quinn.newslp.constants.TableName;

@Entity
@Table(name = "roles")
public class RoleEntity {
	
	@Column
	private String name;
}
