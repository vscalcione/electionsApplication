package it.intersistemi.elezioni.elezionirsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"it.intersistemi.elezioni.elezionirsu"})
@EnableJpaRepositories(basePackages = "it.intersistemi.elezioni.elezionirsu.repository")
@EntityScan(basePackages = "it.intersistemi.elezioni.elezionirsu.entity")
@Configuration
@EnableTransactionManagement
@EnableScheduling
@ComponentScan(basePackages = {"it.intersistemi.elezioni.elezionirsu.service", "it.intersistemi.elezioni.elezionirsu.mapper"})
public class ElezionirsuApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElezionirsuApplication.class, args);

    }
}
