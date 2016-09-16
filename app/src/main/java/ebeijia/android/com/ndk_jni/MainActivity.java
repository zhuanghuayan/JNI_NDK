package ebeijia.android.com.ndk_jni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
        tv.setText(new MyNDK().add(1,2)+"");
    }
}
/**
 * jni搭建步骤
 *
 *  1.在 gradle.properties 文件添加这句话 android.useDeprecatedNdk=true
 *  2.在 build.gradle 文件添加
 *   defaultConfig {
      ndk {
           moduleName "c_lau" //生成动态库的名字 libc_lau.so(lib+moduleName.so)
           abiFilters "armeabi", "armeabi-v7a", "x86"  //输出指定三种abi体系结构下的so库。目前可有可无。
          }
                   }
    3.在 build.gradle 文件 添加

 buildTypes {
 debug{
 jniDebuggable true//设置可以debug jni
     }
           }
 4. 编写一个类，随便定义 一个native 方法 如 public native int add(int a,int b);
 然后 点击一下make project 会在build/intermediates/classes/debug文件下生成class文件
 然后 在命令行窗户切换到debug这个目录下 输入命令 javah -jni packagename+类名
 如 javah -jni ebeijia.android.com.ndk_jni.MyNDK
 然后 会生成 ebeijia.android.com.ndk_jni.MyNDK.h 文件
 5.在main 文件夹下建立一个 jni文件目录 把 ebeijia.android.com.ndk_jni.MyNDK.h复制进去
 6.在当前jni目录创建 c/cpp文件 把ebeijia.android.com.ndk_jni.MyNDK.h里面的定义的方法复制进去然后实现
 7.注意如果需要debug  设置 jniDebuggable true 然后在 EditConfigurations里面旋转 app-native 最后点击debug按钮
 *
 *
 *
 *
 */