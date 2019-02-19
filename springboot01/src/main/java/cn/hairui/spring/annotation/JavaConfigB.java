package cn.hairui.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laoganbu
 * @date: 2019/2/19 15:38
 */
@Configuration
public class JavaConfigB {
    @Bean("benz")
    public Car getBenz(){
        return new Benz();
    }

}
