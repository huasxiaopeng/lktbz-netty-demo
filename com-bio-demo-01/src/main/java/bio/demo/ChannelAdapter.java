package bio.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @Description 适配器
 * @Author lktbz
 * @Date 2021/08/03
 */
public  abstract class ChannelAdapter extends Thread {
    private Socket socket;
    private ChannelHandler channelHandler;
    private Charset charset;
    public  ChannelAdapter(Socket socket,Charset charset){
        this.socket=socket;
        this.charset=charset;
        while(!socket.isConnected()){
            break;
        }
        channelHandler=new ChannelHandler(this.socket,charset);
        channelActive(channelHandler);

    }

    @Override
    public void run() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(this.socket.getInputStream(), charset));
            String strs=null;
            while((strs=input.readLine())!=null){
                channelRead(channelHandler,strs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 链接通知抽象类
    public abstract void channelActive(ChannelHandler ctx);

    // 读取消息抽象类
    public abstract void channelRead(ChannelHandler ctx, Object msg);
}
