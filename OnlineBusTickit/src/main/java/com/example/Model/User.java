package com.example.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer uid; 
	
	private String name;
	@Column(unique=true)
	private String email;
	private String password;
	private String gender;
	private String phone;
	private String city;
	private String state;
	private String pincode;
	
	
}
