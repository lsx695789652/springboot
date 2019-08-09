package com.springboot.Config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages="com.springboot.Mapper.test1",sqlSessionTemplateRef="test1SqlSessionTemplateRef")
public class DataSourceConfig {

	@Bean(name="test1DataSource")
	@ConfigurationProperties(prefix="spring.datasource.test1")
	@Primary
	public DataSource testDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="test1SqlSessionFactory")	
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		return bean.getObject();
	}
	
	@Bean(name="test1TranscationManager")	
	@Primary
	public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) 
			throws Exception {		
		return new DataSourceTransactionManager(dataSource);
	}
	
	@Bean(name="test1SqlSessionTemplate")	
	@Primary
	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test1SqlSessionFactory")
	SqlSessionFactory sqlSessionFactory) throws Exception {
		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
