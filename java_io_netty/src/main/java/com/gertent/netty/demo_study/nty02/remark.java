package com.gertent.netty.demo_study.nty02;

/**
 * 与“Hello World”样例代码不同的是，客户端在channel连通后，不是在本地打印，而是将消息转换成ChannelBuffer传递给服务端，服务端接受到ChannelBuffer后，解码成字符串打印出来。
同时，通过对比可以发现，变动的只是Handler里的代码，启动服务和绑定服务的代码没有变化，也就是我们在概念介绍里提到了，关注Handler，在Handler里处理我们自己的业务。
所以，以后我们会只给出业务中关键代码，不会在上重复的代码：）

由于在Netty中消息的收发全依赖于ChannelBuffer，所以，下一章我们将会详细的介绍ChannelBuffer的使用
 */
public class remark {
}
