package andy.web;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SimpleWebApplication.class);
	}
	
	@Bean
	public CommandLineRunner clRunner(ApplicationContext ctx) {
		return args-> {
			String[] beans=ctx.getBeanDefinitionNames();
			System.out.println("**********************************************************");
			Arrays.asList(beans).forEach(b -> System.out.println(b));
			System.out.println("**********************************************************");
		};
		
	}
}
