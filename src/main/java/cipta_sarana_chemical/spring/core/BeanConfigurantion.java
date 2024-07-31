package cipta_sarana_chemical.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cipta_sarana_chemical.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfigurantion {

    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }
}