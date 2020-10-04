#include <jni.h>

JNIEXPORT jstring JNICALL Java_org_emunix_example_MainActivity_helloNdkBuild(JNIEnv *env, jobject this) {
    return (*env)->NewStringUTF(env, "Hello from ndk-build");
}