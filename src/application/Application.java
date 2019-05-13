package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages= {"entity"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
//@EnableJpaRepositories(basePackages= {"repository"})
@ComponentScan(basePackages= {"controller"})
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
	
}
