package com.example.demo;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

		@Autowired EntityManagerFactory factory;
		
		public SessionFactory factory() {
			return factory.unwrap(SessionFactory.class);
		}
		
	/*
	 * @Bean public HibernateTransactionManager transactionManager() {
	 * HibernateTransactionManager tx= new HibernateTransactionManager();
	 * tx.setSessionFactory(factory()); return tx; }
	 */
		
		@Bean
		public HibernateTemplate template() {
			HibernateTemplate template= new HibernateTemplate(factory());
			template.setCheckWriteOperations(false);
			return template;
		}
	
}
