//
// Created by 吴清海 on 16/9/15.
//

#include "ebeijia_android_com_ndk_jni_MyNDK.h"
#include <stdio.h>

JNIEXPORT jstring JNICALL Java_ebeijia_android_com_ndk_1jni_MyNDK_add
        (JNIEnv * env, jobject obj, jint a, jint b){
     //char * s= (*env)->NewStringUTF(env,"abv");
     jstring ss=Java_com_android_ebeijia_util_Constant_baseUrl(env,obj);
     //printf("%s",ss);
    return ss;
}