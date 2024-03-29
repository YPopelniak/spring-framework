package cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor fs = container.getBean(FullTimeMentor.class);
        fs.createAccount();

//        PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();


        String str = container.getBean(String.class);
        System.out.println(str);


    }
}
