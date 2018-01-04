package com.gertent.singleton.enum_singleton;

import java.sql.Connection;

/**
 * @Description 枚举单例
 * @Author wyf
 * @Date 2018/1/3
 */
public class MyObject {
    public enum MyEnumSingleton{
        objectSingleton;
        private Object object;
        MyEnumSingleton(){
            System.out.println("创建MyObject对象");
            object = new Object();
        }
        public Object getObject(){
            return object;
        }
    }
    public static Object getObjectSingleton(){
        return MyEnumSingleton.objectSingleton.getObject();
    }
}
