package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeEmployee fe = container.getBean(FullTimeEmployee.class);
        fe.createAccount();

        PartTimeEmployee pe = container.getBean(PartTimeEmployee.class);
        pe.createAccount();

        String str1 = container.getBean(String.class);
        System.out.println(str1);

        String message = container.getBean("str2",String.class);
        System.out.println(message);
    }
}
