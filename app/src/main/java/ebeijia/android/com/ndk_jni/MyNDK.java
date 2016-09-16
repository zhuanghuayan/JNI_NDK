package ebeijia.android.com.ndk_jni;

/**
 * Created by wuqinghai on 16/9/15.
 */
public class MyNDK {
   static  {
        System.loadLibrary("SXYKT");
        System.loadLibrary("c_lau");
    }
    public native String add(int a,int b);
}
