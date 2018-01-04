package com.gertent.singleton.enum_singleton;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class test {
    public static void main(String[] args) {
        Thread thread = new Thread(){

            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println(MyObject.getObjectSingleton().hashCode());
                }
            }
        };
        thread.start();
    }
}
