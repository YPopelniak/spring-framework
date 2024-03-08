package stereotype_annotations.Model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MicroService {
    public void getTotalHours(){
        System.out.println("Total hours is :" + 15);
    }
}
