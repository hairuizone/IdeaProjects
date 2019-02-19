package cn.hairui.spring.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;

/**
 * @author laoganbu
 * @date: 2019/2/19 15:39
 */
@Configuration
@Import({JavaConfigA.class,JavaConfigB.class})
public class ParentConfig {

}
