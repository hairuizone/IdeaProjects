package cn.demo.bean.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/14 23:01
 */
@Repository
public class UserInfoRepositoryImpl implements UserRepository {

    @Override
    public void save() {
        System.out.println("UserInfoRepositoryImpl save ......");
    }
}
