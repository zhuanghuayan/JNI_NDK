LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    := SXYKT
LOCAL_SRC_FILES := prebuilt/libSXYKT.so

LOCAL_EXPORT_C_INCLUDES := prebuilt/include
include $(PREBUILT_SHARED_LIBRARY)


include $(CLEAR_VARS)
LOCAL_MODULE    := c_lau
LOCAL_SRC_FILES := c_lauguage.c
LOCAL_SHARED_LIBRARIES := libSXYKT

include $(BUILD_SHARED_LIBRARY)




