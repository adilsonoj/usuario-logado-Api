package br.mil.mar.amrj.ad06.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "br.mil.mar.amrj.ad06" })
public class WebConfiguration implements WebMvcConfigurer {

	
}
