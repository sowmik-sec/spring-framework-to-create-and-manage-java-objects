package com.sowmik.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashCode and toString are automatically created.
// Released in JDK 16.

record Person (String name, int age, Address address) { };

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
        return new Person("Habib", 15, new Address("Main Road", "Khatbari"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) { // name, age, address2
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    Address address() {
        return new Address("Bazar Road", "Bhurungamari");
    }
    @Bean(name = "address3")
    Address address3() {
        return new Address("Paglarhat Road", "Bhurungamari");
    }
}
