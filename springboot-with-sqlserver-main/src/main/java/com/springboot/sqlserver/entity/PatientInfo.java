package com.springboot.sqlserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProfileInfo")
public class PatientInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private Long patient_id;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "age")
	private Integer age;
	@Column(name = "birthdate")
	private Date birthdate;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private Integer city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "postalcode")
	private Integer postalcode;
	@Column(name = "Patient_Type")
	private String Patient_Type;
	@Column(name = "InsuranceInfo")
	private String InsuranceInfo;
	@Column(name = "UserName")
	private Integer UserName;
	@Column(name = "Password")
	private String Password;
	@Column(name = "AlternateName")
	private String AlternateName;
	@Column(name = "Active")
	private String Active;
	@Column(name = "GP_Details")
	private String GP_Details;
	@Column(name = "Email_ID")
	private String Email_ID;
}