package com.example.finalexam;

import com.example.finalexam.entity.customer;
import com.example.finalexam.repository.customerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalExamApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(customerRepository customerRepository){
        return args -> {
            customerRepository.save(new customer(1,"123","Sidharth",12324.00,"Savings",5));
            customerRepository.save(new customer(2,"234","Sid",1234.00,"Chequing",5));

            customerRepository.findAll().forEach(p->{
                System.out.println(p.getCustname());
            });
        };
    }

}
