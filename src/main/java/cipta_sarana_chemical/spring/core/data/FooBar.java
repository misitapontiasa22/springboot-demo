package cipta_sarana_chemical.spring.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // for getter and setter 
@AllArgsConstructor
public class FooBar {
    
    private Foo foo;
    private Bar bar;
}
