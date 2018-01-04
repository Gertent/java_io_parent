package com.gertent.thread.lock.thread316_wait_nofify.producer_consumer;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class C {
    private String lock;
    public C(String lock){
        super();
        this.lock = lock;
    }
    public void getValue(){
        try{
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get 的值为：" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
