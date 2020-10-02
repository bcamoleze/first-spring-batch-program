package com.camoleze.firstspringbatchprogram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {

	@Bean
	public PropertySourcesPlaceholderConfigurer config() {

		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		configurer.setLocation(new FileSystemResource(
				"C:\\Users\\a799679\\OneDrive - Atos\\Documents\\Camoleze\\testes\\application.properties"));
		return configurer;

	}

}
