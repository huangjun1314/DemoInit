package org.sang.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan("org.sang")
public class RoncooEducationTradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoncooEducationTradeApplication.class, args);
	}

}
