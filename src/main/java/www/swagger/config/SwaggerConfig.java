package www.swagger.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
* Created by:joeson
* Created:20190523
* Comment:添加Swagger配置类
* */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Value(value = "${swagger.enabled}")
    Boolean swaggerEnable;

    @Value(value = "${project.version}")
    String projectVersion;

    @Value(value = "${swagger.scan.package}")
    String scanPacke;

    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //是否开启
                .enable(swaggerEnable).select()
                //扫描包路径
                .apis(RequestHandlerSelectors.basePackage(scanPacke))
                //指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("客户管理系统")
                .description("系统主要提供权限管理、订单管理、合同管理等功能")
                .contact(new Contact("joeson","",""))
                .version(projectVersion)
                .build();
    }
}
