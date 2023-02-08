package com.example.nativevault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
;


@SpringBootApplication(exclude = { RabbitAutoConfiguration.class})
//@SpringBootApplication
public class NativeVaultApplication {

	public static void main(String[] args) {

			SpringApplication.run(NativeVaultApplication.class, args);



	}


}
