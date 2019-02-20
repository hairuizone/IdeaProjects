package cn.demo.aop.impl;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/19 18:28
 */
@Component
public class CalculatorImpl implements CalculatorInterface {

    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int dev(int i, int j) {
        int result = i / j;
        return result;
    }
}
