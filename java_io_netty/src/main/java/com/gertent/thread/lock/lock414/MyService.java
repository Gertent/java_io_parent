package com.gertent.thread.lock.lock414;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description 正确使用Contion实现等待/通知
 * @Author wyf
 * @Date 2017/12/26
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try{
            lock.lock();
            System.out.println("开始await时间为"+System.currentTimeMillis()+"---"+Thread.currentThread().getName());
            condition.await();
            System.out.println("结束await时间为"+System.currentTimeMillis()+"---"+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void singal(){
        try{
            lock.lock();
            System.out.println("singal时间为"+System.currentTimeMillis()+"---"+Thread.currentThread().getName());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }

}
