package stereotype_annotations.Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        DevOps ops = container.getBean(DevOps.class);

        dataStructure.getTotalHours();
        ops.getTotalHours();

        ExtraHours hours = container.getBean(ExtraHours.class);
        System.out.println(hours.getHours());
    }
}
