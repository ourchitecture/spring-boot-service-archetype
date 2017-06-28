package ${package}.host;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("${groupId}.*")
public class TemplateService {
    public static void main(String[] args) {
        SpringApplication.run(TemplateService.class, args);
    }
}
