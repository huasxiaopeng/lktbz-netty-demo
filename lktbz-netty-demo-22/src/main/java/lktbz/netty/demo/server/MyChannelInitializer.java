package lktbz.netty.demo.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import lktbz.netty.demo.codec.ObjDecoder;
import lktbz.netty.demo.codec.ObjEncoder;
import lktbz.netty.demo.domain.FileTransferProtocol;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/13
 * @desc
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(FileTransferProtocol.class));
        channel.pipeline().addLast(new ObjEncoder(FileTransferProtocol.class));
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyServerHandler());
    }

}
