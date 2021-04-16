package pl.pjatk.karkra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigurationClass {

    @Bean
    public User user(){ return new User();}

    @Bean
    public List<String> defaultData(){
        return List.of("Karol","Kraus","Pjatk","default","data");
    }

}
