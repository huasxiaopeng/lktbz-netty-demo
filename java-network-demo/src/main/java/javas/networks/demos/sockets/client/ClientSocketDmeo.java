package javas.networks.demos.sockets.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/7
 * @desc  客户端
 */
public class ClientSocketDmeo {
    public static void main(String[] args)  {
//    helloClient();
    }

    /**
     *   客户端 helloworld
     */
    public  static void helloClient(){
        try{
            Socket localhost = new Socket("localhost", 9999);
            DataOutputStream dataOutputStream = new DataOutputStream(localhost.getOutputStream());
            dataOutputStream.writeUTF("hello server ");
            dataOutputStream.flush();
            dataOutputStream.close();
            localhost.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
