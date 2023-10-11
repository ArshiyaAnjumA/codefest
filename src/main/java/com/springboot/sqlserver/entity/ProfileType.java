package com.springboot.sqlserver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProfileType")
public class ProfileType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PT_ID")
	private Integer PT_ID;
	@Column(name = "ProfileType")
	private String ProfileType;
	@Column(name = "Active")
	private String Active;

}
