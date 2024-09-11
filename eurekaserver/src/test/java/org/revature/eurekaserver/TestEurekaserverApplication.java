package org.revature.eurekaserver;

import org.springframework.boot.SpringApplication;

public class TestEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.from(EurekaserverApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
