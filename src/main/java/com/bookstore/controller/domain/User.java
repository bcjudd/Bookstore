package com.bookstore.controller.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private boolean enabled=true;
	
}
