package com.gertent.thread.lock.lock4111;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
//        Thread a = new Thread(runnable);
//        a.start();
//        Thread.sleep(500);
//        Thread b = new Thread(runnable);
//        b.start();
//        Thread.sleep(500);
//        System.out.println(service.lock.hasQueuedThread(a));
//        System.out.println(service.lock.hasQueuedThread(b));
//        System.out.println(service.lock.hasQueuedThreads());

        Thread[] arr =new Thread[10];
        for(int i = 0; i < 10; i++){
            arr[i] = new Thread(runnable);
        }
        for(int i = 0; i < 10; i++){
            arr[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
