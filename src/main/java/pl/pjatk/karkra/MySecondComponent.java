package pl.pjatk.karkra;

import org.springframework.stereotype.Component;

//@Component
public class MySecondComponent {

    public MySecondComponent() {
        System.out.println("Second");
    }

    public void hello() {
        System.out.println("method - component 2");
    }
}
