package com.springboot.sqlserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProfileInfo")
public class ProfileInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profile_id")
	private Long profile_id;
	@Column(name = "age")
	private Integer age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "phone_number")
	private String phone_number;
	@Column(name = "address")
	private String address;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "Name")
	private String Name;
	@Column(name = "City")
	private String City;
	@Column(name = "country")
	private String country;
	@Column(name = "Postal_Code")
	private String Postal_Code;
	@Column(name = "Email_ID")
	private String Email_ID;
	@Column(name = "Password")
	private String Password;
	@Column(name = "NHS_ID")
	private String NHS_ID;
	@Column(name = "Role")
	private String Role;
	@Column(name = "active")
	private String active;
}
