package com.gertent.thread.lock.lock413;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    /**
     * 错误方式，报错监视器出错java.lang.IllegalMonitorStateException，必须在condition.await()前调用lock.lock()获得同步监视器
     * @author wyf
     * @date 2017/12/26
    */
    public void await(){
        try{
            condition.await();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void waitMethod(){
        try{
            lock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("释放了！");
        }
    }
}
