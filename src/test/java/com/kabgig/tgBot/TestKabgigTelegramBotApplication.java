package com.kabgig.tgBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestKabgigTelegramBotApplication {

	public static void main(String[] args) {
		SpringApplication.from(KabgigTelegramBotApplication::main).with(TestKabgigTelegramBotApplication.class).run(args);
	}

}
