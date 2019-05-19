package www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("www.service.*.mapper")
public class SpringRunApplication<main> {

    public static  void main(String[] args){
        SpringApplication.run(SpringRunApplication.class, args);
    }

}
