package javas.networks.demos.sockets.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.Objects;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/7
 * @desc   服务端
 */
public class MyServer {
    public static void main(String[] args)  {
//        helloServer();

    }

    /**
     * hello world
     */
    public  static void helloServer(){
        try {
            ServerSocket socket=new ServerSocket(9999);
            Socket accept = socket.accept();
            DataInputStream di=new DataInputStream( accept.getInputStream());
            String s = di.readUTF();
            System.out.println("服务端接收到的数据为："+s);
            socket.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    /**
     * serverscoket   需要指定地址与端口
     */
    public  static void helloServerSocket(){
        try {
            //创建socket
            ServerSocket socket=new ServerSocket();
            //构建地址
            SocketAddress address=new InetSocketAddress("localhost", 9999);
            //绑定端口
            socket.bind(address);
            Socket accept = socket.accept();
            DataInputStream di=new DataInputStream( accept.getInputStream());
            String s = di.readUTF();
            System.out.println("服务端接收到的数据为："+s);
            socket.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
