package com.naa.daos;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProductsDAO extends JdbcDaoSupport {
	  @Autowired
	  public ProductsDAO(DataSource dataSource) {
	        setDataSource(dataSource);
	  }
}
