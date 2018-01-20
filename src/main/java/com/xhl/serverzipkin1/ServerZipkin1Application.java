package com.xhl.serverzipkin1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ServerZipkin1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerZipkin1Application.class, args);
	}
}
