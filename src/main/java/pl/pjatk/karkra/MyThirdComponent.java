package pl.pjatk.karkra;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class MyThirdComponent {

    public MyThirdComponent(ApplicationContext applicationContext, User user){
        System.out.println("Third");
        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        myFirstComponent.hello();
        mySecondComponent.hello();
        System.out.println(user.getMyrandom());
    }

    public void hello() {
        System.out.println("method - component 3");
    }
}
