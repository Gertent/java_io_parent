package com.gertent.thread.lock.thread316_wait_nofify.producer_consumer;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock = lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("Set 的值为：" + value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
