#include <jni.h>

JNIEXPORT jstring JNICALL Java_org_emunix_example_MainActivity_helloCmake(JNIEnv *env, jobject this) {
    return (*env)->NewStringUTF(env, "Hello from cmake");
}
