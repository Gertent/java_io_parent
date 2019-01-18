package com.gertent.netty.demo_study.nty03;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.*;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.concurrent.Executors;

/**
 * @author lihzh
 * @alia OneCoder
 * @blog http://www.coderli.com
 * @desc 客户端和服务端的消息传递
 */
public class MessageServer {

    public static void main(String[] args) {
        // Server服务启动器
        ServerBootstrap bootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool()));
        // 设置一个处理客户端消息和各种消息事件的类(Handler)
        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            @Override
            public ChannelPipeline getPipeline() throws Exception {
                return Channels.pipeline(new ServerBufferHandler());
            }
        });
        // 开放8000端口供客户端访问。
        bootstrap.bind(new InetSocketAddress(8000));
    }

    private static class ServerBufferHandler extends SimpleChannelHandler {

        /**
         * 用户接受客户端发来的消息，在有客户端消息到达时触发
         *
         * @author lihzh
         * @alia OneCoder
         */
        @Override
        public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {
            ChannelBuffer buffer = (ChannelBuffer) e.getMessage();
            // 五位读取
            while (buffer.readableBytes() >= 5) {
                ChannelBuffer tempBuffer = buffer.readBytes(5);
                System.out.println(tempBuffer.toString(Charset.defaultCharset()));
            }
            // 读取剩下的信息
            System.out.println(buffer.toString(Charset.defaultCharset()));
        }

    }
}
