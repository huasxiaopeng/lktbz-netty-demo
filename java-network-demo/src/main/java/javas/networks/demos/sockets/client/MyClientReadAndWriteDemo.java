package javas.networks.demos.sockets.client;

import java.io.*;
import java.net.Socket;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/7
 * @desc 客户端读写Demo
 */
public class MyClientReadAndWriteDemo {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 9999);
        DataInputStream dim=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str.equals("stop")){
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2= dim.readUTF();
            System.out.println("server says:"+str2);
        }
        dout.close();
        s.close();
    }
}
