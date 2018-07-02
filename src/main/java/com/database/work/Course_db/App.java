package com.database.work.Course_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class}) // Temporary, just to exclude searching for data source
@EnableJpaRepositories("com.database.work.Course_db.repository")
//@ComponentScan({"com.database.work"})
public class App 
{
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class,args);
    }
}
