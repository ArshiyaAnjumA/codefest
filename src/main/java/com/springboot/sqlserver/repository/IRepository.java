package com.springboot.sqlserver.repository;

import com.springboot.sqlserver.entity.ProfileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sqlserver.entity.ProfileType;

@Repository
public interface IRepository extends JpaRepository<ProfileInfo, Integer> {

}
