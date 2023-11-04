package com.sowmik.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashCode and toString are automatically created.
// Released in JDK 16.

record Person (String name, int age) { };

record Address (String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Sowmik";
    }

    @Bean
    public int age() {
        return 16;
    }

    @Bean
    public Person person() {
        return new Person("Habib", 15);
    }

    @Bean Address address() {
        return new Address("Bazar Road", "Bhurungamari");
    }
}
