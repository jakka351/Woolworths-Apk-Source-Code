package com.airbnb.lottie.utils;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static final LogcatLogger f13477a = new LogcatLogger();

    public static void a() {
        f13477a.getClass();
    }

    public static void b(String str) {
        f13477a.getClass();
        HashSet hashSet = LogcatLogger.f13476a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f13477a.getClass();
        HashSet hashSet = LogcatLogger.f13476a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
