package com.samaspace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samaspace.model.Level;


@Repository("daoLevel")
public interface EntityRepositoryLevel extends JpaRepository<Level, Long>{

}
