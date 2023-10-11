package com.springboot.sqlserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProfileInfo")
public class CaseInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CaseNumber")
	private Long CaseNumber;
	@Column(name = "Admin_id")
	private Long Admin_id;
	@Column(name = "Therapist_id")
	private Long Therapist_id;
	@Column(name = "CreatedDate")
	private Timestamp CreatedDate;
	@Column(name = "active")
	private Date active;
}




