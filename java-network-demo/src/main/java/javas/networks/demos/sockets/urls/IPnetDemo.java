package javas.networks.demos.sockets.urls;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/8
 * @desc
 */
public class IPnetDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("www.javatpoint.com");
        System.out.println(byName.getHostAddress());
        System.out.println(byName.getHostName());
    }
}
