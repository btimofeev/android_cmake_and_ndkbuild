LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := hello_ndkbuild
LOCAL_SRC_FILES := hello_ndkbuild.c

include $(BUILD_SHARED_LIBRARY)