package br.com.dio.api.doc;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Contact contact () {
        return new Contact(
                "Jonathan",
                "http://localhost:8080",
                "djohnni@hotmail.com");

    }

    private ApiInfoBuilder apiInfo () {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("API - Exemplo de uso de Springboot REST API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInfoBuilder.license("JRE Solutions Enterprise");
        apiInfoBuilder.licenseUrl("https://github.com/jonathaneichenberger");
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;
        
    }

}
