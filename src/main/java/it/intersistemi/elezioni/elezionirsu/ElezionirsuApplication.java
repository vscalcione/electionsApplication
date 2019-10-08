package it.intersistemi.elezioni.elezionirsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"it.intersistemi.elezioni.elezionirsu.repository"})
//@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
@EntityScan(basePackages = "it.intersistemi.elezioni.elezionirsu.entity")
@EnableTransactionManagement
@EnableScheduling
public class ElezionirsuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElezionirsuApplication.class, args);
    }

}
