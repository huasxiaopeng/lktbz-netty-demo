package javas.networks.demos.sockets.server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/7
 * @desc   服务端 读写
 */
public class MyServerReadAndWriteDemo {
    public static void main(String[] args)  {
        try {
            ServerSocket socket=new ServerSocket(9999);
            Socket accept = socket.accept();
            DataInputStream di=new DataInputStream( accept.getInputStream());
            DataOutputStream dout=new DataOutputStream(accept.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while(!str.equals("stop")){
                str=di.readUTF();
                System.out.println("client says:"+str);
                str2=br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            di.close();
            accept.close();
            socket.close();
              

        }catch (Exception e){
            System.out.println(e);
        }

    }


}
