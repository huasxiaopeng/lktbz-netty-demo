package bio.demo.client;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/08/03
 */
public class BioClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 7397);
            System.out.println("itstack-demo-netty bio client start done. {关注公众号：bugstack虫洞栈 | 欢迎关注&获取源码}");
            BioClientHandler bioClientHandler = new BioClientHandler(socket, Charset.forName("utf-8"));
            bioClientHandler.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
