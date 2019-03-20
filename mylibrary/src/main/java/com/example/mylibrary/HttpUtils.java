package com.example.mylibrary;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * ClassName: HttpUtils<br/>
 * Description: TODO Description. <br/>
 * date: 2019/3/20 14:59<br/>
 *
 * @author jixiang
 * @version V1.0.0
 * @since JDK 1.8
 */
public class HttpUtils {

    public static HttpURLConnection getClient(URL url){
        return new HttpURLConnection(url) {
            @Override
            public void disconnect() {

            }

            @Override
            public boolean usingProxy() {
                return false;
            }

            @Override
            public void connect() throws IOException {

            }
        };
    }
}
