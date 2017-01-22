package br.com.migresc.membros.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by bruno on 22/01/17.
 */
@SpringBootApplication(scanBasePackages = "br.com.migresc.membros")
@EnableMongoRepositories(basePackages = "br.com.migresc.membros.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}