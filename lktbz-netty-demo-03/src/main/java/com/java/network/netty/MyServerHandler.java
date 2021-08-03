package com.java.network.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;


/**
 * @Description 接口客户端数据类
 * @Author lktbz
 * @Date 2021/08/03
 */
public class MyServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        ByteBuf buf=(ByteBuf) o;
        byte[]msgByte=new byte[buf.readableBytes()];
        buf.readBytes(msgByte);
        System.out.println(new Date()+"接收消息：");
        System.out.println(new String(msgByte, Charset.forName("GBK")));
    }
}
