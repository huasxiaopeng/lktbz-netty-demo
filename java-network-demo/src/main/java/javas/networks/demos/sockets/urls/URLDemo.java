package javas.networks.demos.sockets.urls;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/7
 * @desc
 */
public class URLDemo {
    public static void main(String[] args) throws Exception {
        URL url=new URL("http://www.javatpoint.com/java-tutorial");
        System.out.println("uri:"+url.toURI());
        System.out.println("Host Name: "+url.getHost());
        System.out.println("Port Number: "+url.getPort());
        System.out.println("File Name: "+url.getFile());
        System.out.println("Path Name："+url.getPath());
    }
}
