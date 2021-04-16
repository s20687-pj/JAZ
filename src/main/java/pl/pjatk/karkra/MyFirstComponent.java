package pl.pjatk.karkra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {


    public  MyFirstComponent(ApplicationContext applicationContext, @Value("${message.default.hello}") String welcomeMessage, @Value("${creating.bean}") boolean creatigbean){
//        System.out.println("FIRST");
//        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
//        mySecondComponent.hello();
//        System.out.println(welcomeMessage);
        System.out.println(creatigbean);

        if(creatigbean){
            HomeExcercise homeExcercise = applicationContext.getBean("homeExcercise", HomeExcercise.class);
        }

    }

    public void hello() {
        System.out.println("method - component 1");
    }

}
