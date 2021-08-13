package javas.networks.demos.sockets.urls;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/8
 * @desc
 */
public class HttpUrlConnectionDemo {
    public static void main(String[] args) throws IOException {
        URL url=new URL("http://www.javatpoint.com/java-tutorial");
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        String requestMethod = urlConnection.getRequestMethod();
        System.out.println("请求方法为:"+requestMethod);
        for (int i = 0; i <8 ; i++) {
            System.out.println(urlConnection.getHeaderFieldKey(i)+"="+urlConnection.getHeaderField(i));
        }
        urlConnection.disconnect();
    }

}
