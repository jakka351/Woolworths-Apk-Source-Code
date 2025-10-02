package com.swrve.sdk;

/* loaded from: classes.dex */
public abstract class SwrveSDKBase {

    /* renamed from: a, reason: collision with root package name */
    public static Object f19075a;

    public static void a() {
        if (f19075a != null) {
            return;
        }
        SwrveLogger.d("Please call SwrveSDK.createInstance first in your Application class.", new Object[0]);
        throw new RuntimeException("Please call SwrveSDK.createInstance first in your Application class.");
    }
}
