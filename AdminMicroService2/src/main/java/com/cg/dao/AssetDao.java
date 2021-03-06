package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.entity.Asset;


@Repository("assDao")

public interface AssetDao extends JpaRepository<Asset, Integer> {

	
}
