package bio.demo.server;

import bio.demo.ChannelAdapter;
import bio.demo.ChannelHandler;

import java.net.Socket;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description  bio 服务端处理器，用来处理数据的写入与写出
 * @Author lktbz
 * @Date 2021/08/03
 */
public class BioServerHandler extends ChannelAdapter {
    public BioServerHandler(Socket socket, Charset charset) {
        super(socket, charset);
    }

    /**
     * 服务端向客户端写信息
     * @param ctx
     */
    @Override
    public void channelActive(ChannelHandler ctx) {
        System.out.println("链接报告LocalAddress:" + ctx.socket().getLocalAddress());
        ctx.writeAndFlush("hi! 我是bugstack虫洞栈 BioServer to msg for you \r\n");

    }

    /**
     *    从客户端获取信息
     * @param ctx
     * @param msg
     */
    @Override
    public void channelRead(ChannelHandler ctx, Object msg) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " 接收到消息：" + msg);
        ctx.writeAndFlush("hi 我已经收到你的消息Success！\r\n");
    }
}
