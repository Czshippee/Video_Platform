package com.usc.Video_Platform;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan({ "com.usc.Video_Platform.mapper"})
public class VideoPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoPlatformApplication.class, args);
	}
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//	}
}
