package cn.demo.bean.annotation.service;

import cn.demo.bean.annotation.TestObject;
import cn.demo.bean.annotation.TestObject2;
import cn.demo.bean.annotation.repository.UserRepository;
import cn.demo.bean.annotation.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/14 22:03
 */
@Service
public class UserService {


    private UserRepository userRepository;


    @Autowired
    //@Qualifier("userInfoRepositoryImpl")
    //单ioc容器中存在多个相同的bean时，需要指定需要装配的对象 两种写法
    public void setUserRepository(@Qualifier("userInfoRepositoryImpl") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add() {
        System.out.println("UserService add ......");
        userRepository.save();

    }
}