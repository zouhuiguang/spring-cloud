
package com.yb.provider.service.providerservice.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageHelper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;


/**
 * @ClassName:  MyBatisConfig
 * @Description:mybatis配置类
 * @author: liaosj
 * @date:   2017年9月25日 下午3:11:14
 *
 */
@Import(DataSourceConfig.class)
@Configuration
@EnableTransactionManagement
public class MyBatisConfig {

	@Autowired
	private DataSource dataSource;

	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties p = new Properties();
		p.setProperty("offsetAsPageNum", "true");
		p.setProperty("rowBoundsWithCount", "true");
		p.setProperty("reasonable", "true");
		pageHelper.setProperties(p);
		return pageHelper;
	}

	@Bean
	@Primary
	public SqlSessionFactoryBean sqlSessionFactory(DruidDataSource dataSource) throws IOException {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);// 设置数据源
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
		configuration.setLogPrefix("mybatis.");
		configuration.setCallSettersOnNulls(true);
		sessionFactory.setConfiguration(configuration);
		sessionFactory.setTypeAliasesPackage("com.yb.provider.service.providerservice.entity");// 设置实体扫描包
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFactory.setMapperLocations(resolver.getResources("classpath:mybatis/*Mapper.xml"));// 设置Mapp文件位置
		return sessionFactory;
	}

	@Bean
	@Primary
	public DataSourceTransactionManager transactionManager(DruidDataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}


}
