package com.camoleze.firstspringbatchprogram.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImprimeOlaStepConfig {

	@Autowired private StepBuilderFactory sbf;

	@Bean
	public Step imprimeOlaStep(Tasklet imprimeOlaTasklet ) {
		
		return sbf
				.get("imprimeOlaStep")
				.tasklet( imprimeOlaTasklet )
				.build();
	}
	
	
}
