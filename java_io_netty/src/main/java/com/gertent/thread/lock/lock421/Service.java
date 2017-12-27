package com.gertent.thread.lock.lock421;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description 读读共享/写写互斥
 * @Author wyf
 * @Date 2017/12/27
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read(){
        try{
            try {
                lock.readLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            }finally {
                lock.readLock().unlock();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void write(){
        try{
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            }finally {
                lock.writeLock().lock();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
