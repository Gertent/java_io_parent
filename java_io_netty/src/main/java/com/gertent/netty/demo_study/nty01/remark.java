package com.gertent.netty.demo_study.nty01;

/**
 * 既然是分布式的，自然要分多个服务。Netty中，需要区分Server和Client服务。所有的Client都是绑定在Server上的，他们之间是不能通过Netty直接通信的。
 （自己采用的其他手段，不包括在内。）。白话一下这个通信过程，Server端开放端口，供Client连接，Client发起请求，连接到Server指定的端口，完成绑定。
 随后便可自由通信。其实就是普通Socket连接通信的过程。

 Netty框架是基于事件机制的，简单说，就是发生什么事，就找相关处理方法。就跟着火了找119，抢劫了找110一个道理。
 所以，这里，我们处理的是当客户端和服务端完成连接以后的这个事件。什么时候完成的连接，Netty知道，他告诉我了，我就负责处理。这就是框架的作用。
 Netty，提供的事件还有很多，以后会慢慢的接触和介绍。

 基本概念：
 1.ChannelEvent，因为Netty是基于事件驱动的，就是我们上文提到的，发生什么事，就通知"有关部门"。所以，不难理解，我们自己的业务代码中，一定有跟这些事件相关的处理。
 在样例代码，我们处理的事件，就是channelConnected。以后，我们还会处理更多的事件

 2.ChannelPipeline Pipeline，翻译成中文的意思是：管道，传输途径。也就是说，在这里他是控制ChannelEvent事件分发和传递的。事件在管道中流转，第一站到哪，第二站到哪，到哪是终点，就是用这个ChannelPipeline 处理的。
 比如：开发事件。先给A设计，然后给B开发。一个流转图，希望能给你更直观的感觉。

 3.ChannelHandler 刚说Pipeline负责把事件分发到相应的站点，那个这个站点在Netty里，就是指ChannelHandler。事件到了ChannelHandler这里，就要被具体的进行处理了，
 我们的样例代码里，实现的就是这样一个处理事件的“站点”，也就是说，你自己的业务逻辑一般都是从这里开始的。

 4.Channel 有了个部门的协调处理，我们还需要一个从整体把握形势的，所谓“大局观”的部门，channel。
 channel，能够告诉你当前通道的状态，是连同还是关闭。获取通道相关的配置信息。得到Pipeline等。是一些全局的信息。Channel自然是由ChannelFactory产生的。
 Channel的实现类型，决定了你这个通道是同步的还是异步的(nio)。例如，我们样例里用的是NioServerSocketChannel

 5.ChannelBuffer Netty中的消息传递，都必须以字节的形式，以ChannelBuffer为载体传递。简单的说，就是你想直接写个字符串过去，对不起，抛异常
 */
public class remark {
}