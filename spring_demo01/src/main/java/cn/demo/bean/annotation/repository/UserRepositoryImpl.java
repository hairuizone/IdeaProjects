package cn.demo.bean.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/14 22:01
 */
@Repository
//(value = "userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void save() {
        System.out.println("UserRepository save ......");
    }
}
