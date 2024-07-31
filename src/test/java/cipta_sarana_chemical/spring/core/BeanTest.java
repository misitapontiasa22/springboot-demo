package cipta_sarana_chemical.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cipta_sarana_chemical.spring.core.data.Foo;

public class BeanTest {
    
    @Test
    void testCreateBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurantion.class);

        Assertions.assertNotNull(context);
    }

    @Test
    void testGetBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurantion.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertNotNull(context);
        Assertions.assertSame(foo1, foo2);
    }
}
