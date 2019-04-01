package com.example.mylibrary1;

import android.os.Parcelable;

/**
 * ClassName: TestUtils<br/>
 * Description: TODO Description. <br/>
 * date: 2019/3/21 17:17<br/>
 *
 * @author jixiang
 * @version V1.0.0
 * @since JDK 1.8
 */
public class TestUtils  {
    private static  TestUtils instance;

    /**
     * 单例模式
     */
    public static TestUtils getInstance(){
        if(instance==null){
            instance=new TestUtils();
        }
        return instance;
    }

    private TestUtils(){}

}
