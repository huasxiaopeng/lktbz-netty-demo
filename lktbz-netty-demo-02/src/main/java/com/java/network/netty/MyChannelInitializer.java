package com.java.network.netty;

import io.netty.channel.ChannelInitializer;

import io.netty.channel.socket.SocketChannel;

/**
 * @Description hello netty
 * @Author lktbz
 * @Date 2021/08/03
 */
public class MyChannelInitializer  extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        System.out.println("链接报告开始");
        System.out.println("链接报告信息：有一客户端链接到本服务端");
        System.out.println("链接报告IP:" + channel.localAddress().getHostString());
        System.out.println("链接报告Port:" + channel.localAddress().getPort());
        System.out.println("链接报告完毕");
    }
}
