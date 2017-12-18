package com.gertent.netty.fake_io;

import com.gertent.netty.bio.TimeServerHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description 伪异步IO
 * @Author wyf
 * @Date 2017/12/18
 */
public class TimeServer {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        if(args != null && args.length > 0){
            try{
                port = Integer.parseInt(args[0]);
            }catch (Exception e){
                port = 8088;
            }
        }
        ServerSocket server = null;
        try{
            server = new ServerSocket(port);
            System.out.println("The time server is start in port:"+port);
            Socket socket = null;
            //创建io任务线程池
            TimeServerHandlerExecutePool singleExecute = new TimeServerHandlerExecutePool(50,10000);
            while (true){
                socket = server.accept();
                singleExecute.execute(new TimeServerHandler(socket));
            }
        }finally {
            if(server != null){
                System.out.println("The Time Server close");
                server.close();
                server = null;
            }
        }
    }
}
