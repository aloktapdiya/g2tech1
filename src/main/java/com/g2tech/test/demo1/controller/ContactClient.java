package com.g2tech.test.demo1.controller;
import com.g2tech.test.demo1.domain.Customer;
import com.g2tech.test.demo1.repo.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ContactClient {


        private static final Logger log = LoggerFactory.getLogger(ContactClient.class);

        public static void main(String[] args) {
            SpringApplication.run(ContactClient.class);
        }

        @Bean
        public CommandLineRunner demo(CustomerRepository repository) {
            return (args) -> {
                repository.save(new Customer("ccc", "bbb"));


                log.info("Customer list");
                log.info("-------------");
                for (Customer customer : repository.findAll()) {
                    log.info(customer.toString());
                }
                log.info("---");

                // single customer by ID
                Customer customer = repository.findById(1L);
                log.info("---------------------");
                log.info(customer.toString());
                log.info("------");

                //  customer by last name
                log.info("Customer By LastName");
                log.info("----------------------");
                repository.findByLastName("bbb").forEach(bbb -> {
                    log.info(bbb.toString());
                });

                log.info("");
            };
        }



}
