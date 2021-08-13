package javas.networks.demos.sockets.urls;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/8
 * @desc
 */
public class UrlConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://www.baidu.com");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            int i;
            while((i=inputStream.read())!=-1){
                System.out.println((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
