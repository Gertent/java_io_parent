package com.gertent.thread.lock.lock4112;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/27
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
