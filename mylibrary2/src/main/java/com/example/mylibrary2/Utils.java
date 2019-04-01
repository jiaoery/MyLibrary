package com.example.mylibrary2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * ClassName: Utils<br/>
 * Description: TODO Description. <br/>
 * date: 2019/4/1 14:54<br/>
 *
 * @author jixiang
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Utils {

    /**
     * 获取versionName
     * @param context
     * @return
     */
    public static String getVersionName(Context context){
        PackageManager packageManager=context.getPackageManager();
        String packageName=context.getPackageName();
        try {
            PackageInfo packageInfo=  packageManager.getPackageInfo(packageName,0);
            String versionMame=packageInfo.versionName;
            return versionMame;
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
            return "";
        }


    }
}
