package com.best.elaticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.best.elaticsearch.reposities")
public class ElaticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElaticsearchApplication.class, args);
	}
}
