package cipta_sarana_chemical.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cipta_sarana_chemical.spring.core.data.cyclic.CyclicA;
import cipta_sarana_chemical.spring.core.data.cyclic.CyclicB;
import cipta_sarana_chemical.spring.core.data.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {
    
    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
