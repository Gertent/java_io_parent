package com.gertent.thread.lock.lock4112;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/27
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        }finally {
            lock.unlock();
        }
    }
}
