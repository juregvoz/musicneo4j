package com.musicneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMusicneo4jApplication {

	public static void main(String[] args) {
		SpringApplication.from(Musicneo4jApplication::main).with(TestMusicneo4jApplication.class).run(args);
	}

}
