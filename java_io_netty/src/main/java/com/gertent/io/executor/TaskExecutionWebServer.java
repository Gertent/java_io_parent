package com.gertent.io.executor;

import java.io.IOException;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/22
 */
public class TaskExecutionWebServer {
    private static final int NTHREADS = 100;
    private static final Executor exec = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true){
            final Socket conn = serverSocket.accept();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("exec......");
                }
            };
            exec.execute(runnable);
        }
    }
}

class ThreadPerTaskExecutor implements Executor{

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}

class PreGenerator implements Runnable{

    private final List<BigInteger> premes = new ArrayList<>();
    private volatile boolean isCanceled;

    @Override
    public void run() {
        BigInteger p = BigInteger.ONE;
        while (!isCanceled){
            p = p.nextProbablePrime();
            synchronized (this){
                premes.add(p);
            }
        }
    }

    public void cancel(){
        isCanceled = false;
    }
}
