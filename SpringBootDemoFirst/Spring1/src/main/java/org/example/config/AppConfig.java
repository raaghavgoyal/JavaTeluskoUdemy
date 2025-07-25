package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    //to give multiple names to the bean
    //@Bean(name = {"com2","desktop1","Beast"})
    @Bean
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
