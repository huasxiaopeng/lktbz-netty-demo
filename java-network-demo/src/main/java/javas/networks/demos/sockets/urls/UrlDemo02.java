package javas.networks.demos.sockets.urls;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/8
 * @desc
 */
public class UrlDemo02 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getProtocol());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getFile());
    }
}
