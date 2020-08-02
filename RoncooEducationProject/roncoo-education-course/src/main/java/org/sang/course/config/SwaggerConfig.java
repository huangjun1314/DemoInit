package org.sang.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    Docket docketCourse(){
        return new Docket(DocumentationType.SWAGGER_2). select ()
                .apis(RequestHandlerSelectors.basePackage ("org.sang.course.controller.swaggercontroller"))
                . paths ( PathSelectors.any())
                . build().apiInfo(new ApiInfoBuilder().description("领课教育系统").contact(new Contact("liyang",
                        "https://github.com/lenve","1014032821@qq.com")).version("v1.0").title("课程模块")
                        .license("Apache2.0").licenseUrl("http://www.apache.org/likcenses/LICENSE-2.0").build());
    }
}
