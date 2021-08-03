package com.java.network.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.util.EventListener;

/**
 * @Description netty 服务端
 * @Author lktbz
 * @Date 2021/08/03
 */
public class NettyServer {
    public static void main(String[] args) {
            new NettyServer().bing(7397);
    }
    private void bing(int port) {

        EventLoopGroup parentG = new NioEventLoopGroup();
        EventLoopGroup childG = new NioEventLoopGroup();
        try {
            ServerBootstrap server = new ServerBootstrap();
            server.group(parentG, childG)
                  .channel(NioServerSocketChannel.class)
                  .option(ChannelOption.SO_BACKLOG,128)
                  .childHandler(new MyChannelInitializer());
            ChannelFuture sync = server.bind(port).sync();
            System.out.println("server 启动");
            sync.channel().closeFuture().sync();

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            childG.shutdownGracefully();
            parentG.shutdownGracefully();
        }


    }
}
