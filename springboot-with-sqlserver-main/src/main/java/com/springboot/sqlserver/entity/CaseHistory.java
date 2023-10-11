package com.springboot.sqlserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProfileInfo")
public class CaseHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CaseHistory_ID")
	private Long CaseHistory_ID;
	@Column(name = "FK_CaseID")
	private Long FK_CaseID;
	@Column(name = "AdminComments")
	private Long AdminComments;
	@Column(name = "TherapyComments")
	private Timestamp TherapyComments;
	@Column(name = "CreatedDate")
	private Date CreatedDate;
}








