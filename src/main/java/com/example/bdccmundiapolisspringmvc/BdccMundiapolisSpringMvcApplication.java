
package com.example.bdccmundiapolisspringmvc;

import com.example.bdccmundiapolisspringmvc.entities.Product;
import com.example.bdccmundiapolisspringmvc.repository.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BdccMundiapolisSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdccMundiapolisSpringMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {

        return args -> {

            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(5400)
                    .quantity(12)
                    .build());

            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(2300)
                    .quantity(10)
                    .build());

            productRepository.save(Product.builder()
                    .name("Smart Phone")
                    .price(6000)
                    .quantity(20)
                    .build());

            productRepository.findAll().forEach(p -> {
                System.out.println(p.toString());
            });
        };
    }
}
