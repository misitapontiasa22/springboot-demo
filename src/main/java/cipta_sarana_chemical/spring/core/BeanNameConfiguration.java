package cipta_sarana_chemical.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import cipta_sarana_chemical.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanNameConfiguration {
    
    @Primary
    @Bean("fooFirst")
    public Foo foo1() {
        log.info("Create new bean: fooFirst");
        return new Foo();
    }

    @Bean("fooSecond")
    public Foo foo2() {
        log.info("Create new bean: fooSecond");
        return new Foo();
    }
}
