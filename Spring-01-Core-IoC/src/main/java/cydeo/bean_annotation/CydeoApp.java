package cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);


        FullTimeMentor fs = container.getBean(FullTimeMentor.class);

        fs.createAccount();

    }
}
