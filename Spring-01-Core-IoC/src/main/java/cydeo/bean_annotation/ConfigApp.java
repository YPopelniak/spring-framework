package cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor() {
        return new FullTimeMentor();
    }
    @Primary
    @Bean
//            (name = "p1")
    PartTimeMentor partTimeMentor() {
        return new PartTimeMentor();
    }

    @Bean
//            (name = "p2")
    PartTimeMentor partTimeMentor2() {
        return new PartTimeMentor();
    }
}
