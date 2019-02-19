package cn.hairui.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laoganbu
 * @date: 2019/2/19 15:36
 */
@Configuration
public class JavaConfigA {
    @Bean("audi")
    public Car getAudi() {
        return new Audi();
    }
}
