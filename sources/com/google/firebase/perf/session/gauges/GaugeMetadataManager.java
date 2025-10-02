package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes.dex */
class GaugeMetadataManager {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f15714a = Runtime.getRuntime();
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;

    static {
        AndroidLogger.e();
    }

    public GaugeMetadataManager(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
