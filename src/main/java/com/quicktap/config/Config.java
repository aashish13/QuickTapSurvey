
/**
 * 
 */
package com.quicktap.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Aashish
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.quicktap")
@EnableTransactionManagement
public class Config extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver getInternalViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
		registry.addResourceHandler("/font-awesome/**").addResourceLocations("/WEB-INF/font-awesome/");
		registry.addResourceHandler("/fonts/**").addResourceLocations("/WEB-INF/fonts/");
		registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/images/");
		registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/");
		registry.addResourceHandler("/videos/**").addResourceLocations("/WEB-INF/videos/");
		registry.addResourceHandler("../images/bs/**").addResourceLocations("/WEB-INF/images/bs");
		registry.addResourceHandler("/other/**").addResourceLocations("/WEB-INF/other/");
		registry.addResourceHandler("/login/**").addResourceLocations("/WEB-INF/login/");

	}

	// Below are the configuration required for Hibernate
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		// have used tomcat basicdatasource object if needed will change to
		// apache commons
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/quicktap");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		return dataSource;
	}

	// Configuring SessionFactory
	@Autowired
	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("com.quicktap.data.entity");
		sessionFactoryBean.setHibernateProperties(hibernateProperties());
		return sessionFactoryBean;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.use_sql_comments", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.enable_lazy_load_no_trans", "true");
		return properties;
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}
	// Hibernate Configration ends here
}
