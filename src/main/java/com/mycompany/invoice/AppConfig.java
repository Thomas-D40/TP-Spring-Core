package com.mycompany.invoice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoice.service.prefix", "com.mycompany.invoice.controller.web", "com.mycompany.invoice.repository"})
// @PropertySource("classpath:application.properties")
// @ImportResource("classpath:applicationContextV6.xml")
// Utile si l'on veut ajouter des méthodes ou plusieurs config, sinon directement dans App
public class AppConfig {

}
