package cipta_sarana_chemical.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import cipta_sarana_chemical.spring.core.data.Bar;
import cipta_sarana_chemical.spring.core.data.Foo;
import cipta_sarana_chemical.spring.core.data.FooBar;

@Configuration
public class DependencyInjectionConfigurstion {
    
    @Primary
    @Bean
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }


    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    // if there's no @Qualifier, will get the primary bean (fooFirst)
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
