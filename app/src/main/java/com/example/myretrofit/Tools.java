package com.example.myretrofit;

/**
 * ClassName: Tools<br/>
 * Description: TODO Description. <br/>
 * date: 2019/3/20 11:04<br/>
 *
 * @author jixiang
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Tools {

    private static Tools instance;

    public static Tools getInstance(){
        if(instance==null){
            instance=new Tools();
        }
        return instance;
    }

    private Tools(){

    }
}
