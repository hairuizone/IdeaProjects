package cn.demo.bean.generic.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/17 21:46
 */
@Service
public class BaseService<T> {
    @Autowired
    protected  BaseRepository<T> baseRepository;

    public void add(){
        System.out.println("add ......");
        System.out.println(baseRepository);
    }
}
